/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao01_c;

import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class Principal {
    public static void main(String[] args) {
        ConsumoAutomovel c = new ConsumoAutomovel();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Distância percorrida: ");
        c.setDistancia(scanner.nextDouble());
        System.out.println("Combustivel gasto: ");
        c.setCombustivel(scanner.nextDouble());
        System.out.println("Consumo médio: " + c.consumoMedio());
    }
}
