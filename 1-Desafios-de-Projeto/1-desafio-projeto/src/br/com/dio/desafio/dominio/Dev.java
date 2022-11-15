package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	// Declaração dos atributos da classe
	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	// Criação dos métodos get e set 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getInscricaoEmConteudos() {
		return conteudosInscritos;
	}

	public void setInscricaoEmConteudos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConclusaoDeConteudos() {
		return conteudosConcluidos;
	}

	public void setConclusaoDeConteudos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
	
	// Criação dos método hasCode()
	@Override
		public int hashCode() {
			return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
	}
	
	// Criação dos método equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
		&& Objects.equals(conteudosInscritos, other.conteudosInscritos)
		&& Objects.equals(nome, other.nome);
	}
	
	// Implementação do método para acrescentar o dev ao bootcamp
	public void inscreverBootcamp(Bootcamp bootcamp) {
		// Ao se inscrever num bootcamp, conteúdos são adicionados ao Set de conteúdos a serem assisitidos
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevInscritos().add(this);
	}
	
	// Implementação do método para gerenciar a progressão dos conteúdos concluídos pelo dev no Bootcamp
	public void progredirBootcamp() {
		// Ao progredir num bootcamp, conteúdos do bootcamp são adicionados ao Set de conteudos concluídos
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		// Atualizando os conteúdos, com a passagem do set de conteúdos a assistir para conteudos concluídos
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		} else {
			System.out.println("Não há nenhum curso ou mentoria a assistir.");
		}
	}

	// Implementação do método para cálculo da pontuação do aluno 
	public double calcularTotalXp() {
		return this.conteudosConcluidos
				   .stream()
				   .mapToDouble(Conteudo::calcularXp)
				   .sum();
	}
}