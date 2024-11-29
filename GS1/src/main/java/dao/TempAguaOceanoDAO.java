package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.TempAguaOceano;
public class TempAguaOceanoDAO extends BaseDAO {
    public TempAguaOceanoDAO() {super();}

    public boolean TempAguaOceano(TempAguaOceano tempAguaOceano){
        String sql="INSERT INTO TEMPAGUAOCEANO(temperatura_agua_anual) VALUES(?)";
        try(PreparedStatement stmt= connection.prepareStatement(sql)){
            stmt.setDouble(1,tempAguaOceano.getTemperaturaAguaAnual());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }return false;
    }
}
