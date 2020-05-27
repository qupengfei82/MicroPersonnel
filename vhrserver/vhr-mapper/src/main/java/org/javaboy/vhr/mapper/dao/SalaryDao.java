package org.javaboy.vhr.mapper.dao;


import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.javaboy.vhr.model.Employee;
import org.javaboy.vhr.model.dto.Salary;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;

public interface SalaryDao extends Mapper<Employee > {

    @Select("select t.*,a.name from salary t,employee a where t.eid=a.id")
    ArrayList<Salary> GetSalary();
}
