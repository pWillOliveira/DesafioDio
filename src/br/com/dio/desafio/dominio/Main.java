package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descri��o Curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Javascript");
		curso2.setDescricao("Descri��o Curso Javascript");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descri��o Mentoria Java");
		mentoria.setData(LocalDate.now());

		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescri��o("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("William Oliveira");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Incritos William: " + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		System.out.println("-");
		System.out.println("Conte�dos Incritos William: " + dev1.getConteudosInscritos());
		System.out.println("Conte�dos Conclu�dos de " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());
		
		System.out.println("-------------------------");
		
		Dev dev2 = new Dev();
		dev2.setNome("Sibele Ferreira");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Incritos Sibele: " + dev2.getConteudosInscritos());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("-");
		System.out.println("Conte�dos Incritos Sibele: " + dev2.getConteudosInscritos());
		System.out.println("Conte�dos Conclu�dos de " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXp());
	}

}
