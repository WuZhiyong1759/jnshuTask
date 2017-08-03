package com.ptteng.carrots.zangai.model;

import java.util.List;

/**
 * Created by lzn312 on 2017/7/17.
 */
public class CompanyData {

    private Company company;

    private  String companyLabel;

    private Producter producter;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getCompanyLabel() {
        return companyLabel;
    }

    public void setCompanyLabel(String companyLabel) {
        this.companyLabel = companyLabel;
    }

    public Producter getProducter() {
        return producter;
    }

    public void setProducter(Producter producter) {
        this.producter = producter;
    }
}
