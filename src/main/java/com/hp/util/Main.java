package com.hp.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.hp.bean.User;

import redis.clients.jedis.Jedis;

public class Main {

	/*
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int max = 0;
		int count=0;
		int [] a = new int [num];
		int [] b = new int [num];
		for(int i=0;i<num;i++) {
			a[i]=in.nextInt();
			b[i]=0;
		}
		
		for(int i=num-1;i>0;i--) {
			for(int j=i-1;j>=0;j--) {
				if (a[j]>=a[i]) {
					b[j]++;
					break;
				}
			}
		}
		
		for(int i=0;i<num;i++) {
			if (b[i]!=0 && b[i]>=count) {
				count=b[i];
				max=a[i];
			}
		}
		System.out.println(max);
		in.close();
	}
	*/
	/*
	public static void main(String[] args) throws Exception {
		User user = new User();
		user.setuId(1);
		user.setuName("序列化测试用户");
		user.setuEmail("123456@qq.com");
		
		byte[] testByte = ProtostuffUtils.serialize(user);
		System.out.println("testByte: "+testByte);
		
		User user2 = ProtostuffUtils.deserialize(testByte,User.class);
		System.out.println(user2.getuId()+" "+user2.getuName()+" "+user2.getuEmail());
	}
	*/
	/*
	public static void main(String[] args) throws Exception {
		User user = new User();
		user.setuId(1);
		user.setuName("序列化测试用户1");
		User user2 = new User();
		user2.setuId(2);
		user2.setuName("序列化测试用户2");
		User user3 = new User();
		user3.setuId(3);
		user3.setuName("序列化测试用户3");
		List<User> list = new ArrayList<User>();
		list.add(user);
		list.add(user2);
		list.add(user3);
		
		SerializeDeserializeWrapper<List<User>> wrapper = SerializeDeserializeWrapper.builder(list);
		byte[] testByte = ProtostuffUtils2.serialize(wrapper);
		System.out.println("testByte: "+testByte);
		
		SerializeDeserializeWrapper<List<User>> wrapper2 = ProtostuffUtils2.deserialize(testByte, SerializeDeserializeWrapper.class);
		List<User> list2 = wrapper2.getData();
		System.out.println(list2.get(1).getuName());
	}
	*/
	public static void main(String[] args) throws Exception {
		User user = new User();
		user.setuId(1);
		user.setuName("序列化测试用户1");
		User user2 = new User();
		user2.setuId(2);
		user2.setuName("序列化测试用户2");
		User user3 = new User();
		user3.setuId(3);
		user3.setuName("序列化测试用户3");
		List<User> list = new ArrayList<User>();
		list.add(user);
		list.add(user2);
		list.add(user3);
		
		SerializeDeserializeWrapper<List<User>> wrapper = SerializeDeserializeWrapper.builder(list);
		byte[] testByte = ProtostuffUtils2.serialize(wrapper);
		System.out.println("testByte: "+testByte);
		
		Jedis jedis = new Jedis("127.0.0.1",6379);
		System.out.println(jedis.ping());
		jedis.set("stuList".getBytes(), testByte);
		jedis.expire("stuList".getBytes(), 3600);
		
		byte[] testByte2 = jedis.get("stuList".getBytes());
		
		SerializeDeserializeWrapper<List<User>> wrapper2 = ProtostuffUtils2.deserialize(testByte2, SerializeDeserializeWrapper.class);
		List<User> list2 = wrapper2.getData();
		System.out.println(list2.get(1).getuName());
	}
	
}
