package Entidades;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlunoCursos {
	private Aluno aluno;
	private List<Curso> cursos;
	private Map<Aluno, List<Curso>> alunoCursos;
	private List<Map<Aluno,List<Curso>>> alunosCursos;
	
	public AlunoCursos(Aluno aluno, List<Curso> cursos) {
		this.aluno = aluno;
		this.cursos = cursos;
		this.alunoCursos = new HashMap<>();
		this.alunoCursos.put(aluno, cursos);
	}
	
	public Map<Aluno, List<Curso>> getAlunoCursos(){
		return this.alunoCursos;
	}
	
	public void setAlunoCursos(Map<Aluno, List<Curso>> _alunoCursos){
		for(int i = 0; i < this.alunosCursos.size(); i++) {
			if(this.alunosCursos.get(i) != _alunoCursos) {
				this.alunoCursos = _alunoCursos;
				this.alunosCursos.add(_alunoCursos);
			}
		}
	}
	
	public List<Map<Aluno,List<Curso>>> getAlunosCursos(){
		return this.alunosCursos;
	}
	
	public void editarCursosDoAluno(int idAluno, List<Curso> novaListaDeCursos) {
		
	}
}
