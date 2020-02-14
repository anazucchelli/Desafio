import java.util.Objects;

public class Aluno {
    private Integer numeroAluno;
    private String nome;
    private String sobrenome;

    public Aluno() {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Aluno(String nome, String sobrenome, Integer codigoAluno) {
    }

    public Aluno(Integer codigoAluno, Integer codigoCurso) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(numeroAluno, aluno.numeroAluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroAluno);
    }

    public Integer getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(Integer numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

}



