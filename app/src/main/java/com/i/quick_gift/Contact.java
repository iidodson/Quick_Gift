package com.i.quick_gift;

/**
 * Created by iidodson on 11/1/15.
 */

public class Contact {
    int id;
    String name, email, uname, pass;

    public void setId(int id){
        this.id = id;
    }

    public  int getId(){
        return id;
    }

    public void setName(String nName){
        name = nName;
    }

    public String getName(){
        return name;
    }

    public void setEmail(String nEmail){
        email = nEmail;
    }

    public String getEmail(){
        return email;
    }

    public void setUname(String nUname){
        uname = nUname;
    }

    public String getUname(){
        return uname;
    }

    public void setPass(String nPass){
        pass = nPass;
    }

    public String getPass(){
        return pass;
    }
}