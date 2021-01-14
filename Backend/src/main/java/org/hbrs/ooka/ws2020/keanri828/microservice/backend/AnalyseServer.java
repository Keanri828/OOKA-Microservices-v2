package org.hbrs.ooka.ws2020.keanri828.microservice.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@EnableDiscoveryClient
@Import(BackendApplication.class)
public class AnalyseServer {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "analyse-server");
        SpringApplication.run(AnalyseServer.class, args);
    }
}
