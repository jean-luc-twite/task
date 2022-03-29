/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.business;

/**
 *
 * @author HP
 */
public class MathClass {
      private String name;
    private String op;

    public MathClass(String name, String op) {
        this.name = name;
        this.op = op;
    }

    public String getName() {
        return name;
    }

    public String getOp() {
        return op;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOp(String op) {
        this.op = op;
    }

    @Override
    public String toString() {
        return "MathClass{" + "name=" + name + ", op=" + op + '}';
    }

}
