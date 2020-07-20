package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

//https://config-3344.com:3344/application-dev.yml
//uri: https://github.com/chaonongtiancai/microservicecloud-config.git
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp {

	 public static void main(String[] args){
	   SpringApplication.run(Config_3344_StartSpringCloudApp.class,args);
	  }

}
