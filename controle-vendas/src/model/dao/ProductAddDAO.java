package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.ProductAdd;


public class ProductAddDAO {
    
    
    
    public void create(ProductAdd product) {
        Connection connection = ConnectionFactory.getConnection();
        
        try {
            PreparedStatement statement = connection.
                    prepareStatement(
                            "INSERT INTO add_item (qtd, id_register_item) values (?, ?)");
            
            statement.setInt(1, product.getQtd());
            statement.setInt(2, product.getId_register_item());
            
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null,
                    "Produto adicionado com sucesso");

        } catch (SQLException ex) {
            System.err.println("Erro ao salvar: " + ex);
        } finally {
            
            ConnectionFactory.closeConnection(connection);
        }
    }
    
    public List<ProductAdd> read() {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<ProductAdd> products = new ArrayList<>();
        
        try {
            statement = connection.
                    prepareStatement("SELECT * FROM add_item");
            resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                ProductAdd product = new ProductAdd();
                
                product.setId(resultSet.getInt("id"));
                product.setDescription(resultSet.getString("description"));
                
                
                products.add(product);
                
            }
            
        } catch (SQLException ex) {
            System.err.println("Erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        
        return products;
   }
    
    public void updateDescription(ProductAdd product) {
        Connection connection = ConnectionFactory.getConnection();
        
        try {
            PreparedStatement statement = connection.
                prepareStatement(
                    "UPDATE add_item ad JOIN register_item register ON (ad.id_register_item = register.id) SET ad.description = register.name_item WHERE ? = register.id");
            
            statement.setInt(1, product.getId_register_item());
            
            statement.executeUpdate();
            

        } catch (SQLException ex) {
            System.err.println("Erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(connection);
        }
    }
    
    public void updateEstoque(ProductAdd product) {
        Connection connection = ConnectionFactory.getConnection();
        
        try {
            PreparedStatement statement = connection.
                prepareStatement(
                    "UPDATE add_item ad JOIN register_item register SET register.quantity = register.quantity + (SELECT add_item.qtd FROM add_item ORDER BY add_item.id DESC LIMIT 1) WHERE ? = register.id");
            
            statement.setInt(1, product.getId_register_item());
            
            statement.executeUpdate();
            
        } catch (SQLException ex) {
            System.err.println("Erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(connection);
        }
    }
}
