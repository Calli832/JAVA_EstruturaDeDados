package Atividade_3.Recursão;

import java.util.Scanner;

public class Recursao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op = 0;
        int loop = 1;

        while(loop > 0)
        {
            System.out.println("\n-----------------------------------------------------------------------");
            System.out.println("\nSelecione a opção que desejar:\n");
            System.out.println("<1> Imprimi os números de 0 a N, decrescente\n<2> Imprimi os números pares de 0 a N, crescente\n<3> Recebe um número par, imprimi todos de os pares de 0 a N, decrescente\n<4> Exibe todos os elementos de um Array separados por espaços\n<5> Encontra o menor número de um vetor e o retorna\n<9> Sair");
            op = input.nextInt();

            switch(op){
                case 1:
                    int c1 = 0;
                    System.out.println("Digite o tamanho da lista");
                    c1 = input.nextInt();
                    imprimeLista(c1);
                    break;

                case 2:
                    int c2 = 0;
                    System.out.println("Digite o tamanho da lista");
                    c2 = input.nextInt();
                    imprimePar(c2);
                    break;

                case 3:
                    int c3 = 0;
                    System.out.println("Digite o tamanho da lista");
                    c3 = input.nextInt();
                    imprimePar2(c3);
                    break;

                case 4:
                    int c4 = 0;
                    System.out.println("Digite o tamanho do vetor");
                    c4 = input.nextInt();
                    int[] v = new int[c4];
                    System.out.println("Digite os elementos do Vetor");
                    for(int i = 0; i < c4; i++){
                        v[i] = input.nextInt();
                    }
                    imprimiVetor(v, c4);
                    break;
                
                case 5:
                    int c5 = 0;
                    int menor;
                    System.out.println("Digite o tamanho do vetor");
                    c5 = input.nextInt();
                    int[] vet = new int[c5];
                    System.out.println("Digite os elementos do Vetor");
                    for(int i = 0; i < c5; i++){
                        vet[i] = input.nextInt();
                    }
                    menor = retornaMenor(vet, 0, vet.length-1);
                    System.out.println("\nO menor numero do vetor: " + menor);
                    break;
                
                case 9:
                    loop = 0;
                    break;

                default:
                    System.out.println("Número errado, digite novamente");
            }
        }
        input.close();
    }

//============================
    public static void imprimeLista(int N){
        if(N == -1)
            return;
        System.out.println(N);
        imprimeLista(N - 1);
    }
    public static void imprimePar(int N){
        if(N < 0)
            return;
        imprimePar(N-2);
        System.out.println(N);
        //lovely
    }
    public static void imprimePar2(int N){
        if(N == 0){
            System.out.println(0);
            return;
        }
        if(N % 2 == 0)
            System.out.println(N);
            imprimePar2(N - 1);
    }
    public static void imprimiVetor(int[] vetor, int N){
        if(N == 1){
            System.out.print(vetor[N - 1] + " ");    
        }else{
            imprimiVetor(vetor, N - 1);
            System.out.print(vetor[N - 1] + " ");
        }
    }
    public static int retornaMenor(int[] vetor, int N, int low){
        if(N == low)
            return vetor[N];
        else{
            int s1,s2;
            int b;

             b = (N + low) / 2;
             s1 = retornaMenor(vetor, N, b);
             s2 = retornaMenor(vetor, b+1, low);

             if(s1 < s2)
                return s1;
            else
                return s2;
        }
        
    }
//============================
}
