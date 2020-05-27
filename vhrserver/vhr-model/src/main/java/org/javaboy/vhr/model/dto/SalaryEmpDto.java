package org.javaboy.vhr.model.dto;

public class SalaryEmpDto {
    private Integer id;
    private String name;

    public SalaryEmpDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SalaryEmpDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
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

    public SalaryEmpDto() {
    }

    public SalaryEmpDto(String name) {
        this.name = name;
    }
}
