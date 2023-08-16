import java.util.ArrayList;
import java.util.Scanner;

public class Aula {
    String NomeMateria;
    String NomeProfessor;
    String Turno;
    ArrayList<Aluno> Alunos = new ArrayList<>();

    Scanner entrada = new Scanner(System.in);

    void matricular(){
        Aluno aluno = new Aluno();
        System.out.printf("Informe o CPF do Aluno:\n");
        String cpfAluno = entrada.nextLine();
        System.out.printf("Informe o Nome do Aluno:\n");
        String nomeAluno = entrada.nextLine();
        aluno.setCPF(cpfAluno);
        aluno.setNome(nomeAluno);
        aluno.setFalta(false);
        Alunos.add(aluno);
    }

    void removerAluno(){
        listarAlunos();
        while(true){
            int remover;
            System.out.printf("Informe o Aluno a ser removido:\n");
            remover = entrada.nextInt();
            if (remover < 0 || remover > Alunos.size()){
                System.out.println("Entrada invalida!!!");
            }else{
                Alunos.remove(remover);
                System.out.println("Aluno removido com sucesso");
                break;
            }
        }
    }

    void listarAlunos(){
        for (Aluno i : Alunos){
            System.out.print(Alunos.indexOf(i) +"\t"+ i.getCPF() +"-"+ i.getNome() +"-");
            if (i.getFalta() == false){
                System.out.println("Presente");
            }else if (i.getFalta() == true){
                System.out.println("Faltou");
            }else{
                System.out.println("indefinido"); 
            }
        }
    }

    void chamada(){
        for (Aluno i : Alunos){
            while(true){
                System.out.printf("O aluno " + i.getNome()+ " faltou? [0 - Faltou | 1 - Presente]\n");
                int falta = entrada.nextInt();
                if (falta == 0){
                    i.setFalta(true);
                    break;
                }else if (falta == 1){
                    i.setFalta(false);
                    break;
                }else{
                    System.out.println("Opção invalida!!!\n");
                }
            }
        }
    }

    void atualizarAluno(){
        System.out.println("Qual o CPF do aluno que deseja atualizar:");
        String entradaCPF = entrada.nextLine();
        int x = 0;
        for (Aluno i : Alunos){
            if (entradaCPF.equals(i.getCPF())){
                System.out.println("Insira o novo CPF para o Aluno:");
                String novaentradaCPF = entrada.nextLine();
                i.setCPF(novaentradaCPF);
                System.out.println("Insira o novo Nome do Aluno:");
                String entradaNome = entrada.nextLine();
                i.setNome(entradaNome);
                break;
            }else if(x == Alunos.size()-1){
                System.out.println("Aluno não encontrado");
            }
            x++;
        }
    }

    public void setNomeMateria(String nomeMateria) {
        NomeMateria = nomeMateria;
    }

    public void setNomeProfessor(String nomeProfessor) {
        NomeProfessor = nomeProfessor;
    }

    public void setTurno(String turno) {
        Turno = turno;
    }

    public String getNomeMateria() {
        return NomeMateria;
    }

    public String getNomeProfessor() {
        return NomeProfessor;
    }

    public String getTurno() {
        return Turno;
    }
}
