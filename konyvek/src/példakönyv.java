
public class példakönyv {

	public static void main(String[] args) {

				Könyv könyv = new Könyv();
				könyv.setCim("Gyűrűk Ura");
				könyv.setSzerzo("J.R.R. Tolkien");
				könyv.setMegjelenes_eve(1954);
				könyv.setAr(6000);
				
				System.out.println(könyv.kiiras());
				könyv.novelar(20);
				System.out.println(könyv.kiiras());
						
			}
	}
