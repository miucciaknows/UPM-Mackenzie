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
public class Livro extends Produto{
    String autor;
    int paginas;
    
    public boolean ehGrande(){
        if(this.paginas > 300){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public boolean ehCaro(){
        if(this.preco > 200){
            return true;
        }else{
            return false;
        }
    }

    
}
