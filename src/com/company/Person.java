package com.company;

public class Person {
    private String firstname;
    private String lastname;
    private String address;
    private int age;

    public Person(String firstname,String lastname,String address,int age){
        this.firstname =firstname;
        this.lastname = lastname;
        this.address = address;
        this.age = age;
    }

    public String getFullname() {
        return firstname+" "+ lastname;
    }
    public void changeAddress(String address){
        this.address= address;
    }
public String getAdress(){
        return address;
}

}
