package no.hvl.dat100.varelager;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Varelager {

	protected Vare[] varer;
	protected int antall;
	
	public Varelager(int n) {
		
		varer = new Vare[n];
		antall = 0;

	}
	
	public Vare[] getVarer() {
		
		return varer;

	}
	
	public boolean leggTilVare(Vare v) {
		
		boolean svar = false;
		
		if (varer.length > antall) {
			varer[antall] = v;
			antall = antall + 1;
			svar = true;
			return svar;
		} else {
			return svar;
		}

	}
	
	public boolean leggTil(int varenr, String navn, double pris) {
		
		Vare v1 = new Vare(varenr, navn, pris);
		if (leggTilVare(v1) == true) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public Vare finnVare(int varenr) {
		
		for(int i = 0; i < varer.length; i++) {
			if (this.varer[i] == varenr) {
				
			}
			
		}

	}
	
	private String SEP = "==============================";
	
	public void printVarelager() {
				
		for (int i = 0; i < varer.length; i++) {
//			System.out.print("Vare [");
//			System.out.print(Integer.toString(Vare.varenr));
//			System.out.println(SEP);
			System.out.println(Arrays.toString(varer));
//			System.out.println(SEP);
		}

	}
	
}
