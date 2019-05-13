package com.example.sample;

import java.util.List;

class AnkusResultSido implements AnkusResultInterface<Dong> {
    private String success;
    private String message;
    private String obj;
    private List<Dong> list;

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
    public List<Dong> getList() {
        return list;
    }

    public void setList(List<Dong> list) {
        this.list = list;
    }
}
