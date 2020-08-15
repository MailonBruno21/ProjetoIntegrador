package br.edu.ifmt.cba.model;

/**
 * 
 * @author Eduardo Gonçalves da Silva
 */
public class UsuarioProfessor extends UsuarioLaboratorio{
    
    private String departamento;
    private String disciplina;

    public UsuarioProfessor() {
    }
    
    public UsuarioProfessor(String departamento, String disciplina, String nome, int identificador) {
        super(nome,identificador);
        this.departamento = departamento;
        this.disciplina = disciplina;
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
