package inimputableProyect;

public class Persona {
	
	private Ladron chorro;
	private String ubicacion = "Patio de tu casa";
	private Boolean isgarrronDeLaGranFlauta = false;
	private Boolean habilTirador = false;
	private Boolean meoAlChorro = false;
	private Boolean sePapoteo = false;
	private Boolean isVacioElCargador = false;
	private Boolean estaVivo = true;
	private Boolean tomoChivasRegal = false;
	private Integer tirosAlChorro = 0;
	private Boolean isInimputable = false;
	
	
	
		public Persona() {
		
		}
		
		public void amasijar() {
			isgarrronDeLaGranFlauta = true;
		}
		
		public void tirarAlChorro(Integer cantidadDeTiros) {
			this.tirosAlChorro = cantidadDeTiros;
			if(this.tirosAlChorro >= 12){
				this.isVacioElCargador = true;
			}else if(this.tirosAlChorro.equals(1)) {
				this.habilTirador = true;
			}
		}
				
		public void morir() {
			this.estaVivo = false;
		}
		
				
		public void llevarAlLugarMasRecondito(Ladron chorro) {
			chorro.reubicarse();
			this.ubicacion = "El lugar mas recondito de tu casa, en el ultimo dormitorio y si es posible al zotano";
		}
			
		
		public void tomarChivas() {
			this.tomoChivasRegal = true;
		}
		
		public Boolean mearAlChorro() {
			if(this.tomoChivasRegal == true) {
			this.meoAlChorro = true;
			}else {this.meoAlChorro = false;
		}return this.meoAlChorro;
		}
		
		public void amasijarEnElPatio() {
			this.isgarrronDeLaGranFlauta = true;
		}
		
		public void papotearse() {
			this.sePapoteo = true;
		}
		
		public boolean isPapoteado() {
			return this.sePapoteo;
		}
		
		public boolean isChorroMeado() {
			return this.meoAlChorro;
		}
		
		public boolean isHabilTirador() {
			return this.habilTirador;
		}
		
		public boolean isvacioElCargador() {
			return this.isVacioElCargador;
		}
		
		public boolean estaVivo() {
			return this.estaVivo;
		}
		
		public boolean isGarronDeLaGranFlauta() {
			return this.isgarrronDeLaGranFlauta;
		}
		
		public boolean irAlJuzgado() {
			if(this.isChorroMeado() == true & this.habilTirador == false & this.sePapoteo == true & this.ubicacion.equals("El lugar mas recondito de tu casa, en el ultimo dormitorio y si es posible al zotano")) {
				this.isInimputable = true;
			}return this.isInimputable;
		}
		
		public boolean isInimputable() {
			return this.isInimputable;
		}
}
