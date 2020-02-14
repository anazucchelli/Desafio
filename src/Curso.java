import java.util.List;
import java.util.Objects;

public class Curso{
    public Integer numeroCurso;
    public String nome;
    public ProfessorTitular professorTitular;
    public ProfessorAdjunto professorAdjunto;
    public Integer quantMaxAlunos;
    public List<Aluno> listaAlunos;


    public Curso() {
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
