package cJavaOrientaçãoObjetos.Aula15BlocosInicialização.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    /* 1 - Alocado espaço em memória pro objeto
     * 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
     * 3 - Bloco de inicialização é executado
     * 4 - Construtor é executado */

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int[] getEpisodios() {
        return this.episodios;
    }
}
