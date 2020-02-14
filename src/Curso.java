import java.util.Objects;

public class Curso {
    public Integer numeroCurso;
    public String nome;


    public Curso(Integer numeroCurso, String nome) {
        this.numeroCurso = numeroCurso;
        this.nome = nome;
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
}
