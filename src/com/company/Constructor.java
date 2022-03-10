package com.company;

public class Constructor {
    private String name;
    private int age;
    private int balance;

    public Constructor (String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Constructor{" +
                "name='" + name + '\'' +
                '}';
    }

    public Constructor(){
        this("Fateh");

    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        System.out.println(c1);
    }
}
