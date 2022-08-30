package Atividade_3.Pilhas;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        pilha pilhina1 = new pilha();
        pilha pilhina2 = new pilha();
        int loop = 1;
        int op = 0;
        
        while(loop > 0)
        {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("\nSelecione a opção que desejar:\n");
            System.out.println("<1> Criar Elemento\n<2> Exibe toda a pilha\n<3> Inverte a posição da Pilha\n<4> Qual pilha possui mais elementos\n<5> Verifica se as pilhas são iguais\n<9> Sair");
            op = input.nextInt();

            switch(op){
                case 1:
                    int c1 = 0;
                    int op1 = 0;
                    System.out.println("Qual pilha deseja colocar um elemento? \n1 - P1\n2 - P2");
                    op1 = input.nextInt();
                    if(op1 == 1){
                        System.out.println("Digite o valor desejado, para P1");
                        c1 = input.nextInt();
                        pilhina1.push(c1);
                    }else if(op1 == 2){
                        System.out.println("Digite o valor desejado, para P2");
                        c1 = input.nextInt();
                        pilhina2.push(c1);
                    }else
                        System.out.println("Opção incorreta");
                    break;

                case 2:
                    int op2 =0 ;
                    System.out.println("Qual pilha deseja imprimir?\n1 - P1\n2 - P2");
                    op2 = input.nextInt();
                    if(op2 == 1){
                        pilhina1.print();
                    }else if(op2 == 2){
                        pilhina2.print();
                    }else
                        System.out.println("Opção incorreta");
                    break;

                case 3:
                    int op3 =0 ;
                    System.out.println("Qual pilha deseja inverter?\n1 - P1\n2 - P2");
                    op3 = input.nextInt();
                    if(op3 == 1){
                        pilhina1.inverter();;
                    }else if(op3 == 2){
                        pilhina2.inverter();;
                    }else
                        System.out.println("Opção incorreta");
                    break;

                case 4:
                    System.out.println(pilhina1.elementos(pilhina2));
                    break;
                
                case 5:
                    System.out.println(pilhina1.iguais(pilhina2));
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
}
