package com.company;

public class ObjectConcepts {
    public static void main(String[] args) {
//        Employee emp1= new Employee();   // these are getters returning values which is stored in the variables
//        emp1.getId() ;
//        emp1.getAddress();
//        emp1.getName() ;
//        Employee emp1 = new Employee();
//        emp1.setId(22);
//        System.out.println(emp1.getId()); // We are setting the id 22 and then getting it by using getters
//        Employee emp2= new Employee();  // these are setters we can set any value to particular variables.if we areemp2.setId(2);
//        emp2.setAddress("canada");
//        emp2.setName("Anhad");
//       System.out.println(emp2.getName());
        //--------------------Constructors-----------------------
        //Employee emp3= new Employee(); // default constructor

        Employee emp4= new Employee(55, "Fateh", "Toronto" );
        System.out.println(emp4.toString( ));//parametrized constructors
    }

}
