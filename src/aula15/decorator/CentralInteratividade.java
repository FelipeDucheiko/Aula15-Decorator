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
public class CentralInteratividade extends ItemOpcional{
    
    public CentralInteratividade(Carro carro){
        super(carro);
    }
    
    @Override
    public double getPreco() {
        return super.getCarro().getPreco() + 1000;
    }

    @Override
    public String getDescricao() {
        return super.getCarro().getDescricao() + ", Central de Iteratividade Media Plus";
    }
}
