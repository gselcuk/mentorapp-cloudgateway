package com.obss.mentor.cloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MentorCloudGateway {

  public static void main(String[] args) {
    SpringApplication.run(MentorCloudGateway.class, args);
  }

}
