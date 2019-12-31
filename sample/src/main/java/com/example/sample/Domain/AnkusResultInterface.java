package com.example.sample.Domain;

import java.util.List;

public interface AnkusResultInterface<T> {
    /*
    private String success;
    private String message;
    private String obj;
    private List<T> list;
    */
    String getSuccess();
    void setSuccess(String success);

    String getMessage();
    void setMessage(String message);

    String getObj();
    void setObj(String obj);

    List<T> getList();
    void setList(List<T> list);
}
