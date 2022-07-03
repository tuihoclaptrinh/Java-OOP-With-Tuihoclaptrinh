/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

/**
 *
 * @author Tuan Anh
 */
public class Employee extends Officer {
    
    private String job;

    public Employee() {
    }

    public Employee(String job, String fullname, int age, String gender, String address) {
        super(fullname, age, gender, address);
        this.job = job;
    }
    
    @Override
    public String toString() {
        return "Employee{" + "job=" + job + ", name=" + super.getFullname() + ", age=" + super.getAge() + ", gender=" + super.getGender() + ", address=" + super.getAddress() + '}';
    }
    
}
