
/**
 *
 * @author nath
 */
public class TadListaLigada {
    public TadListaLigada() {
        this.inicio = null;
    }

    Elemento inicio;

    public boolean vazia() {
        return inicio == null;
    }

    /**
     * Insere um elemento no inicio da Lista.
     *
     * @param e
     */
    public void insereInicio(Elemento e) {
        e.setProximo(inicio);
        inicio = e;
        
    }
    
    
    /**
     * Insere um elemento no final da Lista.
     *
     * @param e
     */
    public void insereFinal(Elemento e) {
        if (vazia()) {
            insereInicio(e);
        } else {
            Elemento x = inicio;
            while (x.getProximo() != null) {
                x = x.getProximo();
            }
            x.setProximo(e);
        }
    }
    
    
     public void removeInicio (Elemento e){
        if (vazia()){
            System.out.println("Lista Vazia");
        }
        else {
            inicio = inicio.proximo;
           
            
        }
     }
            
     public void removeFim (Elemento e){
          if (vazia()){
            System.out.println("Lista Vazia");
        } else {
          
         Elemento aux = inicio;
         Elemento ant = inicio;
         while (aux.proximo != null){
             ant = aux;
             aux = aux.proximo;
         }
         ant.proximo = null;
         inicio.proximo = ant;
         }
         
     }
        
    
   
    /**
     * Imprime os elementos da lista.
     *
     * @return
     */
    public String imprime() {
        String ret = "[";

        if (!vazia()) {
            Elemento x = inicio;
            while (true) {
                ret += " " + x.getNumero();
                if (x.getProximo() != null) {
                    x = x.getProximo();
                } else {
                    break;
                }
            }

        }

        ret += " ]";
        return ret;

    }
}

 
    

