package com.hp.test;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hp.service.UtilService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-context.xml"})
public class MapperTest {

	/*
	@Autowired
	public UtilService utilService;
	

	public String getRandom() {
		String result = "";
		while (result.length() < 10) {
			String str = String.valueOf((int) (Math.random() * 10));
			if (result.indexOf(str) == -1) {
				result += str;
			}
		}
		return result;
	}

	@Test
	public void test() {
		for(int count=0 ;count<=200;) {
			String randomEmail = getRandom()+"@qq.com";
			if (utilService.queryEmailOnly(randomEmail)==0) {
				utilService.insertEmail(randomEmail);
				count++;
			}
		}
	}
	*/
	
}
