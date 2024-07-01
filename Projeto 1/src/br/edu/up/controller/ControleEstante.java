package br.edu.up.controller;

import br.edu.up.model.Livro;

public class ControleEstante {
    // Controller conversa apenas com os modelos.
    private String[] autoresL1 = { "Cay S. Horstmann", "Gary Cornell" }, autoresL2 = { "Harvey Deitel" };
    private Livro[] livros = {
            new Livro("Core Java 2", "1598FHK", autoresL1, "0130819336", 2005),
            new Livro("Java, Como programar", "9865PLO", autoresL2, "0130341517", 2015)
    };

    public ControleEstante() {
    }

    public Livro[] getLivros() {
        return livros;
    }

    public String[] getAutoresL1() {
        return autoresL1;
    }

    public String[] getAutoresL2() {
        return autoresL2;
    }
}
