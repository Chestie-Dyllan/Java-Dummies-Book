/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chap6;

/**
 *
 * @author dylla
 */
public class CloneTest {
        public static void main(String[] args) {
        Employee emp1 = new Employee( //→5
                "Martinez", "Anthony");
        emp1.setSalary(40000.0); //→7
        Employee emp2 = (Employee) emp1.clone(); //→8
        emp1.setLastName("Smith"); //→9
        System.out.println(emp1); //→10
        System.out.println(emp2); //→11
    }
}

class Employee //→15
{

    private String lastName;
    private String firstName;
    private Double salary;

    public Employee(String lastName,
            String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Object clone() //→57
    {
        Employee emp;
        emp = new Employee( //→60
                this.lastName, this.firstName);
        emp.setSalary(this.salary); //→62
        return emp; //→63
    }

    public String toString() {
        return this.getClass().getName() + "["
                + this.firstName + " "
                + this.lastName + ", "
                + this.salary + "]";
    }
}
