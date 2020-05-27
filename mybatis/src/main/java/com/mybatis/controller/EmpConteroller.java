package com.mybatis.controller;

import com.mybatis.model.EmpModel;
import com.mybatis.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class EmpConteroller {
    @Autowired
    private EmpService empService;

    @RequestMapping("getEmpById")
    public EmpModel getEmpById(Integer id) {
        return this.empService.getEmpById(id);
    }

    @RequestMapping("findempdept")
    public List<EmpModel> findempdept(Integer id){
        return this.empService.findempdept(id);
    }

    @RequestMapping("examlike")
    public List<EmpModel> examlike(String name){return  this.empService.examlike(name);}
}
