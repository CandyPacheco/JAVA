package com.generation;

public class Employee {
  public String firstName; 
  public String lastName; 
  public int registration; 
  public int age; 
  public int daysWorked;
  public int vacationDaysTaken; 
  public double salary; 
  public int yearsWorked;

  public Employee( String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked)
  {
      this.firstName = firstName;
      this.lastName = lastName;
      this.registration = registration;
      this.age = age; 
      this.daysWorked = daysWorked;
      this.vacationDaysTaken = vacationDaysTaken;
      this.salary = salary;
      this.yearsWorked = yearsWorked;
  }

  
  public double timeToRetirement(){
    // time to retirement = min(60 - age, 40 - yearsWorked)
    return 
}

  public double vacationTimeLeft(){
     // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
     return (daysWorked/360) * (30 - vacationDaysTaken);
}

  public double calculateBonus(){
    // bonus = 2.2*salary
      return 2.2*salary;
}

}
