import java.util.Objects;

public class Professor {
    private Integer codigoProf;
    private String nome;
    private String sobrenome;
    private Integer tempoCasa;

    public Professor(Integer codigoProf, String nome, String sobrenome, Integer tempoCasa) {
        this.codigoProf = codigoProf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoCasa = tempoCasa;
    }

    public Professor() {

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(codigoProf, professor.codigoProf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoProf);
    }

    public Integer getCodigoProf() {
        return codigoProf;
    }

    public void setCodigoProf(Integer codigoProf) {
        this.codigoProf = codigoProf;
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

    public Integer getTempoCasa() {
        return tempoCasa;
    }

    public void setTempoCasa(Integer tempoCasa) {
        this.tempoCasa = tempoCasa;
    }
}
