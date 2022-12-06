

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nath
 */

public class Elemento {

    //==========================================================================
    //                              CONSTRUTORES
    //==========================================================================
    /**
     * Inicializa o nó com o valor enviado pelo metodo chamador.
     *
     * @param n
     */
    public Elemento(int n) {
        this.numero = n;
    }
    //--------------------------------------------------------------------------
    //
    //
    //
    //
    //==========================================================================
    //                                ATRIBUTOS
    //==========================================================================
    /**
     * Valor que o nó carrega.
     */
    public int numero;
    /**
     * Ponteiro para o proximo elemento da lista.
     */
    public Elemento proximo;
    //--------------------------------------------------------------------------
    //
    //
    //
    //
    //==========================================================================
    //                           METODOS GET E SET
    //==========================================================================
    public int getNumero() {
        return numero;
    }

    public void setNumero(int n) {
        this.numero = n;
    }

    public Elemento getProximo() {
        return this.proximo;
    }

    public void setProximo(Elemento prox) {
        this.proximo = prox;
    }
    //--------------------------------------------------------------------------


}





