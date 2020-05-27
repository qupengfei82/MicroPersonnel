package org.javaboy.vhr.server;

import com.github.pagehelper.PageInfo;
import org.javaboy.vhr.model.dto.EmpSalDeptDto;

import java.util.List;

public interface EmpSalDeptServer {
    public PageInfo<EmpSalDeptDto> findEmpSal(Integer page, Integer pageSize);
}
