package org.javaboy.vhr.server.impl;



import org.javaboy.vhr.mapper.dao.EmployeeDao;
import org.javaboy.vhr.model.Employee;
import org.javaboy.vhr.model.dto.statisticsregionDto;
import org.javaboy.vhr.model.dto.synthesize;
import org.javaboy.vhr.server.EmployeeServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * wgz
 * 综合统计
 */
@Service
public class EmployeeServerImpl implements EmployeeServer {
    @Autowired
    private EmployeeDao employee;

    /**
     * wgz
     * 综合统计
     */
    @Override
    public ArrayList<synthesize> statistics() {
        return this.employee.statistics();
    }

    @Override
    public ArrayList<statisticsregionDto> statisticsregion() {
        return this.employee.statisticsregion();
    }

    @Override
    public ArrayList<statisticsregionDto> education() {
        return this.employee.education();
    }

    @Override
    public ArrayList<statisticsregionDto> major() {
        return this.employee.major();
    }
}
