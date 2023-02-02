package com.ApiTesting.ApiTesting.Service;


import com.ApiTesting.ApiTesting.Bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private  RestTemplate restTemplate;

    private final String url = "https://coreuat-zwqcqy3qmq-el.a.run.app/user/getuserprofile?id";
    private final String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpdHBsIiwiYXVkaWVuY2UiOiJ3ZWIiLCJjcmVhdGVkIjoxNjc1MzI1OTc4NDU3LCJleHAiOjE2NzUzMjc3Nzh9.Y0XUvxzB6eebypyLm_ZEqU6Cx0NQty9t8y25VIdnJS_MrxhWsWwNoQQrgG2dB6NaBs1GKhj5teP_2y7awzgyFA";

    public ResponseEntity<String> getResponse() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization","" + token);

        HttpEntity<User> entity = new HttpEntity<>(null, headers);

        return restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
    }


//      public String getData(){
//          return restTemplate.getForObject("https://dummyjson.com/products/1",String.class);
//      }


}
