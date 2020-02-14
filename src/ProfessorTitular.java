public class ProfessorTitular extends Professor {
    public String especialidade;

    public ProfessorTitular() {
        super();
    }

    public ProfessorTitular(String nome, Integer codigoProfessor, String sobrenome, String especialidade) {
        super();

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
