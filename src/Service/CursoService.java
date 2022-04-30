package Service;

import Entidades.Aluno;
import Entidades.Curso;
import Repository.CursoRepository;

import java.util.Collection;
import java.util.List;

public class CursoService {
    private CursoRepository cursoRepository = new CursoRepository();

    /**
     * Retorna todos cursos
     * cursoCSV precisa ser carregado a partir do database
     * */
    public Curso getAllCursos(){

        Collection<Curso> cursos = cursoCSV.load();

        for(Curso curso : cursos) {
            System.out.println(curso);
        }

        return (Curso) cursos;
    }

    /**
     * Retorna uma lista de cursos por nome de aluno
     * */
    public List<Curso> getCursosByAluno(String nome){
        return cursoRepository.getAlunosByCursos(nome);
    }

}
