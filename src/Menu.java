import java.util.Scanner;

public class Menu {
    Instituicao inst = new Instituicao();
    Aula aula = new Aula();

    Scanner entrada = new Scanner(System.in);

    void funcionarMenu1(){
        int entradaMenu = entrada.nextInt();

        switch (entradaMenu) {
            case 1:
                printarMenuAlunos();
                break;

            case 2:
                printarMenuAulas();
                break;

            case 3:
                System.exit(0);

            default:
                break;
        }
    }

    void funcionarMenu2(){
        int entradaMenu = entrada.nextInt();
        Aula x = inst.getAulas();

        if (x == null){
            System.out.println("Cadastre pelo menos uma Aula Antes!!!");
        }else{
            switch (entradaMenu){
                case 1:
                    x.matricular();
                    break;
                case 2:
                    x.listarAlunos();
                    break;
                case 3:
                    x.chamada();
                    break;
                case 4:
                    x.atualizarAluno();
                    break;
                case 5:
                    x.removerAluno();
                    break;
                case 6:
                    printarMenu();
                    break;
                default:
                    break;
            }
        }
    }

    void funcionarMenu3(){
        int entradaMenu = entrada.nextInt();

        switch (entradaMenu){
            case 1:
                inst.criarAula();
                break;
            case 2:
                inst.listarAulas();
                break;
            case 3:
                inst.atualizarAula();
                break;
            case 4:
                inst.removerAula();
                break;
            case 5:
                printarMenu();
                break;
            default:
                break;
        }
    }

    void printarMenu(){
        System.out.println("-----------------------------------------------");
        System.out.println("Escolha a opção da tarefa a ser executada");
        System.out.println("1- Menu de Alunos");
        System.out.println("2- Menu de Aulas");
        System.out.println("3- Sair");
        System.out.println("-----------------------------------------------");
        funcionarMenu1();
    }

    void printarMenuAlunos(){
        System.out.println("-----------------------------------------------");
        System.out.println("Escolha a opção da tarefa a ser executada");
        System.out.println("1- Cadastrar Aluno");
        System.out.println("2- Listar Alunos");
        System.out.println("3- Fazer Chamada dos Alunos");
        System.out.println("4- Atualizar Alunos");
        System.out.println("5- Remover Aluno");
        System.out.println("6- Voltar");
        System.out.println("-----------------------------------------------");
        funcionarMenu2();
    }

    void printarMenuAulas(){
        System.out.println("-----------------------------------------------");
        System.out.println("Escolha a opção da tarefa a ser executada");
        System.out.println("1- Cadastrar Aula");
        System.out.println("2- Listar Aulas");
        System.out.println("3- Atualizar Aula");
        System.out.println("4- Remover Aula");
        System.out.println("5- Voltar");
        System.out.println("-----------------------------------------------");
        funcionarMenu3();
    }
}
