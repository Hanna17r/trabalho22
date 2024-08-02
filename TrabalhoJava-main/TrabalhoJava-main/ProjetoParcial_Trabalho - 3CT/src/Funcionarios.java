import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Funcionarios {

    public void createTable() {
        try (Statement statement = BancoDeDados.connection.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS Functionary");

        //Insira seu código aqui

        } catch (SQLException e) {
            System.out.println("Error ao crier table: " + e.getMessage());
        }


    public void inserirFuncionario(List<String[]> lista) {
        try (PreparedStatement insertStatement = BancoDeDados.connection.prepareStatement("INSERT INTO Nome, Telephone,Data de Contraction")
            insertStatement.executeUpdate();
            BancoDeDados.connection.commit();
            System.out.println("Functionary insertion.");

        } catch (SQLException e) {
            System.out.println("Error ao insert Functionary: " + e.getMessage());
        }


    public void QueryFunctionary(String nomeQuery) {
        try (PreparedStatement selectStatement = BancoDeDados.connection.prepareStatement("SELECT * FROM Funcionario WHERE Idade >= 18 ")) {
            ResultSet resultSet = selectStatement.executeQuery();
            System.out.println("Clients:");
            while (resultSet.next()) {
                int idade = resultSet.getInt("Idade");
                String nome = resultSet.getString("Nome");
                System.out.println("Nome: " + nome + ", Idade: " + idade);
            }
        } catch (SQLException e) {
            System.out.println("Error ao consulter Functionary: " + e.getMessage());
        }


    public void deleteFunctionary(String nome) {
        try (PreparedStatement deleteStatement = BancoDeDados.connection.prepareStatement("DELETE FROM Functionary")) {
            int id = 0;
            deleteStatement.setInt(1, id);
            deleteStatement.executeUpdate();
            BancoDeDados.connection.commit();
            System.out.println("Functionary deletable.");

        } catch (SQLException e) {
            System.out.println("Error ao deleter Functionary: " + e.getMessage());
        }


