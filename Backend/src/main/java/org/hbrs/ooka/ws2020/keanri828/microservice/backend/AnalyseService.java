package org.hbrs.ooka.ws2020.keanri828.microservice.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AnalyseService {

    @Autowired
    @LoadBalanced
    protected RestTemplate restTemplate;
    
    protected String serviceUrl;
    
    public AnalyseService(String serviceUrl) {
        this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl : "http://" + serviceUrl;
    }

}
