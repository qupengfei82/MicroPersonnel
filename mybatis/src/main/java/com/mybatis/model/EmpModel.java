package com.mybatis.model;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "emp")
public class EmpModel {

    @Id
    private Integer id;
    private Integer did;
    private String name;
    private DeptModel dept;

    @Override
    public String toString() {
        return "EmpModel{" +
                "id=" + id +
                ", did=" + did +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeptModel getDept() {
        return dept;
    }

    public void setDept(DeptModel dept) {
        this.dept = dept;
    }

    public EmpModel() {
    }

    public EmpModel(Integer id, Integer did, String name, DeptModel dept) {
        this.id = id;
        this.did = did;
        this.name = name;
        this.dept = dept;
    }

    public EmpModel(Integer did, String name, DeptModel dept) {
        this.did = did;
        this.name = name;
        this.dept = dept;
    }
}
