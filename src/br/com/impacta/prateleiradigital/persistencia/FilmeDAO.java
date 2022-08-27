package br.com.impacta.prateleiradigital.persistencia;

import br.com.impacta.prateleiradigital.negocio.Filme;
import java.util.ArrayList;
import java.util.List;

public class FilmeDAO {

    /**
     * Método para persisitir o objeto filme no banco
     *
     * @param filme
     */
    public void incluir(Filme filme) {
        //TODO Implementar a persistência do objeto
        System.out.println("Filme cadastrado com sucesso!!!");
    }

    /**
     * Método para excluir o objeto filme no banco
     *
     * @param filme
     */
    public void excluir(Filme filme) {
        //TODO Implementar a exclusão do objeto
    }

    /**
     * Método para consultar uma lista de filme
     *
     * @param tituloParcial
     * @param genero
     * @param anoInicial
     * @param anoFinal
     * @return
     */
    public Filme[] consultarListaDeFilmes(String tituloParcial, String genero, int anoInicial, int anoFinal) {


        return null;
    }

    /**
     * Usado apenas para consultar os filmes
     * @param tituloParcial
     * @param genero
     * @param ano
     * @return
     */
    public List<Filme> consultarListaDeFilmes(String tituloParcial, String genero, int ano) {

        List<Filme> filmeLista = new ArrayList<>();

        filmeLista.add(new Filme(
                "O Chamado",
                "Joe Russo",
                8.9,
                120,
                2022,
                "Terror",
                500,
                "www.ochamado.com"));

        filmeLista.add(new Filme(
                "O Chamado 2",
                "Joe Russo e Antony Bill",
                6.0,
                89,
                2025,
                "Terror",
                200,
                "www.ochamado.com"));


        return filmeLista;
    }

    /**
     * Método para consultar um filme
     *
     * @param genero
     * @param diretores
     * @param notaMinima
     * @param numDeVotos
     * @return
     */
    public Filme consultarFilme(String genero, String diretores, double notaMinima, int numDeVotos) {
        Filme filme = new Filme();
        //TODO Implementar a consulta do objeto
        filme.setGenero(genero);
        filme.setDiretores(diretores);
        filme.setNota(notaMinima);
        filme.setNumDeVotos(numDeVotos);
        System.out.println("Consulta ao banco realizada com sucesso");
        return filme;
    }

}
