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
    }
}