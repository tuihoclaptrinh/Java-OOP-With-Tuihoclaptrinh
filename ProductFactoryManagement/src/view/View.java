/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Tuan Anh
 */
public class View {

    public void homeView() {
        System.out.println("---------- Product Factory Management ----------");
        System.out.println("        1. Add new Officer");
        System.out.println("        2. Search by full name");
        System.out.println("        3. Show infomation of list Officer");
        System.out.println("        4. Exit");
        System.out.print("  Your choice: ");
    }

    public void addOfficer() {
        System.out.println("---------- Add Officer ----------");
        System.out.println("        a. Insert Enginner");
        System.out.println("        b. Insert Worker");
        System.out.println("        c. Insert Staff");
        System.out.println("        d. Back");
        System.out.print("  Your choice: ");
    }

}
