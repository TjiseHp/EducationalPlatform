package com.hp.controller;
import java.io.File;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.hp.bean.Check_list;
import com.hp.service.FileService;

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
    public String upload(MultipartFile file,HttpServletRequest request) throws IOException{
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
//      int row = fileService
        return fileName2;  
    }  
	
}
