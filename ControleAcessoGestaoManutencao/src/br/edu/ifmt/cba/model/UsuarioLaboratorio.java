package br.edu.ifmt.cba.model;

/**
 *
 * @author Mailon Bruno
 * 
 */
public class UsuarioLaboratorio {
    
    private String nome;
    private int identificador;
    
    public UsuarioLaboratorio() {
    }

    public UsuarioLaboratorio(String nome, int identificador) {
        this.nome = nome;
        this.identificador = identificador;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    
    
    
}
