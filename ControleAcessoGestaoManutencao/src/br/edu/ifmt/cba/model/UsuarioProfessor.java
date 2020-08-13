package br.edu.ifmt.cba.model;

/**
 *
 * @author Eduardo Gonçalves da Silva
 */
public class UsuarioProfessor extends UsuarioLaboratorio{
    private String departamento;
    private String disciplina;

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
