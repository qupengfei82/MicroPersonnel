package org.javaboy.vhr.server.impl;



import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.javaboy.vhr.mapper.dao.SalaryDao;
import org.javaboy.vhr.model.dto.PageDto;
import org.javaboy.vhr.model.dto.Salary;
import org.javaboy.vhr.server.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class SalaryServiceimpl implements SalaryService {
    @Autowired
    private SalaryDao salarydao;

    @Override
    public ArrayList<Salary> GetSalary() {
        return this.salarydao.GetSalary();
    }

    @Override
    public PageInfo<Salary> Salary$Employee(PageDto pagedto) {
        PageHelper.startPage(pagedto.getPage(), pagedto.getPageSize());
        PageInfo<Salary> pageinfo=new PageInfo(this.salarydao.GetSalary());
        return pageinfo;
    }
}
