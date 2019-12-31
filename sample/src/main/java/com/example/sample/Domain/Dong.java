package com.example.sample.Domain;

public class Dong {
    private Integer not_alivecnt;
    private Integer alivecnt;
    private Double months;
    private Integer cnt;
    private String dong;
    private Double not_alive_ratio;

    public Integer getNot_alivecnt() {
        return not_alivecnt;
    }

    public void setNot_alivecnt(Integer not_alivecnt) {
        this.not_alivecnt = not_alivecnt;
    }

    public Integer getAlivecnt() {
        return alivecnt;
    }

    public void setAlivecnt(Integer alivecnt) {
        this.alivecnt = alivecnt;
    }

    public Double getMonths() {
        return months;
    }

    public void setMonths(Double months) {
        this.months = months;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public String getDong() {
        return dong;
    }

    public void setDong(String dong) {
        this.dong = dong;
    }

    public Double getNot_alive_ratio() {
        return not_alive_ratio;
    }

    public void setNot_alive_ratio(Double not_alive_ratio) {
        this.not_alive_ratio = not_alive_ratio;
    }
}
