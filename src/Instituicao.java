import java.util.ArrayList;
import java.util.Scanner;

public class Instituicao {
    Aula aula;
    ArrayList<Aula> Aulas = new ArrayList<>();

    Scanner entrada = new Scanner(System.in);

    void criarAula(){
        System.out.println("Insira o Nome do Professor:");
        String nProfessor = entrada.nextLine();
        System.out.println("Insira o Nome da Materia");
        String nMateria = entrada.nextLine();
        System.out.println("Insira o Turno da Aula:");
        String nTurno = entrada.nextLine();
        Aula aula = new Aula();
        aula.setNomeMateria(nMateria);
        aula.setNomeProfessor(nProfessor);
        aula.setTurno(nTurno);
        Aulas.add(aula);
    }

    void removerAula(){
        listarAulas();
        int remover;
        
        while(true){
            System.out.printf("Insira o numero da Materia que deseja excluir a Aula:\n");
            remover = entrada.nextInt();
            if (remover < 0 || remover > Aulas.size()){
                System.out.println("Opção invalida!!!");
            }else{
                Aulas.remove(remover);
                System.out.println("Aula removida com sucesso");
                break;
            }
        }
    }

    boolean listarAulas(){
        if (Aulas.isEmpty()){
            System.out.println("Nenhuma Aula criada");
            return false;
        }else{
            for (Aula i : Aulas){
                System.out.println(Aulas.indexOf(i) + "\t" + i.getNomeMateria() + "-" + i.getNomeProfessor() + "-" + i.getTurno());
            }
            return true;
        }
    }

    void atualizarAula(){
        listarAulas();
        System.out.println("Qual a Materia da Aula que deseja atualizar:");
        String entradaMateria = entrada.nextLine();
        int x = 0;
        for (Aula i : Aulas){
            if (entradaMateria.equals(i.getNomeMateria())){
                System.out.println("Insira o novo nome da Materia da Aula:");
                String novaentradaMateria = entrada.nextLine();
                i.setNomeMateria(novaentradaMateria);
                System.out.println("Insira o novo Turno da Materia:");
                String entradaTurno = entrada.nextLine();
                i.setTurno(entradaTurno);
                System.out.println("Insira o novo Nome do Professor da Materia:");
                String novoNomeProfessor = entrada.nextLine();
                i.setNomeProfessor(novoNomeProfessor);
                break;
            }else if(x == Aulas.size()-1){
                System.out.println("Aula não encontrada");
            }
            x++;
        }
    }

    public Aula getAulas() {
        if (!Aulas.isEmpty()) {
            listarAulas();
            System.out.println("Qual materia você quer buscar?");
            String entradaString = entrada.nextLine();
            for (Aula i : Aulas){
                if (i.getNomeMateria().equals(entradaString)){
                    return i;
                } 
            }
        }
        return null;
    }
}
