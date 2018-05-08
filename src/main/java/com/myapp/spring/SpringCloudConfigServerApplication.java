package com.myapp.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

// https://pastebin.com/MLmkU92v
// added somethings
// Added New Things One More Change
// Added Some More dkjdkjdk
@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
