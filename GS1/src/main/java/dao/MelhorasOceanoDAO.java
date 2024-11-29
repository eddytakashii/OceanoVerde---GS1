package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.MelhorasOceano;
public class MelhorasOceanoDAO extends BaseDAO {
    public MelhorasOceanoDAO() {super();}

    public boolean MelhorasOceano(MelhorasOceano melhorasOceano){
        String sql="INSERT INTO MELHORASOCEANO(qtn_ongs,quant_residuos_tirados,diminuicao_temperatura) VALUES(?,?,?)";
        try(PreparedStatement stmt= connection.prepareStatement(sql)){
            stmt.setInt(1,melhorasOceano.getQuantOngs());
            stmt.setDouble(2,melhorasOceano.getQuantResiduosTirados());
            stmt.setDouble(3,melhorasOceano.getDiminuicaoTemperatura());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }return false;
    }

    public List <MelhorasOceano> listarTodos(){
        String sql="SELECT * FROM MELHORASOCEANO";
        List <MelhorasOceano>listas=new ArrayList<>();
        try(PreparedStatement stmt=connection.prepareStatement(sql)){
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                listas.add(new MelhorasOceano(rs.getDouble("quant_residuso_tirados"),rs.getDouble("diminuicao_temperatura"),rs.getInt("qtn_ongs")));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return listas;
    }
}
