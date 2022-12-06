/*
*Cada aluno fará 3 provas ao longo do semestre. 
*Faça um programa para calcular a média ponderada destas 3 provas. 
*Depois calcule e mostre a média ponderada dessas notas.
 */
package javaapplication2;

/**
 *
 * @author Nastya
 */
public class exer01 {
    public static void main (String [] args) {
    double p1;
    double p2;
    double p3;
    double media;

    p1 = 8.5;
    p2 = 9.5;
    p3 = 0;
    media = (p1+p2+p3)/3;

    System.out.print("A media obtida é = "+media);
   
   } 
   
    }
