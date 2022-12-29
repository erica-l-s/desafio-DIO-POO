import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso js");
        curso2.setDescricao("descriçao curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        List<String> palavras = new ArrayList<>();

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descriçao mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descriçãp bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devErica = new Dev();
        devErica.setNome("Erica");
        devErica.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" +devErica.getConteudosInscritos());
        devErica.progredir();
        System.out.println("--");
        System.out.println("Conteudos inscritos" +devErica.getConteudosInscritos());
        System.out.println("Conteudos concluidos" +devErica.getConteudosConcluido());
        System.out.println("XP:" + devErica.calcularTotalXp());

        System.out.println("-----------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteudos inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos" +devJoao.getConteudosConcluido());
        System.out.println("XP:" + devJoao.calcularTotalXp());



    }
}
