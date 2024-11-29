package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.QuantLixoOceano;
public class QuantLixoOceanoDAO extends BaseDAO {
    public QuantLixoOceanoDAO() {super();}

    public boolean QuantLixoOceano(QuantLixoOceano quantLixoOceano){
        String sql="INSERT INTO QUANTLIXOOCEANO(qnt_lixo,qnt_lixo_mensal) VALUES(?,?)";
        try(PreparedStatement stmt= connection.prepareStatement(sql)){
            stmt.setDouble(1,quantLixoOceano.getLixosOceano());
            stmt.setDouble(2,quantLixoOceano.getLixosOceanoMensal());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }return false;
    }
}

