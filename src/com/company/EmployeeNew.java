package com.company;

public class EmployeeNew {
    private double hourlyRate;
    private double bonus;
    private int hoursWorked;
    private int overTimeHours;
    int empId;
    String name;
    public double calWages(double hourlyRate, int hoursWorked){
        return(hourlyRate*hoursWorked);
    }
    public double calWages(double hourlyRate ,int hoursWorked, double bonus){
        return(hourlyRate* hoursWorked+ bonus);
    }
    public double calWages(double hourlyRate,int hoursWorked, int overTimeHours){
        return(hourlyRate*hoursWorked+(overTimeHours*(hourlyRate*1.5)));
    }
    public double calWages(double hourlyRate,double bonus,int hoursWorked, int overTimeHours){
        return(hourlyRate*hoursWorked+(overTimeHours*(hourlyRate*1.5)+bonus));
    }

}

