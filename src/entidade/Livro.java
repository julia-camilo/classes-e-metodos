package entidade;

public class Livro {
    private String disciplina;
    private int ano_escolar;
    private String nivel_ensino;
    private String titulo;
    private String autor;
    private int qtd_paginas;

    public Livro(String disciplina, int ano_escolar, String nivel_ensino, int qtd_paginas, String autor, String titulo) {
        this.disciplina = disciplina;
        this.ano_escolar = ano_escolar;
        this.nivel_ensino = nivel_ensino;
        this.titulo = this.titulo;
        this.autor = this.autor;
        this.qtd_paginas = this.qtd_paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQtd_paginas() {
        return qtd_paginas;
    }

    public void setQtd_paginas(int qtd_paginas) {
        this.qtd_paginas = qtd_paginas;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getAno_escolar() {
        return ano_escolar;
    }

    public void setAno_escolar(int ano_escolar) {
        this.ano_escolar = ano_escolar;
    }

    public String getNivel_ensino() {
        return nivel_ensino;
    }

    public void setNivel_ensino(String nivel_ensino) {
        this.nivel_ensino = nivel_ensino;
    }

    public void informarDetalhes(String recomendacao){

    }
}

