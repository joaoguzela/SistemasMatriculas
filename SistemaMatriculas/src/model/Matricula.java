package model;

import java.util.Date;

public class Matricula {
	
	private int codigoMatricula;
	private Curso curso;
	private Aluno aluno;
	private Date dataMatricula;
	
	public Matricula() {
		
	}
	
	public int getCodigoMatricula() {
		return codigoMatricula;
	}
	public void setCodigoMatricula(int codigoMatricula) {
		this.codigoMatricula = codigoMatricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Date getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	
}
