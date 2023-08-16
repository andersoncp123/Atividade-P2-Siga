public class Aluno {
    private String CPF;
    private String Nome;
    private Boolean Falta;

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setFalta(Boolean falta) {
        Falta = falta;
    }
    
    public String getCPF() {
        return CPF;
    }
    public String getNome() {
        return Nome;
    }
    public Boolean getFalta() {
        return Falta;
    }
}
