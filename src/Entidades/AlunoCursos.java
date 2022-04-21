package Entidades;

import java.util.HashMap;
import java.util.List;

public class AlunoCursos {
	private Aluno aluno;
	private List<Curso> cursos;
	private HashMap<Aluno, List<Curso>> alunoCursos;
	
	public AlunoCursos(Aluno aluno, List<Curso> cursos) {
		this.aluno = aluno;
		this.cursos = cursos;
		this.alunoCursos = new HashMap<>();
		this.alunoCursos.put(aluno, cursos);
	}
	
	public HashMap<Aluno, List<Curso>> getAlunoCursos(){
		return this.alunoCursos;
	}
	
	
	public void setAlunoCursos(HashMap<Aluno, List<Curso>> alunoCursos){
		this.alunoCursos = alunoCursos;
	}
	
	public void editarCursosDoAluno() {
		
	}
}
