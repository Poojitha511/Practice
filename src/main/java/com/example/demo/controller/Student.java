package com.example.demo.controller;

import com.example.demo.entity.Dept;
import com.example.demo.service.DeptServiceInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class Student {

    @Autowired
     private DeptServiceInterface deptServiceInterface;


    @GetMapping("/list")
    public List<Dept> fetchDept(){
        log.info("we are in controller and in fetchDept method now");
        return deptServiceInterface.fetchData();
    }

    @PostMapping("/dept")
    public Dept saveDept(@RequestBody Dept dept){
        log.info("we are in controller and in saveDept method now");
        return deptServiceInterface.saveDept(dept);
    }

    @GetMapping("/list/deptName/{deptName}")
    public Dept fetchDeptName(@PathVariable("deptName") String deptName){
        return deptServiceInterface.fetchDeptName(deptName);
    }
}

