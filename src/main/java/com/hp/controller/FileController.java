package com.hp.controller;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.hp.bean.Check_list;
import com.hp.bean.User;
import com.hp.service.FileService;
import com.hp.service.UserService;

/***
 * 	本类为IO流控制器，请勿编辑
 * @author ThinkPad
 *
 */
@Controller
@RequestMapping("/file")
public class FileController {
	
	@Autowired
	public FileService fileService;
	
	@Autowired
	public UserService userService;
	
	
	
	//文件上传测试页跳转
	@RequestMapping("/uploadTest")
	public ModelAndView uploadTest() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "file/uploadTest.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//IO流上传测试功能
	@ResponseBody
	@RequestMapping(value="/upload",method=RequestMethod.POST)
    public String upload(
    		MultipartFile file,
    		HttpServletRequest request,
    		@RequestParam(required = true,value = "uId") Integer uId) throws IOException{
        String path = request.getSession().getServletContext().getRealPath("uploadFile");
        System.out.println("上传文件路径："+path);
        String fileName = file.getOriginalFilename();
        int listId = fileService.queryMaxListId()+1;
        String fileName2 = listId+fileName.substring(fileName.lastIndexOf('.'));
        System.out.println("上传文件名："+fileName2);
        File dir = new File(path,fileName2);
        if(!dir.exists()){
            dir.mkdirs();
        }
        file.transferTo(dir);
        Check_list check_list = new Check_list();
        check_list.setListId(listId);
        check_list.setListName(fileName2);
        check_list.setuId(uId);
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        check_list.setListSTime(timestamp);
        int row = fileService.insertSelective(check_list);
        System.out.println("insert  "+row);
        return fileName2;
    }  
	
	//文件列表跳转
	@RequestMapping("fileList")
	public ModelAndView fileList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "file/fileList.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//文件列表
	@ResponseBody
	@RequestMapping("fileListTable")
	public List<Check_list> fileListTable() {
		List<Check_list> check_lists = fileService.queryCheckList();
		return check_lists;
	}

	//文件审核页跳转
	@RequestMapping("fileCheck")
	public ModelAndView fileCheck(Check_list check_list,HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();

		Check_list check_list2 = new Check_list();
		check_list2 = fileService.queryCheckListBylistName(check_list);
//		String tool = "/";
//		String nameString = check_list.getListName();
//		String nameString2 = tool.concat(nameString);
//		String path = request.getSession().getServletContext().getRealPath("uploadFile");
//		String listName = path.concat(nameString2);
//		String listName2 = listName.replace("\\", "/");
//		Check_list check_list2 = new Check_list();
//		if(check_list.getListName().length()<10) {
//			check_list2 = fileService.queryCheckListBylistName(check_list);
//			check_list2.setListName(listName2);
//			fileService.updateByPrimaryKeySelective(check_list2);
//		}else {
//			check_list2 =  fileService.queryCheckListBylistName(check_list);
//		}		
//		
		modelAndView.addObject("check_list", check_list2);
		modelAndView.addObject("mainPage", "file/fileCheck.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//审核通过
	@ResponseBody
	@RequestMapping("fileCheckYes")
	public String fileCheckYes(Check_list check_list) {
		Check_list check_list2 = fileService.queryCheckListBylistName(check_list);
		java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
		check_list2.setListETime(currentDate);
		check_list2.setuId2(check_list.getuId2());
		fileService.updateByPrimaryKeySelective(check_list2);
		User user = userService.queryTeacherByuId(check_list2.getuId2());
		user.setCheckNum(2);
		userService.updateByPrimaryKeySelective(user);
		JSONObject json = new JSONObject();
		if (check_list2.getListName()!=null) {
			json.put("result", true);
		}else {
			json.put("result", false);
		}
		return json.toString();
	}
	
	//审核通过
	@ResponseBody
	@RequestMapping("fileCheckNo")
	public String fileCheckNo(Check_list check_list) {
		Check_list check_list2 = fileService.queryCheckListBylistName(check_list);
		java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
		check_list2.setListETime(currentDate);
		check_list2.setuId2(check_list.getuId2());
		System.out.println(check_list2.getuId2());
		fileService.updateByPrimaryKeySelective(check_list2);
		User user = userService.queryTeacherByuId(check_list2.getuId2());
		user.setCheckNum(1);
		System.out.println(user.getuName()+user.getuId()+" wdnmd "+user.getCheckNum());
		userService.updateByPrimaryKeySelective(user);
		JSONObject json = new JSONObject();
		if (check_list2.getListName()!=null) {
			json.put("result", true);
		}else {
			json.put("result", false);
		}
		return json.toString();
	}
}
