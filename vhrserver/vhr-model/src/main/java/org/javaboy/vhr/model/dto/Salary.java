package org.javaboy.vhr.model.dto;


public class Salary {
    private Integer id;
    private Integer eid;
    private Integer basicSalary;
    private Integer bonus;
    private Integer lunchSalary;
    private Integer trafficSalary;
    private Integer allSalary;
    private Integer pensionBase;
    private Float pensionPer;
    private Integer medicalBase;
    private Float medicalPer;
    private Integer accumulationFundBase;
    private Float accumulationFundPer;
    private Integer unemploymentBase;
    private Float unemploymentPer;
    private Integer takeHome;
    private String name;

    public Salary() {
    }

    public Salary(Integer id, Integer eid, Integer basicSalary, Integer bonus, Integer lunchSalary, Integer trafficSalary, Integer allSalary, Integer pensionBase, Float pensionPer, Integer medicalBase, Float medicalPer, Integer accumulationFundBase, Float accumulationFundPer, Integer unemploymentBase, Float unemploymentPer, Integer takeHome, String name) {
        this.id = id;
        this.eid = eid;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.lunchSalary = lunchSalary;
        this.trafficSalary = trafficSalary;
        this.allSalary = allSalary;
        this.pensionBase = pensionBase;
        this.pensionPer = pensionPer;
        this.medicalBase = medicalBase;
        this.medicalPer = medicalPer;
        this.accumulationFundBase = accumulationFundBase;
        this.accumulationFundPer = accumulationFundPer;
        this.unemploymentBase = unemploymentBase;
        this.unemploymentPer = unemploymentPer;
        this.takeHome = takeHome;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", eid=" + eid +
                ", basicSalary=" + basicSalary +
                ", bonus=" + bonus +
                ", lunchSalary=" + lunchSalary +
                ", trafficSalary=" + trafficSalary +
                ", allSalary=" + allSalary +
                ", pensionBase=" + pensionBase +
                ", pensionPer=" + pensionPer +
                ", medicalBase=" + medicalBase +
                ", medicalPer=" + medicalPer +
                ", accumulationFundBase=" + accumulationFundBase +
                ", accumulationFundPer=" + accumulationFundPer +
                ", unemploymentBase=" + unemploymentBase +
                ", unemploymentPer=" + unemploymentPer +
                ", takeHome=" + takeHome +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Integer basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public Integer getLunchSalary() {
        return lunchSalary;
    }

    public void setLunchSalary(Integer lunchSalary) {
        this.lunchSalary = lunchSalary;
    }

    public Integer getTrafficSalary() {
        return trafficSalary;
    }

    public void setTrafficSalary(Integer trafficSalary) {
        this.trafficSalary = trafficSalary;
    }

    public Integer getAllSalary() {
        return allSalary;
    }

    public void setAllSalary(Integer allSalary) {
        this.allSalary = allSalary;
    }

    public Integer getPensionBase() {
        return pensionBase;
    }

    public void setPensionBase(Integer pensionBase) {
        this.pensionBase = pensionBase;
    }

    public Float getPensionPer() {
        return pensionPer;
    }

    public void setPensionPer(Float pensionPer) {
        this.pensionPer = pensionPer;
    }

    public Integer getMedicalBase() {
        return medicalBase;
    }

    public void setMedicalBase(Integer medicalBase) {
        this.medicalBase = medicalBase;
    }

    public Float getMedicalPer() {
        return medicalPer;
    }

    public void setMedicalPer(Float medicalPer) {
        this.medicalPer = medicalPer;
    }

    public Integer getAccumulationFundBase() {
        return accumulationFundBase;
    }

    public void setAccumulationFundBase(Integer accumulationFundBase) {
        this.accumulationFundBase = accumulationFundBase;
    }

    public Float getAccumulationFundPer() {
        return accumulationFundPer;
    }

    public void setAccumulationFundPer(Float accumulationFundPer) {
        this.accumulationFundPer = accumulationFundPer;
    }

    public Integer getUnemploymentBase() {
        return unemploymentBase;
    }

    public void setUnemploymentBase(Integer unemploymentBase) {
        this.unemploymentBase = unemploymentBase;
    }

    public Float getUnemploymentPer() {
        return unemploymentPer;
    }

    public void setUnemploymentPer(Float unemploymentPer) {
        this.unemploymentPer = unemploymentPer;
    }

    public Integer getTakeHome() {
        return takeHome;
    }

    public void setTakeHome(Integer takeHome) {
        this.takeHome = takeHome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
