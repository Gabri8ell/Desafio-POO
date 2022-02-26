import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Curso básico de java");
        curso.setCargaHoraria(20);

        Curso curso1 = new Curso();
        curso1.setTitulo("Java1");
        curso1.setDescricao("Curso intermediário de java");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java2");
        curso2.setDescricao("Curso avançado de java");
        curso2.setCargaHoraria(80);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Menatoria de Java1");
        mentoria.setDescricao("Mentoria Java básico");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Menatoria de Java2");
        mentoria1.setDescricao("Mentoria Java intermediário");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Menatoria de Java3");
        mentoria2.setDescricao("Mentoria Java avançado");
        mentoria2.setData(LocalDate.now());

        Bootcamp javaInicialAvançado = new Bootcamp();
        javaInicialAvançado.setNome("Java");
        javaInicialAvançado.setDescricao("Java do Iniciante ao Avançado");
        javaInicialAvançado.getConteudos().add(curso);
        javaInicialAvançado.getConteudos().add(curso1);
        javaInicialAvançado.getConteudos().add(curso2);
        javaInicialAvançado.getConteudos().add(mentoria);
        javaInicialAvançado.getConteudos().add(mentoria1);
        javaInicialAvançado.getConteudos().add(mentoria2);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(javaInicialAvançado);
        devGabriel.progredir();
        System.out.println(devGabriel);


        Dev devMariana = new Dev();
        devMariana.setNome("Mariana");
        devMariana.inscreverBootcamp(javaInicialAvançado);
        devMariana.progredir();
        System.out.println(devMariana);
        

    }
}
