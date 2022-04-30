package Service;

import Entidades.Aluno;
import Repository.AlunoRepository;

import java.util.Collection;
import java.util.List;

public class AlunoService {
    private AlunoRepository repository = new AlunoRepository();

    /**
     * Retorna todos alunos
     * alunoCSV precisa ser carregado a partir do database
     * */
    public Aluno getAllAlunos(){
        Collection<Aluno> alunos = alunoCSV.load();

        for(Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        return (Aluno) alunos;
    }

    /**
     * Retorna uma lista de alunos por nome de curso
     * */
    public List<Aluno> getAlunosByCurso(String curso){
        return repository.getAlunosByCurso(curso);
    }
}
