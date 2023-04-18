package com.example.demo.service;

import com.example.demo.entity.Dept;

import java.util.List;

public interface DeptServiceInterface{
    Dept saveDept(Dept dept);

    List<Dept> fetchData();

    Dept fetchDeptName(String deptName);
}
