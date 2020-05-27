package org.javaboy.vhr.mapper.dao;

import org.apache.ibatis.annotations.Select;
import org.javaboy.vhr.model.Salary;
import org.javaboy.vhr.model.dto.EmpSalDeptDto;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface EmpSalDeptDao extends Mapper<Salary> {

    @Select("select s.*,e.name,e.email,e.phone,d.name dname from employee e,department d,salary s where d.id=e.departmentId and s.eid=e.id ")
    public List<EmpSalDeptDto> findEmpSal(Integer page,Integer pageSize);
}
