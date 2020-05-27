package org.javaboy.vhr.server.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.javaboy.vhr.mapper.dao.EmpSalDeptDao;
import org.javaboy.vhr.model.dto.EmpSalDeptDto;
import org.javaboy.vhr.model.dto.Salary;
import org.javaboy.vhr.server.EmpSalDeptServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpSalDeptServerImpl  implements EmpSalDeptServer {

    @Autowired
    private EmpSalDeptDao empSalDeptDao;
    @Override
    public PageInfo<EmpSalDeptDto> findEmpSal(Integer page, Integer pageSize) {
        if(page==null || page==0) {
            page=1;
        }else {
            page=page;
        }
        PageHelper.startPage(page, pageSize);
        PageInfo<EmpSalDeptDto> pageinfo=new PageInfo<EmpSalDeptDto>(this.empSalDeptDao.findEmpSal(page,pageSize));
        return pageinfo;
    }
}
