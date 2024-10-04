package entidade;

public class LivroDidatico extends Livro {

    public LivroDidatico(String disciplina, int ano_escolar, String nivel_ensino, String titulo, String autor, int qtd_paginas) {
        super(disciplina, ano_escolar, nivel_ensino, qtd_paginas, autor, titulo);
    }

    public void verificarCompatibilidade() {
        System.out.println("Título: "+getTitulo());
        System.out.println("Ano escolar: "+getAno_escolar());
    }
}
