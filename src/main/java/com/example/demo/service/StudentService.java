package com.example.demo.service;

import com.example.demo.controllers.PageController;
import org.apache.tomcat.util.net.TLSClientHelloExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.transaction.HeuristicCommitException;

public class StudentService {
    @Autowired
    RestTemplate restTemplate;
    String fooResourceUrl = "http://localhost:8081/";
    /*ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl + "/1", String.class);
    String foo = restTemplate.getForObject(fooResourceUrl + "/1", String.class);

    HttpHeaders httpHeaders = restTemplate.headForHeaders(fooResourceUrl);

    String fee = restTemplate.postForObject(fooResourceUrl, request, String.class);
*/
    HttpEntity<String> request = new HttpEntity<>( ("bar"));
    ResponseEntity<String> response = restTemplate.exchange(fooResourceUrl, HttpMethod.POST, request, String.class);
    ResponseEntity<String> response2 = restTemplate.exchange(fooResourceUrl, HttpMethod.GET, request, String.class);



}
//add S
//update S
//delete S
//get S