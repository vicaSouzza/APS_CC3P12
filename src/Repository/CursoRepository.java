package Repository;

import Entidades.Curso;

import java.util.List;
import java.util.stream.Collectors;

public class CursoRepository{

    /**
     * Retorna uma lista de cursos por nome de aluno
     * */
    public List<Curso> getAlunosByCursos(String nome){
        return stream().filter(a -> a.getNome().equals(nome)).collect(Collectors.toList());
    }


}
