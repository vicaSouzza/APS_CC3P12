package Repository;

import Entidades.Aluno;

import java.util.List;
import java.util.stream.Collectors;

public class AlunoRepository{

    /**
     * Retorna uma lista os alunos por nome de curso
     * */
    public List<Aluno> getAlunosByCurso(String curso){
        return stream().filter(c -> c.getNome().equals(curso)).collect(Collectors.toList());
    }

}
