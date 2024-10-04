package entidade;

public class LivroFiccao extends Livro{
    private String genero;
    private String subgenero;
    private String sinopse;

    public LivroFiccao(String disciplina, int ano_escolar, String nivel_ensino, String titulo, String autor, int qtd_paginas, String genero, String subgenero) {
        super(disciplina, ano_escolar, nivel_ensino, qtd_paginas, autor, titulo);
        this.genero = genero;
        this.subgenero = subgenero;
    }
    public void sinopseDoLivro(){

    }
}
