package com.test;

import com.test.bean.TestBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		AbstractApplicationContext app = new ClassPathXmlApplicationContext("test.xml");
//		MyBean myBean  = (MyBean) app.getBean("myBean");
////		System.out.println(myBean.getName());
		TestBean bean = (TestBean) app.getBean("testBean");
		System.out.println(bean);
		System.out.println("张飒");
	}
}
