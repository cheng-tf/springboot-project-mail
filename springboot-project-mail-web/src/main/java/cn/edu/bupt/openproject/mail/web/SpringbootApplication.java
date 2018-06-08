package cn.edu.bupt.openproject.mail.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 启动类
 * 创建者 科帮网 https://blog.52itstyle.com
 * 创建时间	2017年7月19日
 * API: http://localhost:8080/springboot_mail/swagger-ui.html
 */
@SpringBootApplication
@ImportResource({"classpath:spring-context-dubbo.xml","classpath:spring-context-task.xml"})
public class SpringbootApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);
	
	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(SpringbootApplication.class, args);
		logger.info("邮件服务项目启动 ");
	}
}