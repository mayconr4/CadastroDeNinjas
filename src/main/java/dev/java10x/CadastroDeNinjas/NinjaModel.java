package dev.java10x.CadastroDeNinjas;


import jakarta.persistence.*;

// Entity ele tranforma uma classe em uma entidade do BD
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro") // nome da tabela
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gera uma strtégia por ordem crescente verificar depois
    private long id;
    private String nome;
    private String email;
    private int idade;

    public NinjaModel(){

    }

    public NinjaModel( String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}
