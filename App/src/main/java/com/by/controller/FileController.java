package com.by.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {

	/**
	 * �ļ��ϴ�����
	 */
	@RequestMapping(value="/upload")
	@ResponseBody
	public void upload(MultipartFile file,HttpServletRequest request)throws IOException{
		String path = request.getSession().getServletContext().getRealPath("upload");  
		String fileName = file.getOriginalFilename();
		File dir = new File(path,fileName);
		if(!dir.exists()){  
            dir.mkdirs();  
        }
		file.transferTo(dir);
	}
	
	/**
	 * �ļ����ع���
	 */
	public void down(HttpServletRequest request,HttpServletResponse response) throws Exception{
		 //ģ���ļ���myfile.txtΪ��Ҫ���ص��ļ�  
        String fileName = request.getSession().getServletContext().getRealPath("upload")+"/myfile.txt";
      //��ȡ������  
        InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)));
      //���������������صĻ�  
        String filename = "�����ļ�.txt";
      //ת�룬����ļ�����������  
        filename = URLEncoder.encode(filename,"UTF-8");
      //�����ļ�����ͷ  
        response.addHeader("Content-Disposition", "attachment;filename=" + filename);
        //1.�����ļ�ContentType���ͣ��������ã����Զ��ж������ļ�����    
        response.setContentType("multipart/form-data");
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());  
        int len = 0;
        while((len = bis.read()) != -1){  
            out.write(len);  
            out.flush();  
        }  
        out.close();       
	}
}