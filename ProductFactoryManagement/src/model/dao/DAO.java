/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;
import model.entity.Officer;

/**
 *
 * @author Tuan Anh
 */
public class DAO {

    List<Officer> listO;
    
    public DAO() {
        this.listO = new ArrayList<>();
    }
    
    public void add(Officer o) {
        this.listO.add(o);
    }
    
    public List<Officer> searchByName(String name) {
        return this.listO.stream().filter(o -> o.getFullname().contains(name)).collect(toList());
    } 
    
    public void showAll() {
        this.listO.forEach(o -> System.out.println(o.toString()));
    }
}
