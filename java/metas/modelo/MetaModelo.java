package metas.modelo;

public class MetaModelo {
	
	private int id;
	private String cpf;
	private String tipo;
	private double valor;
	private double acumulado;
	
	public MetaModelo(int id, String cpf, String tipo, double valor, double acumulado) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.tipo = tipo;
		this.valor = valor;
		this.acumulado = acumulado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getAcumulado() {
		return acumulado;
	}
	public void setAcumulado(double acumulado) {
		this.acumulado = acumulado;
	}
	
	
	
	
}
