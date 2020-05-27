package org.javaboy.vhr.mapper;

import org.apache.ibatis.annotations.Param;
import org.javaboy.vhr.model.Employee;
import org.javaboy.vhr.model.Employeeec;

import java.util.Date;
import java.util.List;

public interface EmployeeecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeec record);

    int insertSelective(Employeeec record);

    Employeeec selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeeec record);

    int updateByPrimaryKey(Employeeec record);

    List getEmployeec(@Param("name") String name, @Param("page") Integer page, @Param("size") Integer size);

    Long getTotal(@Param("empc") Employeeec employeeec);
    List getEmployeec$emp$dept();
}
