package lab09;

public class DadosFisicos {
    double peso;
    double altura;
    int idade;
    Atleta dados;
    
    double calcularImc(){
        return peso /(altura*altura);
    }
    void exibirDados (){
        System.out.println("Peso: "+ peso);
        System.out.println("Altura: "+ altura);
        System.out.println("Idade: "+ idade);
    }
}
