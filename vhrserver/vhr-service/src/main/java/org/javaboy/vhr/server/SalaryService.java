package org.javaboy.vhr.server;


import com.github.pagehelper.PageInfo;
import org.javaboy.vhr.model.Employee;
import org.javaboy.vhr.model.dto.PageDto;
import org.javaboy.vhr.model.dto.Salary;

import java.util.ArrayList;

public interface SalaryService {
    public ArrayList<Salary> GetSalary();

    public PageInfo<Salary> Salary$Employee(PageDto pagedto);
}
