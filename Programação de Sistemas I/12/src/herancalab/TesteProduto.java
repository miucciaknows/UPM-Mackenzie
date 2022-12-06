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
public class TesteProduto {
    public static void main(String[] args) {
        
        Produto produtoGenerico = new Produto();
        
        produtoGenerico.nome = "lapis";
        produtoGenerico.preco = 1;
        
        System.out.println("Nome do produto genérico: "+produtoGenerico.nome);
        System.out.println("Preço do produto genérico: "+produtoGenerico.preco);
        System.out.println("Este produto genérico é caro? "+produtoGenerico.ehCaro());
        System.out.println("");
        
        Livro livro = new Livro();
        
        livro.nome = "Java para iniciantes";
        livro.preco = 90;
        livro.autor = "Hebert Shildt";
        livro.paginas = 704;
       
        System.out.println("Nome do livro: "+livro.nome);
        System.out.println("Preço do livro: "+livro.preco);
        System.out.println("Autor do livro: "+livro.autor);
        System.out.println ("Este livro é caro? "+ livro.ehCaro());
        System.out.println ("Este livro é grande?"+ livro.ehGrande());
        System.out.println("");
        
        Eletronico eletronico = new Eletronico ();
        
        eletronico.nome = "Baba Eletronica Motorola MBP-854";
        eletronico.preco = 2000.0;
        eletronico.voltagem = 110;
        
        System.out.println ("Este eletronico é caro?" + eletronico.ehCaro());
        System.out.println("Nome do eletronico: " + eletronico.nome);
        System.out.println("Preço do livro: "+eletronico.preco);
        System.out.println("Voltagem do eletronico: "+ eletronico.voltagem);
        System.out.println("");
       

        Cd cd = new Cd ();  
        cd.nome = "Adele - 25";
        cd.preco = 24.90;
        cd.artista = "Adele";
        cd.faixas = 11;
        
        System.out.println ("Este CD é caro?" + cd.ehCaro());
        System.out.println("Nome do CD: " +cd.nome);
        System.out.println("Preço do CD: "+ cd.preco);
        System.out.println("Artista: " + cd.artista);
        System.out.println("Faixas: "+ cd.faixas);
        System.out.println("");
      
        Dvd dvd = new Dvd ();
        
        dvd.nome = "DVD - Peppa Pig - Minha festa de aniversário";
        dvd.preco = 16.90;
        dvd.artista = "Peppa";
        dvd.duracao = 60;
        
        System.out.println ("Este DVD é caro?"+dvd.ehCaro());
        System.out.println("Nome do DVD: " +dvd.nome);
        System.out.println("Preço do DVD: " + dvd.preco);
        System.out.println("Artista: " + dvd.artista);
        
  
    }
    
}
