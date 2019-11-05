/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula15.decorator;

/**
 *
 * @author felip
 */
public class CarroBasico implements Carro {

    @Override
    public double getPreco() {
        return 51000.00;
    }

    @Override
    public String getDescricao() {
        return "Gol 2019 1.6";
    }
    
}
