package com.yellowzp.blogmanageserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class BlogManageServerApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BlogManageServerApplication.class, args);
		Environment env = context.getEnvironment();
		String port = env.getProperty("server.port");
		String contextPath = env.getProperty("server.servlet.context-path");
		System.out.println("server url: http://localhost:" + port + contextPath);
	}

}
