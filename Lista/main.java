package Atividade_3.Lista;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        lista listinha = new lista();
        lista listinhaPar = new lista();
        lista listinhaImpar = new lista();
        lista listaD1 = new lista();
        lista listaD2 = new lista();
        lista listaJunta = new lista();
        
        Scanner input = new Scanner (System.in);
        int loop = 1;
        int op = 0;

        while(loop > 0)
        {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("\nSelecione a opção que desejar:\n");
            System.out.println("<1> Criar Elemento no Inicio\n<2> Criar Elemento no Final\n<3> Verificar se um valor pertence à lista\n<4> Exibe o primeiro Elemento\n<5> Exibe o ultimo Elemento\n<6> Verifica quantas vezes um valor se repete\n<7> Mostra a 1º vez que um elemento aparece\n<8> Separa a lista em par e ímpar\n<9> Realiza a mistura de duas listas\n<10> Sair");
            op = input.nextInt();

            switch(op){
                case 1:
                    int c1 = 0;
                    System.out.println("Digite o valor desejado");
                    c1 = input.nextInt();
                    listinha.insereInicio(c1);
                    break;

                case 2:
                    int c2 = 0;
                    System.out.println("Digite o valor desejado");
                    c2 = input.nextInt();
                    listinha.insereFim(c2);
                    break;

                case 3:
                    int c3 = 0;
                    System.out.println("Digite o valor desejado");
                    c3 = input.nextInt();
                    System.out.println(listinha.verifica(c3));
                    break;

                case 4:
                    System.out.println("O primeiro Elemento é -> " + listinha.getPrimeiro());
                    break;

                case 5:
                    System.out.println("O ultimo Elemento é -> " + listinha.getUltimo());
                    break;
                    
                case 6:
                    int c4 = 0;
                    System.out.println("Digite o valor desejado");
                    c4 = input.nextInt();
                    System.out.println("O valor se repete: " + listinha.verifica2(c4) + " vezes");
                    break;
                    
                case 7:
                    int c5 = 0;
                    System.out.println("Digite o valor desejado");
                    c5 = input.nextInt();
                    System.out.println("O numero está na posição: " + listinha.verifica3(c5));
                    break;
                
                case 8:
                    listinha.separar(listinhaPar, listinhaImpar);
                    System.out.println("Lista Par: ");
                    listinhaPar.print();
                    System.out.println("Lista Ímpar: ");
                    listinhaImpar.print();
                    break;
                
                case 9:
                    int c6 = 0;
                    int q = 0; 
                    System.out.println("Digite quantos números a Lista 1 terá");
                    q = input.nextInt();
                    System.out.println("Digite os números da lista 1");
                    for(int i = 0; i < q; i++){
                        c6 = input.nextInt();
                        listaD1.insereInicio(c6);
                    }
                    int c7 = 0;
                    int q1 = 0; 
                    System.out.println("Digite quantos números a Lista 2 terá");
                    q1 = input.nextInt();
                    System.out.println("Digite os números da lista 2");
                    for(int j = 0; j < q1; j++){
                        c7 = input.nextInt();
                        listaD2.insereInicio(c7);
                    }
                    listaJunta.junta(listaD1, listaD2);
                    listaJunta.print();
                    break;

                case 10:
                    loop = 0;
                    break;

                default:
                    System.out.println("Número errado, digite novamente");
            }

        }
        input.close();
    }
}
