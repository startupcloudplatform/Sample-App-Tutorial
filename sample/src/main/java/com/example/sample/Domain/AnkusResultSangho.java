package com.example.sample.Domain;

import java.util.List;

public class AnkusResultSangho implements AnkusResultInterface<Sangho> {
    private String success;
    private String message;
    private String obj;
    private List<Sangho> list;

    @Override
    public String getSuccess() {
        return success;
    }

    @Override
    public void setSuccess(String success) {
        this.success = success;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getObj() {
        return obj;
    }

    @Override
    public void setObj(String obj) {
        this.obj = obj;
    }

    @Override
    public List<Sangho> getList() {
        return list;
    }

    @Override
    public void setList(List<Sangho> list) {
        this.list = list;
    }
}
