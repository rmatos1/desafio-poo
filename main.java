import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {
    
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria Java");
        mentoria1.setDescricao("descrição mentoria Java");
        mentoria1.setData(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);
        
        final Dev devCristina = new Dev();
        devCristina.setNome("Cristina");
        System.out.println(devCristina);
        
        devCristina.progredir();

        System.out.println(devCristina.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        System.out.println(devJoao);
        
        devJoao.progredir();
        devJoao.progredir();

        System.out.println(devJoao.calcularTotalXp());
    }
}
