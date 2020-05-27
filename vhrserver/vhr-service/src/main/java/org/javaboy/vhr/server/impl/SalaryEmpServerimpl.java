package org.javaboy.vhr.server.impl;

import org.javaboy.vhr.mapper.dao.SalaryEmpDao;
import org.javaboy.vhr.model.dto.SalaryEmpDto;
import org.javaboy.vhr.server.SalaryEmpServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SalaryEmpServerimpl implements SalaryEmpServer {

    @Autowired
    private SalaryEmpDao dao;
    @Override
    public ArrayList<SalaryEmpDto> getSalaryEmpadd() {
        return this.dao.getSalaryEmpadd();
    }
}
