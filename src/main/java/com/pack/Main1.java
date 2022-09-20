package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		ApplicationContext context=new FileSystemXmlApplicationContext("bean.xml");
		Student st=(Student) context.getBean("stu1");
		//System.out.println(st.getSid()+" "+st.getSname()+" "+st.getMark());
		System.out.println(st);

	}

}
