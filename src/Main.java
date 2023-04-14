import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso do básico ao avançado de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso do básico ao avançado de JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Senior");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Cursos do básico ao avançado em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        System.out.println("------------------------------------------------------------");
        Dev devCicero = new Dev();
        devCicero.setNome("Cícero Martins");
        devCicero.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devCicero.getConteudosInscritos());
        devCicero.progredir();
        System.out.println("---------------------------------");
        System.out.println("Conteúdos Inscritos" + devCicero.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devCicero.getConteudosConcluidos());
        System.out.println("XP:" + devCicero.calcularTotalXp());

        System.out.println("------------------------------------------------------------");
        Dev devRubens = new Dev();
        devRubens.setNome("Rubens Adriel");
        devRubens.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devRubens.getConteudosInscritos());
        devRubens.progredir();
        devRubens.progredir();
        devRubens.progredir();
        System.out.println("---------------------------------");
        System.out.println("Conteúdos Inscritos" + devCicero.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devRubens.getConteudosConcluidos());
        System.out.println("XP:" + devRubens.calcularTotalXp());
    }
}
