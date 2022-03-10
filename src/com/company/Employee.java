package com.company;

public class Employee {
    private int id;
    private String name;
    private String Address;

    public Employee() {
        System.out.println("Default constructorr called");   // default constructor
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    public Employee(int id, String name, String address) {// parmetrized constructors
        System.out.println("Parameterized constructors was invoked");
        this.id = id;
        this.name = name;
        this.Address = address;
    }

    //    public int getId() {  // these are getters returning values which is stored in the variables
//       return id;
//   }
//
   // public void setId(int id) {     // these are setters we can set any value to particular variables.if we are using
//                                   // in front of it then it can be accessed by nay class or package as well
//
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return Address;
//    }
//
//    public void setAddress(String address) {
//        Address = address;
//    }
    }
