package org.javaboy.vhr.mapper.dao;

import org.apache.ibatis.annotations.Select;
import org.javaboy.vhr.model.Employee;
import org.javaboy.vhr.model.dto.SalaryEmpDto;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;

public interface SalaryEmpDao extends Mapper<Employee> {

    @Select("select id,name from employee where id not in (select e.id from employee e,salary s where s.eid=e.id)")
    ArrayList<SalaryEmpDto> getSalaryEmpadd();
}
