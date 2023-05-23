package AtividadeFormativa;

import java.util.Random;
import java.util.Scanner;

public class ExLogica {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

 //Atividade 1 criar uma matriz fornecida pelo usuario
    public void exercicio1() {
       //solcitar para user a qtd de linhas e colunas
        int lin, col;
        System.out.println("Informe o numero de linhas da matriz ");
        lin = sc.nextInt();
        System.out.println("Informe o numero de colunas da matriz ");
        col = sc.nextInt();
          
        int matriz[][] = new int[lin][col];//Matriz com tamanho de linhas e colunas digitada pelo usuario

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                // Matriz preenchida com valores aleatórios entre 0 e 9 random
                matriz[i][j] = rd.nextInt(10);
            }
        }
        System.out.println("Matriz aleatórias");
        //Imprimir a matriz
        for (int i = 0; i < lin; i++) {
            System.out.print("| ");
            for (int j = 0; j < col; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("|");

        }
        System.out.println("---------------------------");
        //Imprimir a matriz substituindo por 0,1,2 de acordo com a regra de preenchimento
        for (int i = 0; i < lin; i++) {
            System.out.print("| ");
            for (int j = 0; j < col; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                } else if (i < j) {
                    matriz[i][j] = 2;
                } else {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    //atividade 2 - sortei de um nº
    public void exercicio2() {
        int palpite=0, nAleatorio,i=0;
        //A variavel ira receber um numero aleatorio de 0 até 1000
        nAleatorio = rd.nextInt(1000);
        do {
            System.out.println("Informe o seu palpite!");
            palpite = sc.nextInt();
            //comparação se o numero informado pelo o usuario é igual a o numero aleatório, caso a o contrario informara se o numero é maior ou menor a o  numero aleatório
            if (palpite == nAleatorio) {
                System.out.println("Parabens!!! \nVocê adivinhou o numero!");
                System.out.println("Você acertou em "+i+" tentativas!");

            } else if (palpite > nAleatorio) {
                System.out.println("Palpite Errado! \nSeu palpite é maior que o valor correto! \nDigite novamente!");
                i++;

            } else {
                System.out.println("Palpite Errado! \nSeu palpite é menor que o valor correto! \nDigite novamente!");
                i++;
            }
        } while (nAleatorio != palpite);
        
    }
//atividade3 - vetor
    public void exercicio3(){ 
        int vetor[] = new int[rd.nextInt(900)+100];//criar um vetor de no minimo 100-1000 itens com tamanho aleatorio
        int nPar[] = new int[vetor.length], nImpar[] = new int[vetor.length];//vetores para receber numeros pares e impares
        int imp=0,par=0,impPpar=0,parPimp=0; //impPpar=numeros impares com a posição do vetor sendo um numero par
        //parPimp=numeros pares com a posição do vetor sendo um numero impar
        for (int i = 0; i < vetor.length; i++) {
            vetor[i]=rd.nextInt(100)+1;//vetor recebera valores do 1 até 100

            //comparação se o número é par senão o número é  impar
            if(vetor[i] % 2 == 0 ){
               nPar[par] = vetor[i];
               if(i%2!=0){//comparação se o valor da posição par do vetor é impar
                impPpar++;
               }
               par++;

            }else{
                nImpar[imp] = vetor[i];
                if(i%2==0){//comparação se o valor da posição impar do vetor é  par
                    parPimp++;
                   }
               imp++;
            }
        }
        //imprimir o vetor aleatorio de valores do 1 até 100
        System.out.println("Valores do vetor com "+vetor.length+" Indices");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+";");
        }
        System.out.println("\n----------------------------------------------------------------------------------------------------");
       //imprimir os numeros pares do vetor
        System.out.println("Valores Pares do vetor");
        for (int i = 0; i < par; i++) {
            System.out.print(nPar[i]+";");
        }
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        //imprimir os numeros impares do vetor
        System.out.println("Valores Impares do vetor");
        for (int i = 0; i < imp; i++) {
            System.out.print(nImpar[i]+";");
        }
        System.out.println("\n-----------------------------------------------------------------------------------------");

        System.out.println("\nhá "+parPimp+ " números pares nas posições ímpares do vetor:");
        System.out.println("há "+impPpar+ " números ímpares nas posições pares do vetor:");



    }
}
