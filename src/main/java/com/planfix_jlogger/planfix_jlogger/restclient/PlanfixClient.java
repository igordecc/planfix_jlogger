package com.planfix_jlogger.planfix_jlogger.restclient;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.SocketUtils;
import org.springframework.web.client.RestTemplate;

public class PlanfixClient {
    
    public static String loggin() {
        String uri = "https://apiru.planfix.ru/xml";
        RestTemplate restTemplate = new RestTemplate();
        
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/xml");
        headers.add("Content-Type", "application/xml");
        String encodedAuth = new String(Base64.encodeBase64("tokenAPI:TOKEN".getBytes()));
        headers.add("Authorization", String.format("Basic %s", encodedAuth));
        headers.setContentType(MediaType.APPLICATION_XML);

        String body = "<request method=\"project.getList\">"+
        "<account>cgko64</account>"+
      "</request>";
        
        HttpEntity<String> request = new HttpEntity<String>(body, headers);

        System.out.println(request);

        String result = restTemplate.postForObject(uri, request, String.class);

        return result;
    }
}
