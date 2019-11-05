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
public class Cliente {
    
    public static void main(String[] args) {
        
        Carro carro1 = new CarroBasico();
        carro1 = new ArCondicionado(carro1);
        carro1 = new CameraEstacionamento(carro1);
        carro1 = new CentralInteratividade(carro1);
        carro1 = new CambioAutomatico(carro1);
        carro1 = new RodaLigaLeve(carro1);
        
        System.out.println("Descrição: " + carro1.getDescricao() + " - Valor: " + carro1.getPreco());
        
        
        System.out.println("-----------------------------------------------------------------------");
        
        
        Carro carro2 = new CarroBasico();
        carro2 = new ArCondicionado(carro2);
        carro2 = new CameraEstacionamento(carro2);
        carro2 = new RodaLigaLeve(carro2);
        
        System.out.println("Descrição: " + carro2.getDescricao() + " - Valor: " + carro2.getPreco());
         
    }
    
}
