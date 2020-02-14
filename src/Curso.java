import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso extends Aluno{
    public Integer numeroCurso;
    public String nome;
    public ProfessorTitular professorTitular;
    public ProfessorAdjunto professorAdjunto;
    public Integer quantMaxAlunos;
    List<Aluno> listaAlunos = new ArrayList<>();


    public Curso() {
    }


    public Curso(Integer numeroCurso, String nome, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto, Integer quantMaxAlunos, List<Aluno> listaAlunos) {
        this.numeroCurso = numeroCurso;
        this.nome = nome;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.quantMaxAlunos = quantMaxAlunos;
        this.listaAlunos = listaAlunos;
    }

    public Curso(Integer numeroCurso, String nome, Integer quantMaxAlunos) {
        this.numeroCurso = numeroCurso;
        this.nome = nome;
        this.quantMaxAlunos = quantMaxAlunos;
    }

    public boolean adicionarUmAluno(Aluno umAluno){
        if(listaAlunos.size() < quantMaxAlunos){
            listaAlunos.add(umAluno);
            System.out.println("Aluno adicionado com sucesso!"+ umAluno.getNome());
            return true;
    }else{
            System.out.println("Não há vagas disponíveis");
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno){
        listaAlunos.remove(umAluno);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(numeroCurso, curso.numeroCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroCurso);
    }

    public Integer getNumeroCurso() {
        return numeroCurso;
    }

    public void setNumeroCurso(Integer numeroCurso) {
        this.numeroCurso = numeroCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQuantMaxAlunos() {
        return quantMaxAlunos;
    }

    public void setQuantMaxAlunos(Integer quantMaxAlunos) {
        this.quantMaxAlunos = quantMaxAlunos;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }


}
