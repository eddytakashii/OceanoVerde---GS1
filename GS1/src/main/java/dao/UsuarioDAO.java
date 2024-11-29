package dao;

import model.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class UsuarioDAO extends BaseDAO {
    public UsuarioDAO() {
        super();
    }

    public Usuario login(String nome, String senha) {
        String sql = "SELECT * FROM USUARIO WHERE NOME=? AND SENHA =?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public boolean criarUsuario(Usuario usuario) {

        return false;
    }
}

