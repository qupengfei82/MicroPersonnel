package com.mybatis.model;

import javax.persistence.Table;

@Table(name = "dept")
public class DeptModel {
    private Integer id;
    private String name;

    public DeptModel(String name) {
        this.name = name;
    }

    public DeptModel(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public DeptModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DeptModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

