package controller;

import java.util.ArrayList;

import model.Aluno;

public class MatBiz {

	private ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
	
	public Boolean cadastrarAluno(Aluno aluno) {
		return listaAlunos.add(aluno);
	}

}
