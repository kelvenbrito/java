package VetoresArrays;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);
    Scanner sd = new Scanner(System.in);

    public void Exemplo1() {
        double[] valores = new double[] { 10.5, 15.8, 7.6, -17.6 };
        System.out.println("O primeiro elemento do vetor - valores[0] é " + valores[0]);
        System.out.println("O segundo elemento do vetor - valores[1] é " + valores[1]);
        System.out.println("O terceiro elemento do vetor - valores[2] é " + valores[2]);
        System.out.println("O quarto elemento do vetor - valores[3] é " + valores[3]);
        System.out.println("Digite um novo valor para a 4º posição/indice 3 ");
        valores[3] = sc.nextDouble();
        System.out.println("O novo valor da 4ºPosição/indice 3 é " + valores[3]);

    }

    public void Exemplo2() {
        // criando um vetor [vazio]

        int valoresInt[] = new int[5];
        System.out.println("Digite 5 valores inteiros ");
        valoresInt[0] = sc.nextInt();
        valoresInt[1] = sc.nextInt();
        valoresInt[2] = sc.nextInt();
        valoresInt[3] = sc.nextInt();
        valoresInt[4] = sc.nextInt();
        System.out.println("O 1º elemento do Vetor - indice[0] " + valoresInt[0]);
        System.out.println("O 2º elemento do Vetor - indice[0] " + valoresInt[1]);
        System.out.println("O 3º elemento do Vetor - indice[0] " + valoresInt[2]);
        System.out.println("O 4º elemento do Vetor - indice[0] " + valoresInt[3]);
        System.out.println("O 5º elemento do Vetor - indice[0] " + valoresInt[4]);
    }

    public void Exercicio1() {
        int[] valores = new int[5];
        int x = 1, n = 0;
        for (int c = 0; c < valores.length; c++) {
            System.out.println("Digite o " + x + "º valor");
            valores[c] = sc.nextInt();
            x++;
        }
        x = 1;
        while (n < valores.length) {

            System.out.println(x + "º numero é " + valores[n]);
            x++;
            n++;
        }

    }

    public void Exercicio2() {
        double[] valores = new double[10];
        int x = 10, p = 1;

        for (int c = 0; c < valores.length; c++) {
            System.out.println("Digite o " + p + "º valor");
            valores[c] = sc.nextDouble();
            p++;
        }

        System.out.println("Os numeros em ordem decrescente são ");
        for (int n = valores.length - 1; n >= 0; n--) {
            System.out.println(x + "º = " + valores[n] + ", ");
            x--;
        }

    }

    public void Exercicio3() {
        double[] notas = new double[4];
        double somaN = 0, media = 0;
        int x = 1;
        for (int c = 0; c < notas.length; c++) {
            System.out.println("Digite a " + x + "º Notas ");
            notas[c] = sc.nextDouble();

            somaN += notas[c];
            x++;
        }
        media = somaN / 4;

        System.out.println("A média é: " + media);
    }

    public void Exercicio4() {
        String[] caracter = new String[10], caract1 = new String[caracter.length],
                caract2 = new String[caracter.length];
        int p = 0, x = 1, s = 0, c;

        for (c = 0; c < caracter.length; c++) {

            System.out.println("Digite a " + x + "º caracter ");
            caracter[c] = sc.nextLine();

            if (

            caracter[c].toLowerCase().equals("a")
                    || caracter[c].toLowerCase().equals("e")
                    || caracter[c].toLowerCase().equals("i")
                    || caracter[c].toLowerCase().equals("o")
                    || caracter[c].toLowerCase().equals("u")) {

                caract2[p] = caracter[c];
                p++;

            } else {
                caract1[s] = caracter[c];
                s++;
            }
            x++;
        }

        System.out.println("As vogais são:");
        for (c = 0; c < p; c++) {
            System.out.print(caract2[c] + ",");
        }

        System.out.println("\nAs consoantes são:");
        for (c = 0; c < s; c++) {
            System.out.print(caract1[c] + ",");
        }

        System.out.println("\nNumero total de vogais: " + p);
        System.out.println("Numero total de consoantes: " + s);
    }

    public void Exercicio4b() {
        String palav;
        int p = 0, s = 0, c;
        ;

        System.out.println("Digite sua Frase: ");
        palav = sc.nextLine();

        char[] caracter = new char[palav.length()],
                caract2 = new char[palav.length()];

        for (c = 0; c < palav.length(); c++) {

            if ((palav.toLowerCase().charAt(c) == 'a') || (palav.toLowerCase().charAt(c) == 'e')
                    || (palav.toLowerCase().charAt(c) == 'i') || (palav.toLowerCase().charAt(c) == 'o')
                    || (palav.toLowerCase().charAt(c) == 'u')) {

                caract2[p] = palav.charAt(c);
                p++;

            } else {
                caracter[s] = palav.charAt(c);
                s++;
            }

        }

        System.out.println("As vogais são:");
        for (c = 0; c < p; c++) {
            System.out.print(caract2[c] + ",");
        }

        System.out.println("\nAs consoantes são:");
        for (c = 0; c < s; c++) {
            System.out.print(caracter[c] + ",");
        }

        System.out.println("\nNumero total de vogais: " + p);
        System.out.println("Numero total de consoantes: " + s);
    }

    public void Exercicio5() {
        int[] numInter = new int[20], numPar = new int[numInter.length], numImpar = new int[numInter.length];
        int c, x = 1, p = 0, i = 0;
        double k, t;
        for (c = 0; c < numInter.length; c++) {
            System.out.println("Digite o " + x + "º valor");
            numInter[c] = sc.nextInt();
            k = numInter[c];

            t = k % 2;

            if (t == 0) {
                numPar[p] = numInter[c];
                p++;
            } else {
                numImpar[i] = numInter[c];
                i++;
            }
            x++;
        }

        System.out.println("\nNumeros inteiros");
        for ( c = 0; c < numInter.length; c++) {
            System.out.print(numInter[c] + ",");
        }
        System.out.println("\nNumeros Pares");
        for (c = 0; c < p; c++) {
            System.out.print(numPar[c] + ",");
        }
        System.out.println("\nNumeros Impares");
        for (c = 0; c < i; c++) {

            System.out.print(numImpar[c] + ",");

        }
    }

    public void Exercicio6() {
        int alunos = 0, c, x = 1;
        double nota1, nota2, nota3, nota4;
        String[] nome = new String[3], nomeApro = new String[nome.length];
        double[] media = new double[nome.length], mediaAprov = new double[nome.length];

        for (c = 0; c < nome.length; c++) {
            System.out.println(x + "º aluno");
            System.out.println("Digite o  nome do aluno");
            nome[c] = sc.nextLine();
            System.out.println("Digite a 1º nota do aluno");
            nota1 = sc.nextDouble();
            System.out.println("Digite a 2º nota do aluno");
            nota2 = sc.nextDouble();
            System.out.println("Digite a 3º nota do aluno");
            nota3 = sc.nextDouble();
            System.out.println("Digite a 4º nota do aluno");
            nota4 = sc.nextDouble();
            media[c] = (nota1 + nota2 + nota3 + nota4) / 4;
            if (media[c] >= 7) {

                mediaAprov[alunos] = media[c];
                nomeApro[alunos] = nome[c];
                alunos++;
            }
            x++;
        }

        System.out.println("Total de alunos com média maior ou igual a 7: " + alunos);

        for (c = 0; c < alunos; c++) {
            System.out.println("Aluno: " + nomeApro[c] + " média: " + mediaAprov[c] + ".");

        }

    }

    public void Exercicio7() {
        int[] num = new int[5];
        int c, x = 1, multp = 1, soma = 0;

        for (c = 0; c < num.length; c++) {
            System.out.println("Digite o " + x + "º valor:");
            num[c] = sc.nextInt();
            soma += num[c];
            multp *= num[c];
            x++;
        }
        System.out.println("Números: ");
        for (int s : num) {
            System.out.print(s + ",");
        }

        System.out.println("\nSoma: " + soma);
        System.out.println("Multiplicação: " + multp);
    }

    public void Exercicio8() {
        String[] nome = new String[3];
        double[] alt = new double[nome.length];
        int[] idade = new int[nome.length];
        int c, x = 1;

        for (c = 0; c < nome.length; c++) {
            System.out.println(x + "º Pessoa");
            System.out.println("Digite o nome: ");
            nome[c] = sc.nextLine();
            System.out.println("Digite a idade: ");
            idade[c] = sc.nextInt();
            System.out.println("Digite a altura: ");
            alt[c] = sc.nextDouble();
            x++;

        }

        for (c = nome.length - 1; c >= 0; c--) {
            System.out.println("--------------------");
            System.out.println("Nome: " + nome[c]);
            System.out.println("Idade: " + idade[c]);
            System.out.println("Altura: " + alt[c]);

        }

    }

    public void Exercicio9() {
        int[] num = new int[10], eleQuat = new int[num.length];
        int c, x = 1, soma = 0, p = 0;

        for (c = 0; c < num.length; c++) {
            System.out.println("Digite o " + x + "º numero:");
            num[c] = sc.nextInt();
            eleQuat[c] = num[c] * num[c];
            soma += eleQuat[c];

            x++;
        }

        while (p < num.length) {
            System.out.println(num[p] + " Elevado ao quadrado: " + eleQuat[p]);
            p++;
        }
        System.out.println("Soma dos números Elevado ao quadrado: " + soma);
    }

}
