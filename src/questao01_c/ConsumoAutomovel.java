/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao01_c;

/**
 *
 * @author Suporte
 */
public class ConsumoAutomovel {
    private double distancia;
    private double combustivel;

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }
    
    public double consumoMedio(){
       return this.distancia / this.combustivel;
    }
}
