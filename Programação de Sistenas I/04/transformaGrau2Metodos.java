import java.util.Scanner;

public class transformaGrau2Metodos {
    
    public static float valorCelsius (float temp){
        float tempTransf = 0;  
        tempTransf  = (5*(temp - 32))/9;
        return tempTransf;
    }
    
    public static float valorFahre (float temp){
        float tempTransf = 0;  
        tempTransf  = (9*temp/5)+32;
        return tempTransf;
    }
    
    public static void main(String[] args) {
        float temperatura=0;
        String grau = "";
                
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite C - para Celsius - ou F - para Fahrenheit: ");
        grau = entrada.nextLine();
        
        System.out.print("Digite o valor da temperatura: ");
        temperatura = entrada.nextFloat();
        
        switch (grau) {
            case "C":
                System.out.println("A temperatura em Fahrenheit é: " + (valorFahre(temperatura)));
                break;
            case "F":
                System.out.println("A temperatura em Celsius é: " + (valorCelsius(temperatura)));
                break;
            default: 
                System.out.println("Tipo de temperatura inválido");
                break;                   
        }
    }
}
