/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author ASUS
 */
public class Dog {
    private String name;
    private int edad;

    public Dog(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", edad=" + edad + '}';
    }
    
    
}
