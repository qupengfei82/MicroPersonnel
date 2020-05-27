package com.mybatis.dao;

import com.mybatis.model.EmpModel;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface EmpDao extends Mapper<EmpModel> {

    @Select("select e.*,d.id deptid,d.name dname from emp e,dept d where e.did=d.id and d.id=#{id}")
    @Results(id = "EmpMap",value = {
            @Result(column = "deptid",property = "dept.id" ),
            @Result(column = "dname",property = "dept.name" ),
    })
    List<EmpModel> findempdept(Integer id);
}
