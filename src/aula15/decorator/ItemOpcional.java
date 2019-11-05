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
public abstract class ItemOpcional implements Carro{
    
    private Carro carro; 
    
    public ItemOpcional(Carro carro){
        this.carro = carro;
    }
    
    public Carro getCarro(){
        return carro;
    }
}
