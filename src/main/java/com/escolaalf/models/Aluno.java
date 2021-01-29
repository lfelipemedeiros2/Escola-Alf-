package com.escolaalf.models;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nome;
	private List<String> provaDoAluno = new ArrayList<>();
	private int nota;
	
	public Aluno(String nome, List<String> provaDoAluno) {
		super();
		this.nome = nome;
		this.provaDoAluno = provaDoAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getProvaDoAluno() {
		return provaDoAluno;
	}

	public void setProvaDoAluno(List<String> provaDoAluno) {
		this.provaDoAluno = provaDoAluno;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", provaDoAluno=" + provaDoAluno + "]";
	}


}
