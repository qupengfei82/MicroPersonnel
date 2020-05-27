package org.javaboy.vhr.service;

import org.javaboy.vhr.mapper.EmployeeecMapper;
import org.javaboy.vhr.model.Employee;
import org.javaboy.vhr.model.Employeeec;
import org.javaboy.vhr.model.RespPageBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author qupengfei
 */
@Service
public class EmployeeecService {
    @Autowired
    EmployeeecMapper employeeecMapper;
    @Autowired
    RabbitTemplate rabbitTemplate;
    @Autowired
    MailSendLogService mailSendLogService;
    public final static Logger logger = LoggerFactory.getLogger(EmployeeService.class);
    SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
    DecimalFormat decimalFormat = new DecimalFormat("##.00");

    public Integer addEmpeeec(Employeeec employeeec) {
        return employeeecMapper.insert(employeeec);
    }

    public Employeeec selectById(Integer id){
        return employeeecMapper.selectByPrimaryKey(id);
    }

    public RespPageBean getEmployeec(String name, Integer page, Integer size){
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        List list= this.employeeecMapper.getEmployeec(name,page,size);

        RespPageBean respPageBean = new RespPageBean();
        respPageBean.setData(list);
        respPageBean.setTotal(employeeecMapper.getTotal(null));
        return respPageBean;
    }
}
