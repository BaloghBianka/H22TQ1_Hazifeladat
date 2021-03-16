
public class Könyv {
		
		private String cim;
		private String szerzo;
		private long megjelenes_eve;
		private long ar;
		
		public void novelar(long szazalek) {
			ar += (long)(ar*(szazalek/100.0f));

		}
		
		public String kiiras() {
			return "Cím: " + cim + ", Szerző:" + szerzo + ", Megjelenés éve: " + megjelenes_eve + ", Ár: " + ar + " Ft"; 
		}
		
		public void setCim(String cim) {
			this.cim = cim;
		}
		public String getCim() {
			return this.cim;
		}
		
		
		
		public void setSzerzo(String szerzo) {
			this.szerzo = szerzo;
		}
		public String getSzerzo() {
			return this.szerzo;
		}
		
		
		
		public void setMegjelenes_eve(long megjelenes_eve) {
			this.megjelenes_eve = megjelenes_eve;
		}
		
		public long getMegjelenes_eve() {
			return this.megjelenes_eve;
		}
		
		
		public void setAr(long ar) {
			this.ar = ar;
		}
		
		public long getAr() {
			return this.ar;
		}
		
	}


