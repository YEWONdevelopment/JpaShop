package jpabook.jpashop;

import org.apache.tomcat.util.net.TLSClientHelloExtractor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {

		Hello hello = new Hello();
		hello.setData("hello");
		String data = hello.getData();

		SpringApplication.run(JpashopApplication.class, args);
	}

}
