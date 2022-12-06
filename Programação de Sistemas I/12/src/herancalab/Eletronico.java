/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancalab;

/**
 *
 * @author 41714849
 */
public class Eletronico extends Produto{
    int voltagem;
    
    @Override
    public boolean ehCaro(){
        if(this.preco > 2000){
            return true;
        }else{
            return false;
        }
    }
    
}
