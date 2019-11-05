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
public class CameraEstacionamento extends ItemOpcional{

    public CameraEstacionamento(Carro carro){
        super(carro);
    }
    
    @Override
    public double getPreco() {
        return super.getCarro().getPreco() + 2500;
    }

    @Override
    public String getDescricao() {
        return super.getCarro().getDescricao() + ", Camera de estacionamento";
    }
    
}
