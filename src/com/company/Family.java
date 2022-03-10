package com.company;

public class Family {
    private String Fathername, Mothername, Sonname, Daughtername;
    private double FatherSalary, MotherSalary, Sonfees, Daughterfees;
    int Grocery = 500;

    public Family(String Fathername, String Mothername, String Sonname, String Daughtername, double FatherSalary, double MotherSalary, double Sonfees, double Daughterfees) {
        this.Fathername = Fathername;
        this.Mothername = Mothername;
        this.Sonname = Sonname;
        this.Daughtername = Daughtername;
        this.FatherSalary = FatherSalary;
        this.MotherSalary = MotherSalary;
        this.Sonfees = Sonfees;
        this.Daughterfees = Daughterfees;
    }


    public void displayNames() {

        System.out.println("Fathername is " + Fathername);
        System.out.println("Mothername is " + Mothername);
        System.out.println("Sonname is " + Sonname);
        System.out.println("Daughtername is " + Daughtername);

    }

    public double totalSalary() {
        double totalSalary = FatherSalary + MotherSalary;
        return totalSalary;
    }

    public double totalFees() {
        double totalFees = Sonfees + Daughterfees;
        return totalFees;
    }

    public double totalSaving() {
        double totalsaving = totalSalary() - (totalFees() - 500);
        return totalsaving;
    }

    public String messageToDad() {
        if (totalSaving() > 1000) {
            System.out.println("Congratulation!! you saved " + " " + totalSaving());

        }
        return "Dear FatherName!! Please try to save for next month";
    }
}
