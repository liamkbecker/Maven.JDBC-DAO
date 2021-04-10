package daos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class UpperDAO<T>{

    public T findById(int id) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCpokemon", "hazel", "fishie711");
        PreparedStatement s = conn.prepareStatement("SELECT * FROM starters WHERE id=?");
        s.setInt(1, id);
        ResultSet rs = s.executeQuery();
        return (T) rs;
    }

    public List<Starter> findAll() throws SQLException {
        ArrayList<Starter> starters = new ArrayList<Starter>();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCpokemon", "hazel", "fishie711");
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM starters");
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String type = rs.getString("type");
            String ability = rs.getString("ability");
            int height = rs.getInt("height");
            int weight = rs.getInt("weight");
            starters.add(new Starter(id, name, type, ability, height, weight));
        }
        return starters;
    }

    public T update(T dto) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCpokemon", "hazel", "fishie711");
        PreparedStatement s = conn.prepareStatement("SELECT * FROM starters WHERE id=?");
        s.setInt(1, dto.getId());
        ResultSet rs = s.executeQuery();
        return (T) rs;
    }

    public T create(T dto) {
        return null;
    }

    public void delete(int id) {
    }

}
