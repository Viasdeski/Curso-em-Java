package oo.composicao;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		
		Aluno aluno1 = new Aluno("Ana");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Braga");
		
		Curso curso1 = new Curso("JAVA");
		Curso curso2 = new Curso("PYHTON");
		Curso curso3 = new Curso("SQL");
		
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		aluno3.adicionarCurso(curso1);
		aluno3.adicionarCurso(curso3);
		aluno1.adicionarCurso(curso2);
		
		aluno1.adicionarCurso(curso1);
		aluno2.adicionarCurso(curso1);
		aluno3.adicionarCurso(curso1);
		
		
		for(Aluno aluno : curso1.alunos) {
			System.out.printf("Sou %s e estou matriculado no curso %s. \n", aluno, curso1);
		}
		
		
		System.out.println(aluno1.cursos.get(0));
		System.out.println(aluno1.cursos.get(1));
		System.out.println(aluno1.cursos.get(2));
		
		System.out.println("O aluno está no curso: " + aluno3.getCurso("JAVA"));
		System.out.println("O aluno está no curso: " + aluno3.getCurso("SQL"));
	
		
	}

}
