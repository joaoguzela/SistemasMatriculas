package view;

import java.util.Date;

import controller.MatBiz;
import model.Aluno;
import utilitarios.Console;

public class InterfaceUsuario {
	
	private static MatBiz objMatBiz = new MatBiz();
	
	public static void main(String[] args) {
		menu();
	}

	private static void menu() {

		int opcao = 0;
		do {

			System.out.println("Sistema de cadastro de matrículas");
			System.out.println("1 - Cadastrar Aluno");
			System.out.println("2 - Consultar Aluno");
			System.out.println("3 - Cadastrar Curso");
			System.out.println("4 - Consultar Curso");
			System.out.println("5 - Matricular aluno");
			System.out.println("6 - Desmatricular aluno");
			System.out.println("7 - Consultar matrícula");
			System.out.println("0 - Sair");

			opcao = Console.readInt("Digite a opção desejada: ");

			switch (opcao) {
			case 0:
				break;
			case 1:
				cadastrarAluno();
				break;
			case 2:
				consultarAluno();
				break;
			case 3:
				cadastrarCurso();
				break;
			case 4:
				consultarCurso();
				break;
			case 5:
				matricularAluno();
				break;
			case 6:
				desmatricularAluno();
				break;
			case 7:
				consultarMatricula();
				break;
			default:
				break;
			}
		} while (opcao != 0);

	}

	private static void consultarMatricula() {
		// TODO Auto-generated method stub

	}

	private static void desmatricularAluno() {
		// TODO Auto-generated method stub

	}

	private static void matricularAluno() {
		// TODO Auto-generated method stub

	}

	private static void consultarCurso() {
		// TODO Auto-generated method stub

	}

	private static void cadastrarCurso() {
		// TODO Auto-generated method stub

	}

	private static void consultarAluno() {
		// TODO Auto-generated method stub

	}

	private static void cadastrarAluno() {
		
		System.out.println("Cadastro de Aluno");
		
		Aluno aluno = new Aluno();
		
		aluno.setNomeAluno(Console.readLine("Digite o nome do aluno:"));
		aluno.setCpf(Console.readLine("Digite a cpf:"));
		aluno.setDataEntrada(new Date(Console.readLine("Digite a data:")));
		aluno.setCodigoAluno(Console.readInt("Digite o código"));
		
		Boolean validaCadastro = objMatBiz.cadastrarAluno(aluno);
		
		if(validaCadastro) {
			System.out.println("Cadastrado com sucesso");
		}else {
			System.out.println("Erro ao cadastrado");
		}
	}
}
