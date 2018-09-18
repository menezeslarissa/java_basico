/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao01_b;

import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class Principal {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro número: ");
        calculadora.setNum1(scanner.nextInt());
        System.out.println("Entre com o segundo número: ");
        calculadora.setNum2(scanner.nextInt());
        System.out.println("O resultado da soma é: " + calculadora.soma());
        System.out.println("O resultado da multiplicação é: " + calculadora.mult());
        System.out.println("O resultado da divisão é: " + calculadora.div());
        System.out.println("O resultado da subtração é: " + calculadora.subtracao());
    }
}
