package entidade;

public class LivroNFiccao extends Livro{
    private String tema;
    private String topico;
    private String recomendacao = "livro1, livro2, livro3";

    public LivroNFiccao(String disciplina, int ano_escolar, String nivel_ensino, String titulo, String autor, int qtd_paginas) {
        super(disciplina, ano_escolar, nivel_ensino, qtd_paginas, autor, titulo);
        this.tema = tema;
        this.topico = topico;
    }

    public void recomendarTitulos() {
        super.informarDetalhes(recomendacao);
    }

}
