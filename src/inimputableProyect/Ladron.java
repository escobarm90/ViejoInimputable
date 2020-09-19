package inimputableProyect;

public class Ladron {
	
	private Persona victima;
	private String ubicacion = "Patio de la casa de la victima";
	
	
	public Ladron(){
	}
	
	public void matar(Persona victima){
		victima.morir();
	}
	
	public void reubicarse() {
		this.ubicacion = "El lugar mas recondito de tu casa, en el ultimo dormitorio y si es posible al zotano";
	}

}
