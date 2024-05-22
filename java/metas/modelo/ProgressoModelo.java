package metas.modelo;

public class ProgressoModelo {

	private int id;
	private int id_meta;
	private int valor;
	
	public ProgressoModelo(int id, int id_meta, int valor) {
		super();
		this.id = id;
		this.id_meta = id_meta;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_meta() {
		return id_meta;
	}

	public void setId_meta(int id_meta) {
		this.id_meta = id_meta;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	
}
