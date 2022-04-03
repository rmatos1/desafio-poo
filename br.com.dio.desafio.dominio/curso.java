package br.com.dio.desafio.dominio

public class Curso extends Conteudo {
    
    private int cargaHoraria;
    
    @Override
    public double calcularXp() {
        return XP_PADRAO * this.cargaHoraria;
    }
    
    public int getCargaHorario() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public String toString() {
        return "Curso(" + 
            "titulo: " + getTitulo() + 
            ", descrição: " + getDescricao() + 
            ", carga horária: " + this.cargaHoraria + 
        ")"; 
    }
}