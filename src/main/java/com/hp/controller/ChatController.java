package com.hp.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hp.bean.Chat;
import com.hp.bean.User;
import com.hp.service.ChatService;
import com.hp.service.UserService;

@Controller
@RequestMapping("/chat")
public class ChatController {
	@Autowired
    public ChatService chatService;
	
	@Autowired
	public UserService userService;
	
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
	public List<Chat> queryAllReceiveInfoByuId(HttpServletRequest httpServletRequest,Chat chat,@RequestParam(required = true,value = "uId") Integer uId2) {
		System.out.println("1888");
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
	
	//插入聊天信息
//	@RequestMapping("/doInsertChatInfo")
//	public String doInsertChatInfo(Chat chat,HttpSession httpSession) throws ParseException {
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//        String date=df.format(new Date());// new Date()为获取当前系统时间
//        Date date1 = df.parse(date);
//        System.out.println("系统当前时间"+date1);
//		chat.setChatDate(date1);
//		
//		
////		chatService.insertSelective(chat);
//		return "redirect: Inbox";
//	}
	
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
		public List<Chat> queryAllSendInfoByuId(HttpServletRequest httpServletRequest,Chat chat,@RequestParam(required = true,value = "uId") Integer uId2) {
			System.out.println("查询发件箱消息列表");
			List<Chat> ReceiveInfo = chatService.queryAllReceiveInfoByuId(uId2);
			System.out.println(uId2);
			for(Chat text1 : ReceiveInfo) {
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
	
	

}
