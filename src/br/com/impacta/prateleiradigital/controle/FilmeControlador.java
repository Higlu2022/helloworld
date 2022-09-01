package br.com.impacta.prateleiradigital.controle;

import br.com.impacta.prateleiradigital.negocio.Filme;
import br.com.impacta.prateleiradigital.persistencia.FilmeDAO;

import java.sql.SQLException;
import java.util.List;

public class FilmeControlador {

    FilmeDAO filmeDAO = new FilmeDAO();


    public void adicionar(Filme filme) throws SQLException {

        filmeDAO.incluir(filme);
    }

    /**
     * Consulta uma filme
     *
     * @param tituloParcial
     * @param genero
     * @param anoInicial
     * @param anoFinal
     * @return
     */
    public Filme[] consultarFilmes(String tituloParcial, String genero, int anoInicial, int anoFinal) {
        //TODO implementar regra para consultar uma lista de filmes
        return filmeDAO.consultarListaDeFilmes(tituloParcial, genero, anoInicial, anoFinal);
    }

    public List<Filme> consultarFilmes(String genero, int ano, String tituloParcial) throws SQLException {

        return filmeDAO.consultarListaDeFilmes(genero, ano, tituloParcial);
    }

    /**
     * Exclui um filme
     *
     * @param filme
     */
    public void remover(Filme filme) {
        filmeDAO.excluir(filme);
        //TODO Implementar a regra para excluir o filme
    }

    /**
     * Indica um filme de acordo com os argumentos, caso não localize uma filme é exibido a msg: "Nenhum filme encontrado"
     *
     * @param genero
     * @param diretores
     * @param notaMinima
     * @param numeroDeVotos
     * @return
     */
    public Filme sortear(String genero, String diretores, double notaMinima, int numeroDeVotos) {
        //TODO Implementar a regra para sortear o filme
        return filmeDAO.consultarFilme(genero, diretores, notaMinima, numeroDeVotos);
    }

    /**
     * Indica um filme de acordo com os argumentos, caso não localize uma filme é exibido a msg: "Nenhum filme encontrado"
     *
     * @param filme
     * @return
     */
    public Filme sortear(Filme filme) {

        if (filme != null) {
            return filmeDAO.consultarFilme(filme.getGenero(), filme.getDiretores(), filme.getNota(), filme.getNumDeVotos());
        } else {
            return null;
        }
    }

    /**
     * Importa uma lista de filmes a partir de um arquivo
     */
    public void imoportarListaDeFilmes(String caminho) {
        //TODO Implementar a regra para importar um filme
        //TODO Verificar o caminho do arquivo e ler os dados para criar uma lista de filmes com os dados do arquivo

        //TODO criar uma ForEach para chamar o método adicionar para cada elemento da lista


    }

}
