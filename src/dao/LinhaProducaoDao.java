package dao;

import model.LinhaProducao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinhaProducaoDao extends Dao {


    @Override
    public void add(Object entity) throws SQLException {
        String query = "INSERT INTO linha_producao(nome) VALUE (?)";
        Scanner scanner = new Scanner(System.in);
        //Teste, pode ser alterado depois
        System.out.println("Digite o nome do linha de producao: ");
        String nome = scanner.nextLine();
        try (PreparedStatement stmt = Dao.prepareStatement(query)){
            stmt.setString(1, nome);
            stmt.executeUpdate();
            System.out.println("Linha de producao criada com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Falha ao inserir a linha de producao.");
        }
    }

    @Override
    public Object get(int LinhaId) throws SQLException {
        String query = "SELECT * FROM linha_producao WHERE linha_id = ?";
        try (PreparedStatement stmt = Dao.prepareStatement(query)){
            stmt.setInt(1, LinhaId);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                int linha_id = rs.getInt("linha_id");
                String nome = rs.getString("nome");
                LinhaProducao linhaProducaoRequerida = new LinhaProducao(linha_id, nome);
                return linhaProducaoRequerida.toString();
            }
        }
        return null;
    }

    @Override
    public List<LinhaProducao> getAll() throws SQLException {
        List<LinhaProducao> linhaProducao = new ArrayList<>();
        String query = "SELECT * FROM linha_producao";

        try (Statement stmt = Dao.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int linha_id = rs.getInt("linha_id");
                String nome = rs.getString("nome");
                LinhaProducao linha = new LinhaProducao(linha_id, nome);
                linhaProducao.add(linha);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return linhaProducao;
    }

    @Override
    public void update(Object entity) throws SQLException {

    }

    @Override
    public void delete(int LinhaId) throws SQLException {
        String query = "DELETE FROM linha_producao WHERE linha_id = ?";
        try (PreparedStatement stmt = Dao.prepareStatement(query)){
            stmt.setInt(1, LinhaId);
            stmt.executeUpdate();
            System.out.println("Linha de producao deletada com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
