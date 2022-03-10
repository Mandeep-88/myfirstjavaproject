package com.company;

public class PersonDetails {
    public static void main(String[] args) {
        Person p1= new Person("Mandeep", "Kaur","Canada",28);
        System.out.println(p1.getFullname());
        System.out.println("Before change the address is"+""+p1.getAdress());
        p1.changeAddress("India");
        System.out.println("After change the address is"+" "+p1.getAdress());

    }


}
