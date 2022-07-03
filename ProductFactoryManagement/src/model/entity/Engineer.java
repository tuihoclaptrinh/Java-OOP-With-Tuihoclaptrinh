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
public class Engineer extends Officer {

    private String branch;

    public Engineer() {
    }

    public Engineer(String branch, String fullname, int age, String gender, String address) {
        super(fullname, age, gender, address);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Engineer{" + "branch=" + branch + ", name=" + super.getFullname() + ", age=" + super.getAge() + ", gender=" + super.getGender() + ", address=" + super.getAddress() + '}';
    }
}
