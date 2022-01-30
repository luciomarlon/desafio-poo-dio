import com.br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("TÍTULO: Curso JAVA");
        curso.setDescricao("DESCRIÇÃO: curso java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("TÍTULO: Curso JavaScript");
        curso1.setDescricao("DESCRIÇÃO: curso javascript");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("Descrição mentoria JAVA");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);
        */

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição BootCamp JavaDeveloper");
        bootCamp.getConteudos().add(curso);
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(mentoria);


        Dev desenvolvedor = new Dev();
        desenvolvedor.setNome("LUCIO MARLON");
        desenvolvedor.increverBootCamp(bootCamp);

        System.out.println("Conteúdos dos incritos LUCIO MARLON" +
                desenvolvedor.getConteudoInscritos());

        desenvolvedor.progredir();
        desenvolvedor.progredir();
        System.out.println("-");

        System.out.println("Conteúdos dos incritos LUCIO MARLON" +
                desenvolvedor.getConteudoInscritos());

        System.out.println("Conteúdos concluídos LUCIO MARLON" +
                desenvolvedor.getConteudosConcluidos());
        System.out.println("Chamando calcular XP: " + desenvolvedor.calcularTotalXP());

        System.out.println("-----------------------------------");

        Dev desenvolvedor2 = new Dev();
        desenvolvedor2.setNome("LUCIO SOUSA");
        desenvolvedor2.increverBootCamp(bootCamp);

        System.out.println("Conteúdos dos incritos LUCIO SOUSA" +
                desenvolvedor2.getConteudoInscritos());

        desenvolvedor2.progredir();
        desenvolvedor2.progredir();
        desenvolvedor2.progredir();
        System.out.println("-");

        System.out.println("Conteúdos dos incritos LUCIO SOUSA" +
                desenvolvedor2.getConteudoInscritos());
        System.out.println("Conteúdos concluídos LUCIO SOUSA" +
                desenvolvedor2.getConteudosConcluidos());
        System.out.println("Chamando calcular XP: " + desenvolvedor2.calcularTotalXP());

    }
}
