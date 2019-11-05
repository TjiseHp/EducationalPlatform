package com.hp.service;
import java.util.List;
public interface UtilService {
	
	public List<String> queryEmailOnly2(String email);
	
	public int queryEmailOnly(String email);
	
	public int queryEmailCount();
	
	public int insertEmail(String email);
	
}
