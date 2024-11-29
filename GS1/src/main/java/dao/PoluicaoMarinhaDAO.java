package dao;
import model.MelhorasOceano;
import model.PoluicaoMarinha;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PoluicaoMarinhaDAO extends BaseDAO {
    public PoluicaoMarinhaDAO() {super();}

    public boolean PoluicaoMarinha(PoluicaoMarinha poluicaoMarinha){
        String sql="INSERT INTO POLUICAOMARINHA(quant_lixo,quant_petroleo) VALUES(?,?)";
        try(PreparedStatement stmt= connection.prepareStatement(sql)){
            stmt.setDouble(1,poluicaoMarinha.getQuantLixo());
            stmt.setDouble(2,poluicaoMarinha.getQuantPetroleo());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }return false;
    }
    public List<PoluicaoMarinha> listarTodos(){
        String sql="SELECT * FROM POLUICAOMARINHA";
        List <PoluicaoMarinha>listas=new ArrayList<>();
        try(PreparedStatement stmt=connection.prepareStatement(sql)){
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                listas.add(new PoluicaoMarinha(rs.getDouble("quant_lixo"),rs.getDouble("quant_petroleo")));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return listas;
    }
}
