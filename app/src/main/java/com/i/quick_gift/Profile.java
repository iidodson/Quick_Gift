package com.i.quick_gift;

public class Profile {
    static String name;
    static String relationship;
    static String interest;
    static String event;
    static int gender; //0 for woman, 1 for male

    public Profile(){
        setName("0");
        setRelationship("0");
        setInterest("0");
        setEvent("0");
        setGender(0);
    }

    public Profile(String n, String r, String i, String h, int g){
        setName(n);
        setRelationship(r);
        setInterest(i);
        setEvent(h);
        setGender(g);
    }

    public void setName(String n){
        name = n;
    }

    public void setRelationship(String r){
        relationship = r;
    }

    public void setInterest(String i){
        interest = i;
    }

    public void setEvent(String h){
        event = h;
    }

    public void setGender(int n){
        if(n == 0 || n == 1){
            gender = n;
        }

        else{
            gender = 0;
        }
    }

    public String getName(){
        return name;
    }

    public String getRelationship(){
        return relationship;
    }

    public String getInterest(){
        return interest;
    }

    public String geEvent(){
        return event;
    }

    public int getGender(){
        return gender;
    }
}
