package br.com.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Pessoa {
    @SerializedName("Nome")
    private String nome;
    @SerializedName("Idade")
    private int idade;
    @SerializedName("Email")
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'';
    }
}
