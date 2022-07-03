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
public class Worker extends Officer {

    private int level;

    public Worker() {
    }

    public Worker(int level, String fullname, int age, String gender, String address) {
        super(fullname, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" + "level=" + level + ", name=" + super.getFullname() + ", age=" + super.getAge() + ", gender=" + super.getGender() + ", address=" + super.getAddress() + '}';
    }

}
