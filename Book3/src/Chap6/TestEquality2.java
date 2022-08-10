/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chap6;

/**
 *
 * @author dylla
 */
public class TestEquality2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee( //→5
                "Martinez", "Anthony");
        Employee emp2 = new Employee( //→7
                "Martinez", "Anthony");
        if (emp1.equals(emp2)) //→9
        {
            System.out.println(
                    "These employees are the same.");
        } else {
            System.out.println(
                    "These are different employees.");
        }
    }
}

class Employee //→18
{

    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public boolean equals(Object obj) //→39
    {
// an object must equal itself
        if (this == obj) //→42
        {
            return true;
        }
// no object equals null
        if (this == null) //→46
        {
            return false;
        }
// objects of different types are never equal
        if (this.getClass() != obj.getClass()) //→50
        {
            return false;
        }
// cast to an Employee, then compare the fields
        Employee emp = (Employee) obj; //→54
        return this.lastName.equals(emp.getLastName()) //→55
                && this.firstName.equals(emp.getFirstName());
    }    
}
