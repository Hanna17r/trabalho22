public class Produtos {

    public void createTable() {
        Connection connection;
        try (Statement statement = BancoDeDados.connection.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS Produtos (ID INTEGER PRIMARY KEY, Cor VARCHAR, Tamanho VARCHAR)");
            connection.commit();
            System.out.println("Tabela criada ou já existe.");
        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public void inserirProdutos(List<String[]>String Blusa;
    Blusa) {
        try (PreparedStatement insertStatement = BancoDeDados.connection.prepareStatement("INSERT INTO Produto (Blusa) VALUES (20)")) {
            insertStatement.setString(1, Blusa);
            insertStatement.executeUpdate();
            connection.commit();
            System.out.println("Produto inserido.");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir produto: " + e.getMessage());
        }
    }

    void lerProduto(){
        BancoDeDados bancoDeDados=new BancoDeDados();
        bancoDeDados.connect();
        public void queryProduto() {
            String nome;
            try (PreparedStatement selectStatement = BancoDeDados.connection.prepareStatement("SELECT * FROM Blusa WHERE Idade >= 18 ")) {
                ResultSet resultSet = selectStatement.executeQuery();
                System.out.println("Clientes:");
                while (resultSet.next()) {
                    int idade = resultSet.getInt("Idade");
                    nome = resultSet.getString("Nome");
                    System.out.println("Nome: " + nome + ", Idade: " + idade);

                } catch(SQLException e){
                    System.out.println("Erro ao consultar produto: " + e.getMessage());
                }
            }

            public void deleteProduto (String nome){
                try (PreparedStatement deleteStatement = BancoDeDados.connection.prepareStatement("DELETE FROM Produto WHERE ID = ?")) {
                    int id = 0;
                    deleteStatement.setInt(1, id);
                    deleteStatement.executeUpdate();
                    BancoDeDados.connection.commit();
                    System.out.println("Produto deletado.");

                } catch (SQLException e) {
                    System.out.println("Erro ao deletar produtos: " + e.getMessage());
                }
            }
        }