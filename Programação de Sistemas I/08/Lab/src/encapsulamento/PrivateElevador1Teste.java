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
public class PrivateElevador1Teste {
    public static void main(String[] args){

        PrivateElevador1 priElevador = new PrivateElevador1();
        
        // As linhas de código abaixo não irão funcionar, pois   
      // todos os atributos são private
        
        priElevador.portaAberta = true;   	//passageiros entrando
        priElevador.portaAberta = false;  	//porta fechada
        
        priElevador.andarAtual--;  			//indo para o zero
        priElevador.andarAtual++;  			//indo para o primeiro
        
        priElevador.andarAtual = 7; 		//indo para o 7o andar (só tem 5 andares)
        
        priElevador.portaAberta = true;  		//passageiros entrando ou saindo
        priElevador.portaAberta = false;  	//porta fechada   
        priElevador.andarAtual = 1; 		//indo para o 1o andar
        priElevador.portaAberta = true;  		//passageiros entrando ou saindo
        
        priElevador.andarAtual++; 			//elevador se move com a porta aberta
        
        priElevador.portaAberta = false;  	//porta fechada
        priElevador.andarAtual--;
        priElevador.andarAtual--;    
   }

