package org.javaboy.vhr.server;

import org.javaboy.vhr.model.Employeeec;

import java.util.List;

public interface EmployeeecServer {
    public List<Employeeec> getByIdEmployeeec(Integer eid);
}
