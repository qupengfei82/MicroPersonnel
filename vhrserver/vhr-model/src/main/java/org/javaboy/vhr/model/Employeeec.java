package org.javaboy.vhr.model;

import java.util.Date;

public class Employeeec {
    private Integer id;

    private Integer eid;

    private Date ecdate;

    private String ecreason;

    private Integer ecpoint;

    private Integer ectype;

    private String remark;


    public Employeeec() {
    }

    public Employeeec(Integer id, Integer eid, Date ecdate, String ecreason, Integer ecpoint, Integer ectype, String remark) {
        this.id = id;
        this.eid = eid;
        this.ecdate = ecdate;
        this.ecreason = ecreason;
        this.ecpoint = ecpoint;
        this.ectype = ectype;
        this.remark = remark;
    }

    public Employeeec(Integer eid, Date ecdate, String ecreason, Integer ecpoint, Integer ectype, String remark) {
        this.eid = eid;
        this.ecdate = ecdate;
        this.ecreason = ecreason;
        this.ecpoint = ecpoint;
        this.ectype = ectype;
        this.remark = remark;
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

    public Date getEcdate() {
        return ecdate;
    }

    public void setEcdate(Date ecdate) {
        this.ecdate = ecdate;
    }

    public String getEcreason() {
        return ecreason;
    }

    public void setEcreason(String ecreason) {
        this.ecreason = ecreason;
    }

    public Integer getEcpoint() {
        return ecpoint;
    }

    public void setEcpoint(Integer ecpoint) {
        this.ecpoint = ecpoint;
    }

    public Integer getEctype() {
        return ectype;
    }

    public void setEctype(Integer ectype) {
        this.ectype = ectype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Employeeec{" +
                "id=" + id +
                ", eid=" + eid +
                ", ecdate=" + ecdate +
                ", ecreason='" + ecreason + '\'' +
                ", ecpoint=" + ecpoint +
                ", ectype=" + ectype +
                ", remark='" + remark + '\'' +
                '}';
    }
}
