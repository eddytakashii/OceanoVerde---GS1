package model;

public class Usuario {
    private int id;
    private String nome;
    private String senha;

    public Usuario(int id, String nome, String senha, String email, String numero) {
        this.id=id;
        this.nome=nome;
        this.senha=senha;
    }

    public Usuario(String nome, String senha) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + ", senha=" + senha+"]" ;
    }


}

