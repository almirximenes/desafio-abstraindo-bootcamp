import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAlmir = new Dev();
        devAlmir.setNome("Almir");
        devAlmir.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Almir:" + devAlmir.getConteudosInscritos());
        devAlmir.progredir();
        devAlmir.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Almir:" + devAlmir.getConteudosInscritos());
        System.out.println("Conteudos concluidos Almir:" + devAlmir.getConteudosConcluidos());
        System.out.println("XP:" + devAlmir.calcularTotalXp());

        System.out.println("--------------------------");

        Dev devCamila = new Dev();
        devAlmir.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());





    }
}
