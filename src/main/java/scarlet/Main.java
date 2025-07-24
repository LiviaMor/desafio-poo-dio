package scarlet;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Spring Boot Java");
    curso1.setCargaHoraria(40);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso Java");
    curso2.setDescricao("Programção Orientada a Objetos");
    curso2.setCargaHoraria(40);

    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("Mentoria Java");
    mentoria1.setDescricao("Spring Boot Java");
    mentoria1.setData(LocalDate.now());

    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria1);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java");
    bootcamp.setDescricao("Spring Boot Java");
    bootcamp.getConteudoSet().add(curso1);
    bootcamp.getConteudoSet().add(curso2);
    bootcamp.getConteudoSet().add(mentoria1);

    Dev devUm = new Dev();
    Dev devDois = new Dev();
        devUm.setNome("Scarlet");
        devUm.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devUm.getConteudosInscritos());
        devUm.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devUm.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devUm.getConteudosConcluidas());
        System.out.println("XP:" + devUm.calcularTotalXp());
        devDois.setNome("João");
        devDois.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devDois.getConteudosInscritos());
        devDois.progredir();
        devDois.progredir();
        devDois.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devDois.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devDois.getConteudosConcluidas());
        System.out.println("XP:" + devDois.calcularTotalXp());







    }
}