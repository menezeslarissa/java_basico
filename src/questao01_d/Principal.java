/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao01_d;

import java.util.Scanner;

/**
 *
 * @author larissa
 */
public class Principal {
    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome do vendedor:");
        v.setNome(sc.nextLine());
        System.out.println("Salário fixo:");
        v.setSalario(sc.nextDouble());
        System.out.println("Total de vendas/mês em dinheiro:");
        v.setTotalVendas(sc.nextDouble());
        
        System.out.println("Vendedor: " + v.getNome());
        
        System.out.println("Salário fixo: " + v.getSalario());
        
        System.out.println("Salário final: " + v.salarioFinal());
        
    }
}
