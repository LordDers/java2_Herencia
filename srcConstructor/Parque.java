public class Parque extends EspacioPublico {
	
	private int numBancos;
	
	public Parque (String nombre, String direccion) {
		
		super(nombre, direccion);
	}

	public void setNumBancos (int bancos) {

		this.numBancos = bancos;
	}

	public int getNumBancos () {

		return numBancos;
	}
}