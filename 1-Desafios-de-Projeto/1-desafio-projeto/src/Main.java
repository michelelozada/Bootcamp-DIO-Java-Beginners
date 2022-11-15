import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
				
		// Instanciando os dois cursos iniciais do bootcamp 
		Curso curso1 = new Curso();
		curso1.setTitulo("Lógica de Programação");
		curso1.setDescricao("Seus primeiros passos na programação começam aqui!");
		curso1.setCargaHoraria(12);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Git e GitHub");
		curso2.setDescricao("Aprenda os fundamentos básicos para versionar seus projetos");
		curso2.setCargaHoraria(8);
		
		
		// Instanciando uma mentoria do bootcamp 
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Dominando IDEs Java");
		mentoria1.setDescricao("Aprenda como utilizar as duas principais ferramentas do mercado: IntelliJ e Eclipse");
		
		
		// Instaciando o bootcamp
		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setNome("Java Beginners");
		bootcamp1.setDescricao("Aprenda Java e Spring Boot para começar a implementar seus primeiros projetos");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(curso2);
		bootcamp1.getConteudos().add(mentoria1);
		
		// Exibindo as informações do bootcamp
		System.out.println("- Dados do bootcamp -");
		System.out.println(bootcamp1);
		System.out.println("");
		
		
		// Instanciando dois devs da plataforma 
		Dev dev1 = new Dev();
		dev1.setNome("Enzo Bastos");
		dev1.inscreverBootcamp(bootcamp1);
		
		Dev dev2 = new Dev();
		dev2.setNome("Marcos Lemos");
		
		
		// Inscrevendo estes dois devs no bootcamp 
		dev1.inscreverBootcamp(bootcamp1);
		dev2.inscreverBootcamp(bootcamp1);
		System.out.println("- Status de inscrições neste bootcamp -");
		System.out.println("- O dev " + dev1.getNome() + " acaba de se inscrever no bootcamp " + bootcamp1.getNome() + ".");
		System.out.println("- O dev " + dev2.getNome() + " acaba de se inscrever no bootcamp " + bootcamp1.getNome() + ".");
		System.out.println("");
		
		
		// Exibindo o conteúdo do bootcamp a ser assistido por um dos devs
		System.out.println("- Status de conteúdos a serem assistidos por dev inscrito no bootcamp -");
		System.out.println("O dev " + dev1.getNome() + " deverá assistir aos seguintes conteúdos:\n" + dev1.getInscricaoEmConteudos());
		System.out.println("");
		
		
		// Progressão no bootcamp e novo status deste dev no bootcamp 
		dev1.progredirBootcamp();
		dev1.progredirBootcamp();
		System.out.println("- Status atualizado de conteúdos a serem assistidos por dev inscrito no bootcamp -");
		System.out.println("\nConteúdos do bootcamp que o dev " + dev1.getNome() + " já concluiu:\n" + dev1.getConclusaoDeConteudos() + "\n");
		System.out.println("\nConteúdos do bootcamp que o dev " + dev1.getNome() + " ainda precisa concluir:\n" + dev1.getInscricaoEmConteudos() + "\n");
		System.out.println("");
		
		
		// Retornar a pontuação do dev, após a conclusão dos cursos e/ou da mentoria indicados acima
		System.out.println(" - Status da pontuação obtida por dev participante do bootcamp - ");
		System.out.println("O dev " + dev1.getNome() + " já acumulou " + dev1.calcularTotalXp() + " XPs durante sua participação do bootcamp " + bootcamp1.getNome() + ".");
	}
}