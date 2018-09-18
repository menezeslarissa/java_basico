/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao01_d;

/**
 *
 * @author Suporte
 */
public class Vendedor {
    private String nome;
    private double salario;
    private double totalVendas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
    
    public double salarioFinal(){
         return (0.15 * this.totalVendas) + this.salario;
    }
    
}
