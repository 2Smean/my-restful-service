package org.hi.myrestfulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyRestfulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRestfulServiceApplication.class, args);

		// show bean list
//		ApplicationContext ac
//		String[] AllBeanNames = ac.getBeanDefinitionNames();
//		for (String beanName : AllBeanNames) {
//			System.out.println(beanName);
//		}
	}

}
