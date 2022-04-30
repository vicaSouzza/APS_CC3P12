package Controller;

import java.util.List;

import Entidades.Aluno;
import Entidades.Curso;
import Repository.AlunoRepository;
import Repository.CursoRepository;

public class AlunoCursoController {
	
	/**private CursoRepository cursoRepository;
	private AlunoRepository alunoRepository;
	
	public AlunoCursoController(CursoRepository cRepository, AlunoRepository aRepository) {
		cursoService = cRepository;
		alunoRepository = aRepository;
	}
	
	public void alterarCursoDoAluno(int idAluno, Curso cursoAlterado) {
		try {
			Aluno alunoDoBanco = alunoRepository.getAlunoById(idAluno);
			if(idAluno > 0 && alunoDoBanco != null) {
				boolean cursoExistente = false;
				List<Curso> cursosJaExistentes = cursoService.getCursosDoAlunoPorId(idAluno);
				
				for(Curso curso : cursosJaExistentes) {
					if(curso.getNome() == cursoAlterado.getNome() && curso.getAno() == cursoAlterado.getAno()) {
						System.out.println("Curso já existente, não é possivel inserir um curso ja existente em um aluno.");
						cursoExistente = true;
					}
				}
				
				
				if(!cursoExistente)
					cursoService.salvaCursosParaAlunoId(idAluno, cursoAlterado);
				else
					System.out.println("Erro ao alterar curso do aluno");
			}else {
				System.out.println("Informe o Id do aluno corretamente.");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage()+"/n"+e.getStackTrace());
			return;
		}
	}*/
	
}