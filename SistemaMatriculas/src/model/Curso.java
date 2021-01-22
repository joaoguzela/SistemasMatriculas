package model;

public class Curso {

	private int codigoCurso;
	private String nomeCurso;
	private Double valorCurso;
	private int duracaoCurso;
	private int notaMec;

	public Curso() {

	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Double getValorCurso() {
		return valorCurso;
	}

	public void setValorCurso(Double valorCurso) {
		this.valorCurso = valorCurso;
	}

	public int getDuracaoCurso() {
		return duracaoCurso;
	}

	public void setDuracaoCurso(int duracaoCurso) {
		this.duracaoCurso = duracaoCurso;
	}

	public int getNotaMec() {
		return notaMec;
	}

	public void setNotaMec(int notaMec) {
		this.notaMec = notaMec;
	}

}
