package Controller;


import Model.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class FuncionarioController {
    public boolean loginFuncionario(String email, String senha) {
    String sql = "SELECT * from funcionarios "
            + " WHERE email = ? and senha = ? ";

    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;
    ResultSet resultado = null;

    try {
      comando = gerenciador.prepararComando(sql);

      comando.setString(1, email);
      comando.setString(2, senha);

      resultado = comando.executeQuery();

      if (resultado.next()) {
        return true;
      }
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
    } finally {
      gerenciador.fecharConexao(comando, resultado);
    }
    return false;
  }
    
    public boolean inserirFuncionario(Funcionario funcionario){
    String sql = "INSERT INTO funcionarios (nome, email, senha, cpf, cargo) "
               + " VALUES (?,?,?,?,?)";
    
    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;
    try{
      comando = gerenciador.prepararComando(sql);
      
      comando.setString(1, funcionario.getNome());
      comando.setString(2, funcionario.getEmail());
      comando.setString(3, funcionario.getSenha());
      comando.setString(4, funcionario.getCpf());
      comando.setString(5, funcionario.getCargo());
      
      comando.executeUpdate();
      
      return true;      
    }catch (SQLException e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
    } finally {
      gerenciador.fecharConexao(comando); 
    }
    return false;      
  }
  
    public boolean alterarFuncionario(Funcionario func) {
    String sql = "UPDATE funcionarios SET nome = ?, "
            + " email = ?";

    if (func.getSenha() != null) {
      sql = sql + " , senha = ? ";
    }

    sql = sql + " , cpf = ?, cargo = ? WHERE idFuncionario = ?";

    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;

    try {
      comando = gerenciador.prepararComando(sql);

      comando.setString(1, func.getNome());
      comando.setString(2, func.getEmail());

      int numCampo = 3;
      
      if (func.getSenha() != null) {
        comando.setString(numCampo, func.getSenha()); 
        numCampo++;
      }
      
      comando.setString(numCampo, func.getCpf());
      numCampo++;
      comando.setString(numCampo, func.getCargo());
      comando.setInt(numCampo, func.getIdFuncionario());

      comando.executeUpdate();

      return true;
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
    } finally {
      gerenciador.fecharConexao(comando);
    }
    return false;
  }
    
    public List<Funcionario> listarFuncionario() {
    String sql = "SELECT * FROM funcionarios";
    
    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;
    ResultSet resultado = null;
    
    List<Funcionario> listaFuncionarios= new ArrayList<>();
    
    try {
      comando = gerenciador.prepararComando(sql);

      resultado = comando.executeQuery();

      
      while (resultado.next()) {

        Funcionario funcionario = new Funcionario();

        funcionario.setIdFuncionario(resultado.getInt("idFuncionario"));
        funcionario.setNome(resultado.getString("nome"));
        funcionario.setEmail(resultado.getString("email"));
        funcionario.setCpf(resultado.getString("cpf"));
        funcionario.setCargo(resultado.getString("cargo"));

        listaFuncionarios.add(funcionario);
      }

    } catch (SQLException ex) {
      Logger.getLogger(ProdutoController.class.getName()).log(
              Level.SEVERE, null, ex);
    } finally {
      gerenciador.fecharConexao(comando, resultado);
    }

    return listaFuncionarios;
  }
    
    public Funcionario buscarPorIdFuncionario(int idFuncionario) {
    String sql = "SELECT * FROM funcionarios WHERE idFuncionario = ?";

    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;
    ResultSet resultado = null;

    Funcionario funcionario = new Funcionario();

    try {
      comando = gerenciador.prepararComando(sql);

      comando.setInt(1, idFuncionario);

      resultado = comando.executeQuery();

      if (resultado.next()) {

        funcionario.setIdFuncionario(resultado.getInt("idFuncionario"));
        funcionario.setNome(resultado.getString("nome"));
        funcionario.setEmail(resultado.getString("email"));
        funcionario.setCpf(resultado.getString("cpf"));
        funcionario.setCargo(resultado.getString("cargo"));
      }

    } catch (SQLException ex) {
      Logger.getLogger(ProdutoController.class.getName()).log(
              Level.SEVERE, null, ex);
    } finally {
      gerenciador.fecharConexao(comando, resultado);
    }
    return funcionario;
  }
    
    
    public boolean deletarFuncionario(int idFuncionario) {
    String sql = "DELETE FROM funcionarios "
               + "WHERE idFuncionario = ?";

    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;

    try {
      comando = gerenciador.prepararComando(sql);
      comando.setInt(1, idFuncionario);

      comando.executeUpdate();

      return true;
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Erro ao excluir: "
              + ex);
    } finally {
      gerenciador.fecharConexao(comando);
    }
    return false;
  }
}
