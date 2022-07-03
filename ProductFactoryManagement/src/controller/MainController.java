/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;
import model.dao.DAO;
import model.entity.Employee;
import model.entity.Engineer;
import model.entity.Officer;
import model.entity.Worker;
import view.View;

/**
 *
 * @author Tuan Anh
 */
public class MainController {

    Scanner sc = new Scanner(System.in);
    DAO dao = new DAO();
    View view = new View();

    public MainController() {
    }

    public int choosen() {
        int c = sc.nextInt();
        return c;
    }

    public String choosenChar() {
        String c = sc.next();
        return c;
    }

    public void addOfficer() {
        view.addOfficer();
        String c = choosenChar();

        switch (c) {
            case "a":
                System.out.print("Enter full name: ");
                sc.nextLine();
                String fullnameE = sc.nextLine();
                System.out.print("Enter age: ");
                int ageE = sc.nextInt();
                System.out.print("Enter gender: ");
                sc.nextLine();
                String genderE = sc.nextLine();
                System.out.print("Enter address: ");
                String addressE = sc.nextLine();
                System.out.print("Enter branch: ");
                String branchE = sc.nextLine();
                Officer engineer = new Engineer(branchE, fullnameE, ageE, genderE, addressE);
                dao.add(engineer);
                System.out.println("Added Engineer - " + engineer.toString());
                break;
            case "b":
                System.out.print("Enter name: ");
                sc.nextLine();
                String fullnameW = sc.nextLine();
                System.out.print("Enter age: ");
                int ageW = sc.nextInt();
                System.out.print("Enter gender: ");
                sc.nextLine();
                String genderW = sc.nextLine();
                System.out.print("Enter address: ");
                String addressW = sc.nextLine();
                System.out.print("Enter level: ");
                int levelW = sc.nextInt();
                Officer worker = new Worker(levelW, fullnameW, ageW, genderW, addressW);
                dao.add(worker);
                System.out.println("Added Worker - " + worker.toString());
                sc.nextLine();
                break;
            case "c":
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                sc.nextLine();
                System.out.print("Enter age: ");
                int age = sc.nextInt();
                System.out.print("Enter gender: ");
                sc.nextLine();
                String gender = sc.nextLine();
                System.out.print("Enter address: ");
                String address = sc.nextLine();
                System.out.print("Enter task: ");
                String task = sc.nextLine();
                Officer staff = new Employee(task, name, age, gender, address);
                dao.add(staff);
                System.out.println("Added Employee - " + staff.toString());
                break;
            case "d":
                break;
            default:

        }
    }

    public void searchOfficer() {
        System.out.println("---------- Search By Full Name ---------");
        System.out.print("Enter name to search: ");
        String nameSearch = sc.nextLine();
        dao.searchByName(nameSearch).forEach(o -> System.out.println(o.toString()));
    }

    public void showAll() {
        dao.showAll();
    }

    public void start() {
        while (true) {
            view.homeView();
            int c = choosen();

            switch (c) {
                case 1:
                    addOfficer();
                    break;
                case 2:
                    searchOfficer();
                    break;
                case 3:
                    showAll();
                    break;
                case 4:
                    return;
                default:
                    System.err.println("Invalid");
            }
        }
    }

}
