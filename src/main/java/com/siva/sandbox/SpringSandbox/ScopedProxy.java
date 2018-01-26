package com.siva.sandbox.SpringSandbox;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopedProxy {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context1.xml");
		SimpleProcessor simpleProcessor = context.getBean(SimpleProcessor.class);
		
		SimpleProcess simpleProcess = simpleProcessor.getSimpleProcess();
		simpleProcess.increment();
		System.out.println(simpleProcess.getCount());
		simpleProcess.increment();
		System.out.println(simpleProcess.getCount());
		
		SimpleProcess simpleProcess1 = simpleProcessor.getSimpleProcess();
		System.out.println(simpleProcess1.getCount());
	}
}
