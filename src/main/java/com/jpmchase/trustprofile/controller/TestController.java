package com.jpmchase.trustprofile.controller;

import com.jpmchase.trustprofile.model.Test;
import com.jpmchase.trustprofile.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class TestController {

    @Autowired
    private TestRepository testRepository;

    @RequestMapping("/")
    public String index(){
        return "Greeting from spring Boot!";
    }

    @RequestMapping("/get")
    public List<Test> getAllTest(){
        List<Test> list = new ArrayList<>();
        list= testRepository.findAll();
        return list;
    }
}
