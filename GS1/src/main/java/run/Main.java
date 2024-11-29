package run;

import connection.ConnectionFactory;
import dao.MelhorasOceanoDAO;
import dao.PoluicaoMarinhaDAO;
import model.MelhorasOceano;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[]args) throws SQLException {
        try(Connection connection= ConnectionFactory.getConnection()){
            if(connection!=null){
                System.out.println("Conexão realizada com sucesso");
            }
        }
    }
}
