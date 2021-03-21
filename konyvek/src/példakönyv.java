import java.time.YearMonth;

public class példakönyv {
	
	public static void main(String[] args) {

				int ev = YearMonth.now().getYear();
				
				
				Könyv Gyűrűk_Ura = new Könyv("Gyűrűk Ura", "J.R.R. Tolkien",ev,2500);
				Könyv Az = new Könyv("Stephen King", "AZ");
		
				/*
				könyv.setCim("Gyűrűk Ura");
				könyv.setSzerzo("J.R.R. Tolkien");
				könyv.setMegjelenes_eve(1954);
				könyv.setAr(6000);*/
				
				/*System.out.println(könyv.kiiras());
				könyv.novelar(20);
				System.out.println(könyv.kiiras());
				*/
				

				System.out.println(Gyűrűk_Ura);
				System.out.println(Az.kiiras());
				
	}
}
