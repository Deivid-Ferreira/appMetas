package metas.crud;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Inclusao extends Conexao {

	private PreparedStatement declaracao;

	public void incluirUsuario(String cpf, String nome, String senha, String email) throws SQLException {
		conectar();
		declaracao = getConexao().prepareStatement("INSERT INTO tb_meta (cpf, nome,senha,email), VALUE(?,?,?,?)");
		declaracao.setString(1, cpf);
		declaracao.setString(2, nome);
		declaracao.setString(3, senha);
		declaracao.setString(4, email);
		fecharConexao();
		
	}

	public void incluirMeta(int id, String cpf, String tipo, double valor, double acumulado) throws SQLException {
		conectar();
		declaracao = getConexao().prepareStatement("INSERT INTO tb_meta (cpf,tipo,valor,acumulado), VALUE(?,?,?,?)");
		declaracao.setString(1, cpf);
		declaracao.setString(2, tipo);
		declaracao.setDouble(3, valor);
		declaracao.setDouble(4, acumulado);
		fecharConexao();
	}

	public void ProgressoModelo(int id, int id_meta, int valor) throws SQLException {
		conectar();
		declaracao = getConexao().prepareStatement("INSERT INTO tb_meta (id_meta, valor), VALUE(?,?)");
		declaracao.setInt(1, id_meta);
		declaracao.setInt(2, valor);


		fecharConexao();
	}
	
}
