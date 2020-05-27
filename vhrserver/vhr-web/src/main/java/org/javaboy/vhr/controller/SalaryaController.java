package org.javaboy.vhr.controller;

import com.github.pagehelper.PageInfo;
import org.javaboy.vhr.model.dto.PageDto;
import org.javaboy.vhr.model.dto.Salary;
import org.javaboy.vhr.server.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("Salary")
@CrossOrigin
public class SalaryaController {
    @Autowired
    private SalaryService SalaryService;

    @GetMapping("Salaryad")
    public ArrayList Salary(){
        ArrayList<Salary> list=this.SalaryService.GetSalary();
        return  list;
    }

    @RequestMapping("Salary$Employee")
    public PageInfo<Salary> Salary$Employee(PageDto pagedto){
        return this.SalaryService.Salary$Employee(pagedto);
    }
}
