package cn.li.task4.entity;

import java.security.PrivateKey;

/**
 * Created by Administrator on 2017/4/12.
 */
public class Profession {
    private long id;
    private String v_name;
    private String v_direction;
    private String introducer;
    private int step_diif;
    private int stu_diff;
    private String stu_cyle;
    private int com_count;
    private String detail_introduce;
    private String tip;
    private String salary_low;
    private String salary_mid;
    private String salary_high;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public void setV_name(String v_name) {
        this.v_name = v_name;
    }

    public String getV_direction() {
        return v_direction;
    }

    public void setV_direction(String v_direction) {
        this.v_direction = v_direction;
    }

    public String getIntroducer() {
        return introducer;
    }

    public void setIntroducer(String introducer) {
        this.introducer = introducer;
    }

    public int getStep_diif() {
        return step_diif;
    }

    public void setStep_diif(int step_diif) {
        this.step_diif = step_diif;
    }

    public int getStu_diff() {
        return stu_diff;
    }

    public void setStu_diff(int stu_diff) {
        this.stu_diff = stu_diff;
    }

    public String getStu_cyle() {
        return stu_cyle;
    }

    public void setStu_cyle(String stu_cyle) {
        this.stu_cyle = stu_cyle;
    }

    public int getCom_count() {
        return com_count;
    }

    public void setCom_count(int com_count) {
        this.com_count = com_count;
    }

    public String getDetail_introduce() {
        return detail_introduce;
    }

    public void setDetail_introduce(String detail_introduce) {
        this.detail_introduce = detail_introduce;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getSalary_low() {
        return salary_low;
    }

    public void setSalary_low(String salary_low) {
        this.salary_low = salary_low;
    }

    public String getSalary_mid() {
        return salary_mid;
    }

    public void setSalary_mid(String salary_mid) {
        this.salary_mid = salary_mid;
    }

    public String getSalary_high() {
        return salary_high;
    }

    public void setSalary_heigh(String salary_high) {
        this.salary_high = salary_high;
    }

    public String getV_name() {
        return v_name;
    }
}

