import com.br.com.dio.desafio.dominio.Conteudo;
import com.br.com.dio.desafio.dominio.Curso;
import com.br.com.dio.desafio.dominio.Mentoria;

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

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("Descrição mentoria JAVA");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);
    }
}
