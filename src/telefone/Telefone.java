package telefone;

public class Telefone {

	private short ddd;
	private String tipoTelefone;
	private String numero;
	
	public Telefone() {
		
	}

	public Telefone(Short ddd, String tipoTelefone, String numero) {
		super();
		this.ddd = ddd;
		this.tipoTelefone = tipoTelefone;
		this.numero = numero;
	}


	public String getTipoTelefone() {
		return tipoTelefone;
	}


	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}


	public long getDdd() {
		return ddd;
	}

	public void setDdd(short ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (ddd ^ (ddd >>> 32));
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((tipoTelefone == null) ? 0 : tipoTelefone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		if (ddd != other.ddd)
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (tipoTelefone == null) {
			if (other.tipoTelefone != null)
				return false;
		} else if (!tipoTelefone.equals(other.tipoTelefone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Telefone: " + tipoTelefone + " (" + ddd + ") " + numero;
	}
	
}
