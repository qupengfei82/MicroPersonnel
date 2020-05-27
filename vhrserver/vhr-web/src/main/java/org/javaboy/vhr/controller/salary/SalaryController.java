package org.javaboy.vhr.controller.salary;

import com.github.pagehelper.PageInfo;
import org.javaboy.vhr.model.Employeeec;
import org.javaboy.vhr.model.RespBean;
import org.javaboy.vhr.model.Salary;
import org.javaboy.vhr.model.dto.EmpSalDeptDto;
import org.javaboy.vhr.model.dto.SalaryEmpDto;
import org.javaboy.vhr.server.EmpSalDeptServer;
import org.javaboy.vhr.server.EmployeeecServer;
import org.javaboy.vhr.server.SalaryEmpServer;
import org.javaboy.vhr.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/salary/sob")
public class SalaryController {
    @Autowired
    SalaryService salaryService;
    @Autowired
    private EmployeeecServer empcserver;
    @Autowired
    private SalaryEmpServer salaryEmpServer;
    @Autowired
    private EmpSalDeptServer empSalDeptServer;

    @GetMapping("/")
    public List<Salary> getAllSalaries() {
        return salaryService.getAllSalaries();
    }

    @PostMapping("/")
    public RespBean addSalary(@RequestBody Salary salary) {
        List<Employeeec> list=this.empcserver.getByIdEmployeeec(salary.getEid());
        salary.setAllSalary(salary.getBasicSalary()+salary.getBonus()+salary.getLunchSalary()+salary.getTrafficSalary());
        salary.setTakeHome((int) (salary.getAllSalary()-salary.getPensionBase()*salary.getPensionPer()-salary.getMedicalBase()
                *salary.getMedicalPer()-salary.getAccumulationFundBase()
                *salary.getAccumulationFundPer()-salary.getUnemploymentBase()*salary.getUnemploymentPer()));
        if (list!=null) {
            for (Employeeec empec : list) {
                if (empec.getEctype().equals(1)) {
                    salary.setTakeHome(salary.getTakeHome() - empec.getEcpoint());
                } else {
                    salary.setTakeHome(salary.getTakeHome() + empec.getEcpoint());
                }
            }
        }
        if (salaryService.addSalary(salary) == 1) {
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteSalaryById(@PathVariable Integer id) {
        if (salaryService.deleteSalaryById(id) == 1) {
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @PutMapping("/")
    public RespBean updateSalaryById(@RequestBody Salary salary) {

        List<Employeeec> list=this.empcserver.getByIdEmployeeec(salary.getEid());
        salary.setAllSalary(salary.getBasicSalary()+salary.getBonus()+salary.getLunchSalary()+salary.getTrafficSalary());
        salary.setTakeHome((int) (salary.getAllSalary()-salary.getPensionBase()*salary.getPensionPer()-salary.getMedicalBase()
                *salary.getMedicalPer()-salary.getAccumulationFundBase()
                *salary.getAccumulationFundPer()-salary.getUnemploymentBase()*salary.getUnemploymentPer()));
        for (Employeeec empec: list) {
            if (empec.getEctype().equals(1)){
                salary.setTakeHome(salary.getTakeHome()-empec.getEcpoint());
            }else{
                salary.setTakeHome(salary.getTakeHome()+empec.getEcpoint());
            }
        }
        if (salaryService.updateSalaryById(salary) == 1) {
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }

    @GetMapping("/getaddemp")
    public List<SalaryEmpDto> getSalaryEmpadd(){
        return this.salaryEmpServer.getSalaryEmpadd();
    }

    @GetMapping("/findEmpSal")
    public PageInfo<EmpSalDeptDto> findEmpSal(Integer page, Integer pageSize){
        return this.empSalDeptServer.findEmpSal(page,pageSize);
    }
}
