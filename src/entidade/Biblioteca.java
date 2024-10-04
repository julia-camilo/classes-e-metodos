package entidade;

public class Biblioteca {
    private String titulo;
    private String autor;
    private int qtd_paginas;

    public Biblioteca(String titulo, String autor, int qtd_paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.qtd_paginas = qtd_paginas;
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

    public void informarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Páginas: "+ qtd_paginas);
    }
}
