package com.utilcollectiondi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.utilcollectiondi.beans.JobSheet;

public class UtilTest {

	public static void main(String[] args) {
		BeanFactory beanfactory=new XmlBeanFactory(
				new ClassPathResource("com/utilcollectiondi/common/application-context.xml"));
		JobSheet jobsheet=beanfactory.getBean("jobsheet",JobSheet.class);
		System.out.println(jobsheet);
		

	}

}
