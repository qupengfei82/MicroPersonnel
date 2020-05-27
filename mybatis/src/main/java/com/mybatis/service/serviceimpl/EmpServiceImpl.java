package com.mybatis.service.serviceimpl;

import com.mybatis.dao.EmpDao;
import com.mybatis.model.EmpModel;
import com.mybatis.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpDao empDao;
    @Override
    public EmpModel getEmpById(Integer id) {

        return (EmpModel) this.empDao.selectByPrimaryKey(id);
    }

    @Override
    public List<EmpModel> findempdept(Integer id) {
        return this.empDao.findempdept(id);
    }

    @Override
    public List<EmpModel> examlike(String name) {
        Example example=new Example(EmpModel.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andLike("name","%"+name+"%");
        return this.empDao.selectByExample(example);
    }
}
