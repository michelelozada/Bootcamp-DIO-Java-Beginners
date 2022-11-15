package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	// Declaração dos atributos da classe
	private String nome;
	private String descricao;
	private final LocalDate DATAINICIAL = LocalDate.now();
	private final LocalDate DATAFINAL = DATAINICIAL.plusDays(45);
	private Set<Dev> devsInscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
	// Criação dos métodos get e set 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDATAINICIAL() {
		return DATAINICIAL;
	}
	public Set<Dev> getDevInscritos() {
		return devsInscritos;
	}
	public void setDevInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	public LocalDate getDATAFINAL() {
		return DATAFINAL;
	}
	
	// Criação do método hashCode()
	@Override
	public int hashCode() {
		return Objects.hash(DATAFINAL, DATAINICIAL, nome, conteudos, descricao, devsInscritos);
	}
	
	// Criação do método equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(DATAFINAL, other.DATAFINAL) && Objects.equals(DATAINICIAL, other.DATAINICIAL)
				&& Objects.equals(nome, other.nome) && Objects.equals(conteudos, other.conteudos)
				&& Objects.equals(descricao, other.descricao) && Objects.equals(devsInscritos, other.devsInscritos);
	}
	
	// Criação do método toString() 
	@Override
	public String toString() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataInicialFormatada = DATAINICIAL.format(formatter);
        String datafINALFormatada = DATAFINAL.format(formatter);
		return "Nome: " + nome + "\nDescrição: \"" + descricao + "\"\nData de início: " + dataInicialFormatada + "\nData final: "
				+ datafINALFormatada;
	}
}