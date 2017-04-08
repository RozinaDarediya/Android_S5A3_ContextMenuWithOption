package com.example.dell.s5a3_contextmenuwithoption;

/**
 * Created by dell on 3/17/2017.
 */
public class Student {

    String name;
    String phone;

    public Student(String name, String phone) {

        this.name = name;
        this.phone= phone;
    }

    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
}
