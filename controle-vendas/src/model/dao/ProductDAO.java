package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Product;

/**
 *
 * @author aliso
 */
public class ProductDAO {
    
    public void create(Product product) {
        Connection connection = ConnectionFactory.getConnection();
        
        try {
            PreparedStatement statement = connection.
                    prepareStatement(
                            "INSERT INTO register_item (description, name_item, cost, sell_price, quantity) values (?,?,?,?,?)");

            statement.setString(1, product.getDescription());
            statement.setString(2, product.getName_item());
            statement.setDouble(3, product.getCost());
            statement.setDouble(4, product.getSell_price());
            statement.setInt(5, product.getQuantity());

            statement.executeUpdate();

            JOptionPane.showMessageDialog(null,
                    "Produto cadastrado com sucesso");

        } catch (SQLException ex) {
            System.err.println("Erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(connection);
        }
    }
    
    public List<Product> read() {
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Product> products = new ArrayList<>();
        
        try {
            statement = connection.
                    prepareStatement("SELECT * FROM register_item");
            resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                Product product = new Product();
                
                product.setId(resultSet.getInt("id"));
                product.setDescription(resultSet.getString("description"));
                product.setName_item(resultSet.getString("name_item"));
                product.setCost(resultSet.getDouble("cost"));
                product.setSell_price(resultSet.getDouble("sell_price"));
                product.setQuantity(resultSet.getInt("quantity"));
                
                products.add(product);
                
            }
            
        } catch (SQLException ex) {
            System.err.println("Erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        
        return products;
   }
}
