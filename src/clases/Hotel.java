package clases;

public class Hotel {
	private int id;
	private String cif;
	private String nombre;
	private String gerente;
	private int estrellas;
	private String compania;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	public int getEstrellas() {
		return estrellas;
	}
	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	@Override
	public String toString() {
		return "Hoteles [id=" + id + ", cif=" + cif + ", nombre=" + nombre + ", gerente=" + gerente + ", estrellas="
				+ estrellas + ", compania=" + compania + "]";
	}
}
