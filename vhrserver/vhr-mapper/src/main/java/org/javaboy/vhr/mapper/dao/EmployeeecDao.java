package org.javaboy.vhr.mapper.dao;



import org.apache.ibatis.annotations.Select;
import org.javaboy.vhr.model.Employeeec;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface EmployeeecDao extends Mapper<Employeeec> {

    @Select("select * from employeeec where eid=#{eid}")
    List<Employeeec> GetByIdEmployeeec(Integer eid);
}
