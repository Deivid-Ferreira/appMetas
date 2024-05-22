package metas.modelo;

public class UsuarioModelo {

	
	
		private String cpf;
		private String nome;
		private String senha;
		private String email;
		
		public UsuarioModelo(String cpf, String nome, String senha, String email) {
			super();
			this.cpf = cpf;
			this.nome = nome;
			this.senha = senha;
			this.email = email;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
}
