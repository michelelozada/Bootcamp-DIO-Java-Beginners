package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	// Declaração do atributo específico desta classe
	private int cargaHoraria;
	
	// Deixando explícito o método construtor default 
	public Curso() {
		super();
	}

	// Criação dos métodos get e set 
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}	
	
	// Herdando o método calcularXp() da classe-mãe
	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	
	// Criação do método toString()
	@Override
	public String toString() {
	return "\n- Curso -\nNome: " + getTitulo() + "\nDescrição: \"" + getDescricao() + "\"\nCarga Horária: " + cargaHoraria + " horas\n";
	}
}