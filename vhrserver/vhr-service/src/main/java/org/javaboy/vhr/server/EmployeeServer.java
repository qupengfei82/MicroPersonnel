package org.javaboy.vhr.server;

import org.javaboy.vhr.model.Employee;
import org.javaboy.vhr.model.dto.statisticsregionDto;
import org.javaboy.vhr.model.dto.synthesize;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface EmployeeServer {
    /**
     * wgz
     * 综合统计中的关于部门的统计
     */
    public ArrayList<synthesize> statistics();
    /**
     * wgz
     * 关于地区人数统计
     */
    public ArrayList<statisticsregionDto> statisticsregion();

    /**
     * 关于学历人数统计
     * wgz
     */
    public ArrayList<statisticsregionDto>  education();
    /**
     * 关于专业人数统计
     */
    public ArrayList<statisticsregionDto> major();
}
