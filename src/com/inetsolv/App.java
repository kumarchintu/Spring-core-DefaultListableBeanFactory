package com.inetsolv;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class App {

	public static void main(String[] args) {
		DefaultListableBeanFactory container=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(container);
		reader.loadBeanDefinitions("spring.xml");
		Object obj=container.getBean("person");
		Person p=(Person)obj;
		p.Display();
	}
}