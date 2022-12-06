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
public class PrivateElevador2 {
        private boolean portaAberta = false;
    private int andarAtual = 1;
    private int peso = 320;
    
    private final int CAPACIDADE = 1000;
    private final int ULTIMO_ANDAR = 5;
    private final int PRIMEIRO_ANDAR = 1;
    

    public void abrePorta() {
        portaAberta = true;
    }
     

    public void fechaPorta() {
        if (peso <= CAPACIDADE) 
            portaAberta = false;
        else {
            System.out.println("O elevador está com excesso de peso");
            System.out.println("Portas continuarão abertas");
        }             
    }
      

    public void subir() {
        if (!portaAberta){ 
            if (andarAtual < ULTIMO_ANDAR) {
                andarAtual++;
                System.out.println("Andar :"+andarAtual);
            } else {
                System.out.println("Último andar");
            }   
        } else {
            System.out.println("Portas ainda abertas");
        }       
    }
    

    public void descer() {
        if (!portaAberta){ 
            if (andarAtual > PRIMEIRO_ANDAR) {
                andarAtual--;
                System.out.println("Andar :"+andarAtual);
            } else {
                System.out.println("Estamos no 1o andar");
            } 
            } else {
                System.out.println("Portas ainda abertas");
            }
    }       

}
 public void selecionaAndar(int andarDesejado) {
        if ((andarDesejado >= PRIMEIRO_ANDAR) && (andarDesejado <= ULTIMO_ANDAR)) {
            while (andarAtual != andarDesejado) {
                if (andarAtual < andarDesejado) {
                    subir();
                } else {
                    descer();
                }
            }
        } else {
            System.out.println("Andar inválido");
        }
    }

    
    public int qualAndar() {
        return andarAtual;
    }
    
    public boolean statusPorta() {
        return portaAberta;
    }
}
