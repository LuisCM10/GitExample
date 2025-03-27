/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class Cat {
    private String name;
    private int edad;

    public Cat(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cat{" + "name=" + name + ", edad=" + edad + '}';
    }
   
    
    
}
