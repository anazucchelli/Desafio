import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> listaAlunos;
    private List<Professor> listaProfessor;
    private List<Curso> listaCurso;
    private List<Matricula> listaMatricula;

    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos){
        Curso curso = new Curso(codigoCurso,nome,quantidadeMaximaDeAlunos);
        listaCurso.add(curso);
    }

    public void excluirCurso(Integer codigoCurso){
        for(int i=0; i<listaCurso.size(); i++){
            if(listaCurso.get(i).getNumeroCurso().equals(codigoCurso));
            listaCurso.remove(i);
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){
        ProfessorAdjunto professorAdjunto1 = new ProfessorAdjunto(nome,codigoProfessor,sobrenome,quantidadeDeHoras);
        listaProfessor.add(professorAdjunto1);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){
        ProfessorTitular professorTitular1 = new ProfessorTitular(nome,codigoProfessor,sobrenome,especialidade);
        listaProfessor.add(professorTitular1);
    }

    public void excluirProfessor(Integer codigoProfessor) {
        for (int i = 0; i < listaProfessor.size(); i++) {
            if (listaProfessor.get(i).getCodigoProf().equals(codigoProfessor)) ;
            listaProfessor.remove(i);
        }
    }

    public void matricularAluno(String nome, String sobrenome,Integer codigoAluno){
        Aluno aluno1 = new Aluno(nome,sobrenome,codigoAluno);
        listaAlunos.add(aluno1);
    }

    public String matricularAlunoCurso(Integer codigoAluno, Integer codigoCurso){
        //encontrar curso
        Curso curso1 = null;
        Aluno aluno1 = null;
        for(int i =0; i < listaCurso.size(); i++){
            if(listaCurso.get(i).getNumeroCurso().equals(codigoCurso)){
                curso1 = listaCurso.get(i);
            }
        }

        if(curso1 == null){
            return "Curso não encontrado!";
        }

        //encontrar aluno
        for (int i=0; i<listaAlunos.size(); i++){
            if(listaAlunos.get(i).getNumeroAluno().equals(codigoAluno)) {
                aluno1 = listaAlunos.get(i);
            }
        }

        if(aluno1 == null){
            return "Aluno não encontrado!";
        }
        //Aluno matriculado
        curso1.adicionarUmAluno(aluno1);


        //criar matricula
        Matricula matricula1 = new Matricula(aluno1,curso1);
        if(curso1.quantMaxAlunos > listaMatricula.size()){
            listaMatricula.add(matricula1);
            System.out.println("Matricula realizada!");
        }else {
            System.out.println("Não existe vaga disponível!");
        }

        return null;
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){

    }


}
