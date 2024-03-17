package model;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
	
	private String nome;
	private LocalDate dataNascimento;
	private String profissao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		
		return dataNascimento;
	}
	public void setDataNascimento(int dia, int mes, int ano) throws DateTimeException, Exception {
		
		LocalDate data = LocalDate.of(ano,mes,dia);

		if(LocalDate.now().isBefore(data)) throw new Exception("A data de nascimento não pode ser maior que a data atual");
		if( LocalDate.now().getYear() - data.getYear() > 150) throw new Exception("Uma pessoa não pode ter mais que 150 anos");
		
		this.dataNascimento = data;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public Long getIdade() {
		
		return Math.abs(ChronoUnit.YEARS.between(LocalDate.now(), dataNascimento));
	}
	

}
