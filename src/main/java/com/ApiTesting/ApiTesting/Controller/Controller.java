package com.ApiTesting.ApiTesting.Controller;

import com.ApiTesting.ApiTesting.Bean.User;
import com.ApiTesting.ApiTesting.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Service service;

    @Autowired
    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/")
    public ResponseEntity<User> getData(){
        return new ResponseEntity<>(service.getResponse().getStatusCode());
    }
}
