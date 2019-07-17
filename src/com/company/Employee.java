package com.company;

public class Employee {
    private String Name;
    private String Surname;
    private String Position;
    private Double Salary;

    public Double getSalary() {
        return Salary;
    }

    public String getName() {
        return Name;
    }

    public String getPosition() {
        return Position;
    }

    public String getSurname() {
        return Surname;
    }

    public Employee(String Name, String Surname, String Position, double Salary){
      this.Name=Name;
      this.Surname=Surname;
      this.Position=Position;
      this.Salary=Salary;
  }

   public String toString(){
       return ("NAME: "+this.Name + " Surname: " + this.Surname + " Position: " + this.Position + " Salary: " + this.Salary.toString());
   }
}
