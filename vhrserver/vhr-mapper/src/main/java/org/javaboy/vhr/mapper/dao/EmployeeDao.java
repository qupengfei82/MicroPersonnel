package org.javaboy.vhr.mapper.dao;


import org.apache.ibatis.annotations.Select;
import org.javaboy.vhr.model.Employee;
import org.javaboy.vhr.model.dto.statisticsregionDto;
import org.javaboy.vhr.model.dto.synthesize;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeDao extends Mapper<Employee> {
    @Select("SELECT z1.value,name FROM department d INNER JOIN (SELECT departmentId,COUNT(*) as value FROM employee GROUP BY departmentId ) z1 ON d.id=z1.departmentId")

    /**
     * wgz
     * 综合统计中的关于部门的统计
     */
    public ArrayList<synthesize> statistics();

    /**
     * wgz
     * 关于地区人数统计
     */
    @Select("SELECT nativePlace as name,COUNT(*) as value FROM employee GROUP BY nativePlace")
    public ArrayList<statisticsregionDto> statisticsregion();

    /**
     * wgz
     * 关于学历和专业统计
     */
    @Select("SELECT tiptopDegree AS name,COUNT(*) as value FROM employee GROUP BY tiptopDegree")
    public ArrayList<statisticsregionDto>  education();

    @Select("SELECT specialty AS name,COUNT(*) as value FROM employee GROUP BY specialty")
    public ArrayList<statisticsregionDto> major();

}
