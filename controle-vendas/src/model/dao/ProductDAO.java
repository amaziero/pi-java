package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            PreparedStatement statement = connection.prepareStatement("INSERT INTO register_item (description, name_item, cost, sell_price, quantity) values (?,?,?,?)");

            statement.setString(1, product.getDescription());
            statement.setString(2, product.getName_item());
            statement.setDouble(3, product.getCost());
            statement.setDouble(4, product.getSell_price());
            statement.setInt(5, product.getQuantity());

            statement.execute();
            statement.close();

            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");

            /**tfNomeItem.setText("");
            tfDescricaoItem.setText("");
            tfCustoUnitario.setText("");
            tfPrecoVenda.setText("");
            */

        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
        }
    }
}
