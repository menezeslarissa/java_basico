/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao01_b;

/**
 *
 * @author Suporte
 */
public class Calculadora {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int soma(){
      return this.num1 + this.num2;  
    }
    
    public int subtracao(){
        return this.num1 - this.num2;
    }
    
    public int mult(){
        return this.num1 * this.num2;
    }
    
    public double div(){
        return this.num1 / this.num2;
    }
    
}
