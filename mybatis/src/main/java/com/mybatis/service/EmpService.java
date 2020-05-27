package com.mybatis.service;

import com.mybatis.model.EmpModel;

import java.util.List;

public interface EmpService {
    public EmpModel getEmpById(Integer id);
    public List<EmpModel> findempdept(Integer id);
    public List<EmpModel> examlike(String name);
}
