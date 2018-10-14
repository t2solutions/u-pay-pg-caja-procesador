package com.upayment.camel;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("com.upayment.camel")
public class SpringBootCamelCxfApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCamelCxfApplication.class, args);
	}

	/*
	@Bean
	public ServletRegistrationBean camelServletRegistrationBean() {
		ServletRegistrationBean registration = new ServletRegistrationBean(new CamelHttpTransportServlet(), "/nexus/*");
		registration.setName("CamelServlet");
		return registration;
	}
	*/
}
