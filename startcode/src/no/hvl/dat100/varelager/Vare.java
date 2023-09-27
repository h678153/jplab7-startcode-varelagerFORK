package no.hvl.dat100.varelager;

	public class Vare {
	
		private int varenr;
		private String navn; 
		private double pris;
		
		public Vare(int varenr, String navn, double pris) {
			
			this.varenr = varenr;
			this.navn = navn;
			this.pris = pris;
			
		}
	
	public int getVarenr() {
		
		return varenr; 
		
	}
	
	public void setVarenr(int varenr) {
		
		this.varenr = varenr;
	}
	
	public String getNavn() {
		
		return navn;
	}
	
	public void setNavn(String navn) {
		
		this.navn = navn;
	}
	
	public double getPris() {
		
		return pris;
	}
	
	public void setPris(double pris) {
		
		this.pris = pris;
	}
	
	public double beregnMoms() {
		
		double moms = 0;
		moms = this.pris * 0.2;
		return moms;
		
	}
	
	public String toString() {
		
		String svar; 
		String pris = Double.toString(this.pris);
		String varenr = Integer.toString(this.varenr);
		String navn = this.navn;
		
		svar = "Vare [varenr=" + varenr + ", navn=" + navn + ", pris=" + pris + "]";
		
		return svar;
		
	}
	
	public boolean erBilligereEnn(Vare v) {
		
		boolean svar = false;
		if (v.pris > this.pris) {
			svar = true;
			return svar;
		} else {
			return svar;
		}
	}
	
}
