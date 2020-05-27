package org.javaboy.vhr.server.impl;



import org.javaboy.vhr.mapper.dao.EmployeeecDao;
import org.javaboy.vhr.model.Employeeec;
import org.javaboy.vhr.server.EmployeeecServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeecServerImpl implements EmployeeecServer {

    @Autowired
    private EmployeeecDao dao;

    @Override
    public List<Employeeec> getByIdEmployeeec(Integer eid) {

        return this.dao.GetByIdEmployeeec(eid);
    }
}
