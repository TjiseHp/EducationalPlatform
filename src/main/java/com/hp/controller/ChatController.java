package com.hp.controller;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hp.bean.Chat;
import com.hp.bean.User;
import com.hp.service.ChatService;
import com.hp.service.CreditService;
import com.hp.service.UserService;

@Controller
@RequestMapping("/chat")
public class ChatController {
	@Autowired
    public ChatService chatService;
	
	@Autowired
	public UserService userService;
	
	@Autowired
	public CreditService creditService;
	
	//学生消息中心页面跳转--收件箱
	@RequestMapping("/stuMessageCenter")
	public ModelAndView stuMessageCenter(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "chat/stuMessageCenter.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	//查询收件箱消息列表
	@ResponseBody
	@RequestMapping("/queryAllReceiveInfoByuId")
	public List<Chat> queryAllReceiveInfoByuId(HttpServletRequest httpServletReques,@RequestParam(required = true,value = "uId") Integer uId2) {
		System.out.println("###查询收件箱消息列表###");
		List<Chat> ReceiveInfo = chatService.queryAllReceiveInfoByuId(uId2);	
		System.out.println(uId2);
		for(Chat text1 : ReceiveInfo) {
			System.out.println(text1.getChatDate());
			String text=text1.getChatText();
			if(text.length()<=12) {
				text1.setChatText(text);
				continue;
			}
			String showText=text.substring(0,12);
			text1.setChatText(showText+"……");
			
		}
		return ReceiveInfo;
	}
	
	
	//删除信息
		@ResponseBody
		@RequestMapping("/deleteChatInfo")
		public String deleteChatInfo(Chat chat) {
			System.out.println("deleteChatInfo:"+chat.getChatNum());
			JSONObject json = new JSONObject();
			int row = chatService.deleteByPrimaryKey(chat.getChatNum());
			System.out.println("删除了"+row+"行数据");
			if (row==1) {
				json.put("result", true);
			}else {
				json.put("result", false);
			}
			return json.toString();
		}
		
		//查看收件箱信息页面跳转
		@RequestMapping("/showReceiveInfo")
		public ModelAndView showReceiveInfo(HttpServletRequest httpServletRequest,@RequestParam(required = true,value = "chatNum") Integer chatNum) {
			HttpSession httpSession = httpServletRequest.getSession();		
			Chat chat = chatService.queryChatByChatNum(chatNum);
			chat.setUser1(userService.queryStudentByuId(chat.getuId()));
			chat.setUser2(userService.queryStudentByuId(chat.getuId2()));
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("httpSession",httpSession);
			modelAndView.addObject("chat",chat);
			modelAndView.addObject("mainPage", "chat/showReceiveInfo.jsp");
			modelAndView.setViewName("main");
			return modelAndView;
		}
	
	//回复界面跳转
	@RequestMapping("/chatInfo")
	public ModelAndView chatInfo(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "chat/chatInfo.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//回复发件人信息
	@RequestMapping(value = "/doInsertChatInfo",produces = {"text/html;charset=utf-8"})
	public String doInsertChatInfo(Chat chat,HttpSession httpSession)  {
		return "redirect: Inbox";
	}
	
	
	
	  //页面跳转--发件箱
		@RequestMapping("/Inbox")
		public ModelAndView Inbox(HttpServletRequest httpServletRequest) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("mainPage", "chat/Inbox.jsp");
			modelAndView.setViewName("main");
			return modelAndView;
		}
		//查询发件箱消息列表
		@ResponseBody
		@RequestMapping("/queryAllSendInfoByuId")
		public List<Chat> queryAllSendInfoByuId(HttpServletRequest httpServletRequest,@RequestParam(required = true,value = "uId") Integer uId) {
			System.out.println("***查询发件箱消息列表***");
			User user=userService.queryStudentByuId(uId);
			
			List<Chat> sendInfo = chatService.queryChatListByuId(uId);
			
			System.out.println(uId);
			for(Chat text1 : sendInfo) {
				String text=text1.getChatText();
				if(text.length()<=12) {
					text1.setChatText(text);
				}else {
					String showText=text.substring(0,12);
					text1.setChatText(showText+"……");
				}								
				text1.setUser2(userService.queryStudentByuId(text1.getuId2()));
				System.out.println(text1.getuId2()+" "+text1.getUser2().getuName());
			}
			return sendInfo;
		}
		
		
		//新建信息页面跳转
		@RequestMapping("/createMessage")
		public ModelAndView createMessage(HttpServletRequest httpServletRequest) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("mainPage", "chat/createMessage.jsp");
			modelAndView.setViewName("main");
			return modelAndView;
		}
		
		//查看发件信息页面跳转
		@RequestMapping("/showSendInfo")
		public ModelAndView showSendInfo(HttpServletRequest httpServletRequest) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("mainPage", "chat/showSendInfo.jsp");
			modelAndView.setViewName("main");
			return modelAndView;
		}
		
		
		
		@ResponseBody
		@RequestMapping("/docheck")
		public String docheck(HttpSession session,
				HttpServletRequest request) {
			JSONObject json = new JSONObject();
			String uId2 = request.getParameter("uId");
			String uEmail = request.getParameter("uEmail");
			String chatText = request.getParameter("chatText");
			System.out.println(uId2+" "+uEmail+" "+chatText);
			if(uId2.equals("") || uId2==null || uEmail.equals("") || uEmail==null || chatText.equals("") || chatText==null) {
				json.put("result", 1);
				return json.toString();
			}
			Integer uId = Integer.valueOf(uId2);
			System.out.println("uId:"+uId);
			User user=userService.queryStudentByuId(uId);
	        Date date = new Date();
	        Timestamp timestamp = new Timestamp(date.getTime());
			if(user.getgNum()==1) {
				String credit = creditService.queryCreditSum(user.getuId());
				if (credit==null||credit.equals("")) {
					credit="0";
				}
				int a = Integer.valueOf(credit);
				System.out.println("积分："+a);
				if(a<200) {
					json.put("result", 2);
					return json.toString();	       
				}			
			}
			
	        User user1=userService.queryUserByEmail(uEmail);
	        if(user1==null) {
				json.put("result", 3);
				return json.toString();
	        }else {
	        	Chat chat=new Chat();
	        	chat.setuId2(user1.getuId());
	        	chat.setuId(uId);
	        	chat.setcSNum(1);
	        	chat.setChatText(chatText);
	        	chat.setChatDate(timestamp);
	        	int row = chatService.insertSelective(chat);
	        	if(row!=1) {
	        		json.put("result", 1);
					return json.toString();
	        	}
	        }
	        json.put("result", 0);
			return json.toString();
		}
	
	

}
