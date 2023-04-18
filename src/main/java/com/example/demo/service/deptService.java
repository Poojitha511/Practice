package com.example.demo.service;

import com.example.demo.entity.Dept;
import com.example.demo.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class deptService implements DeptServiceInterface {

    @Autowired
    private DepartmentRepository departmentRepository;
    public Dept saveDept(Dept dept){
        log.info("we are in Service and in saveDept method now");
        return departmentRepository.save(dept);
    }

    public List<Dept> fetchData() {
        log.info("we are in Service and in FetchDept method now");
        return departmentRepository.findAll();
    }


    public Dept fetchDeptName(String deptName) {
        return departmentRepository.findByDeptName(deptName);
    }


}
