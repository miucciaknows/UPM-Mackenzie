/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

/**
 *
 * @author 41714849
 */
public class PublicElevadorTeste {
       public static void main(String[] args){
        
        PublicElevador pubElevador = new PublicElevador();
        
        pubElevador.portaAberta = true;  //passageiros entrando
        pubElevador.portaAberta = false;  //porta fechada
        
        pubElevador.andarAtual--; //indo para o zero
        pubElevador.andarAtual++; //indo para o primeiro
              
        pubElevador.andarAtual = 7; //indo para o 7o andar (não tem)
        
        pubElevador.portaAberta = true;  //passageiros entrando
        pubElevador.portaAberta = false;  //porta fechada   
        pubElevador.andarAtual = 1; //indo para o 1o andar
        pubElevador.portaAberta = true;  //passageiros entrando        
        pubElevador.andarAtual++; //elevador se move com a porta aberta
        
        pubElevador.portaAberta = false;  //porta fechada
        pubElevador.andarAtual--;
        pubElevador.andarAtual--;
        
        System.out.println("Andar: " + pubElevador.andarAtual);
    }    
}

    

