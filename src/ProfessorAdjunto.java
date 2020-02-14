public class ProfessorAdjunto extends Professor {
    public Integer quantidadeHoras;

    public ProfessorAdjunto(String nome, Integer codigoProfessor, String sobrenome, Integer quantidadeDeHoras) {
    }

    public Integer getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(Integer quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }
}
