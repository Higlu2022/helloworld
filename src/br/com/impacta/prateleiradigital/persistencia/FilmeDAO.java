package br.com.impacta.prateleiradigital.persistencia;

import br.com.impacta.prateleiradigital.negocio.Filme;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FilmeDAO {

    public void incluir(Filme filme) throws SQLException {

        String queryInsert = "INSERT INTO impacta.filme VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = getConnection().prepareStatement(queryInsert);

        preparedStatement.setNull(1, Types.INTEGER);
        preparedStatement.setString(2, filme.getTitulo());
        preparedStatement.setString(3, filme.getDiretores());
        preparedStatement.setDouble(4, filme.getNota());
        preparedStatement.setInt(5, filme.getDuracao());
        preparedStatement.setInt(6, filme.getAno());
        preparedStatement.setString(7, filme.getGenero());
        preparedStatement.setInt(8, filme.getNumDeVotos());
        preparedStatement.setString(9, filme.getUrl());

        preparedStatement.executeUpdate();

        System.out.println("Filme adicionado com sucesso!!");
    }

    public void incluirLista(List<Filme> filme) throws SQLException {
        for (Filme cadaFilme : filme) {
            incluir(cadaFilme);
        }

    }

    public void excluir(Filme filme) {


    }

    public Filme[] consultarListaDeFilmes(String tituloParcial, String genero, int anoInicial, int anoFinal) {


        return null;
    }

    public List<Filme> consultarListaDeFilmes(String genero, int ano, String tituloParcial) throws SQLException {


        ResultSet resultSet = null;
        if (genero.equals("") && ano < 1900 && tituloParcial.equals("")) {

            String queryConsultAll = "SELECT * FROM impacta.filme ";
            Statement statement = getConnection().createStatement();
            resultSet = statement.executeQuery(queryConsultAll);

        } else {

            String queryConsult =
                    "SELECT * FROM impacta.filme " +
                            "where genero like \"%" + genero + "%\"" +
                            "and ano = \"" + ano + "\"" +
                            "and titulo like \"%" + tituloParcial + "%\"";

            Statement statement = getConnection().createStatement();
            resultSet = statement.executeQuery(queryConsult);


        }

        List<Filme> listFilme = new ArrayList<>();
        while (resultSet.next()) {
            Filme filme = new Filme();
            filme.setTitulo(resultSet.getString("titulo"));
            filme.setDiretores(resultSet.getString("diretores"));
            filme.setNota(resultSet.getDouble("nota"));
            filme.setDuracao(resultSet.getInt("duracao"));
            filme.setAno(resultSet.getInt("ano"));
            filme.setGenero(resultSet.getString("genero"));
            filme.setNumDeVotos(resultSet.getInt("numDeVotos"));
            filme.setUrl(resultSet.getString("url"));

            listFilme.add(filme);
        }

        return listFilme;
    }


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


    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/impacta";
        String usuario = "root";
        String senha = "Hig2014@";

        return DriverManager.getConnection(url, usuario, senha);
    }

}
