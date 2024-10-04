package entidade;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, int matricula, String curso) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Matrícula: "+ getMatricula());
        System.out.println("Curso: "+ getCurso());
    }
}