package com.pack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		//hello.xml is present inside src/main/resourses
		Resource res=new ClassPathResource("hello.xml");
		//Resource res=new FileSystemResource("hello.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		//ApplicationContext factory=new
	Employee e=(Employee)factory.getBean("emp");
		//instantiate the bean with id emp and perform DI
		System.out.println(e.getId()+" "+e.getName()+" "+e.getAddress());
		System.out.println(e);

	}

}
