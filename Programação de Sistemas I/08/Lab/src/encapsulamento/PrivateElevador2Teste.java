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
 public class PrivateElevador2Teste {
    
    public static void main(String[] args) {
        
        PrivateElevador2 privElevador = new PrivateElevador2();
                
        //qual andar o elevador está?/
        int andarEstou = privElevador.qualAndar();
        System.out.println("Elevador está no andar: " +andarEstou);
        
        boolean porta = privElevador.statusPorta();
        System.out.println("Status da porta: " +porta);
        
        privElevador.selecionaAndar(4);                
    }
}

    
}
