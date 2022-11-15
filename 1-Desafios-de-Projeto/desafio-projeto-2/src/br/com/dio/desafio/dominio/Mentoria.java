package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {
	// Declaração do atributo específico desta classe
	private LocalDate dataMentoria = LocalDate.now().plusDays(7);
	
	// Deixando explícito o método construtor default 
	public Mentoria() {
		super();
	}
		
	// Criação dos métodos get e set 
	public LocalDate getDataMentoria() {
		return dataMentoria;
	}

	public void setDataMentoria(LocalDate dataMentoria) {
		this.dataMentoria = dataMentoria;
	}
	
	// Herdando o método calcularXp() da classe-mãe
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20;
	}
	
	// Criação do método toString()
	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataMentoriaFormatada = getDataMentoria().format(formatter);
		return "\n- Mentoria -\nNome: " + getTitulo() + "\nDescrição: \"" + getDescricao() + "\" \nData da Mentoria: " + dataMentoriaFormatada + "\n";
	}
}