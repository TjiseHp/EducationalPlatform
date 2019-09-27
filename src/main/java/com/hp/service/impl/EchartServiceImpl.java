package com.hp.service.impl;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Class;
import com.hp.bean.Credit;
import com.hp.bean.Pay;
import com.hp.dao.EchartDao;
import com.hp.service.EchartService;

@Service
public class EchartServiceImpl implements EchartService{
	
		@Autowired
		private EchartDao echartDao;
	
//		public Map<String,Object> ddd() {
//			// TODO Auto-generated method stub
////	        创建一个集合来接受数据库数据
//			java.util.List<com.hp.bean.Class> xlist = new ArrayList<com.hp.bean.Class>();
////	        /*创建一个map集合来装月份和销量这两个数组*/
//			Map<String,Object> xmap=new HashMap<String,Object>();
////	        /*接受数据*/
//			xlist=echartDao.queryAll();
////	        /*创建装载月销量数组*/
//			int[] xxdata=new int[xlist.size()];
////	        /*创建装载月份数组*/
//			String[] xdata=new String[xlist.size()];
////	        /*定义数组下标*/
//			int i=0;
////	        /*遍历数据库数据*/
//			for (Class class1 : xlist) {
////	            /*将销量放入数组*/
//				xxdata[i]=class1.getClassNum();
////	            /*将月份放入数组*/
//				xdata[i]=class1.getClassKind();
//					i++;
//			}
//			//将两个数组存入集合中
//			xmap.put("classKinf", xdata);
//			xmap.put("classNum", xxdata);
//			return xmap;
//	    }

		public java.util.List<Class> queryAll() {
			// TODO Auto-generated method stub
			return echartDao.queryAll();
		}

		public java.util.List<Credit> queryCreditEchart(Integer uId) {
			// TODO Auto-generated method stub
			return echartDao.queryCreditEchart(uId);
		}

		public java.util.List<Credit> queryCreditPayEchart(Integer uId) {
			// TODO Auto-generated method stub
			return echartDao.queryCreditPayEchart(uId);
		}

		public java.util.List<Pay> queryComplatePay() {
			// TODO Auto-generated method stub
			return echartDao.queryComplatePay();
		}

		public java.util.List<Credit> queryCreditPayByThingEchart(Integer uId) {
			// TODO Auto-generated method stub
			return echartDao.queryCreditPayByThingEchart(uId);
		}

}
