package view;

import Controller.Sapo;

public class SapoPrincipal {
	
		final static int nsapo= 5;
		final static int dis=20;
		public static void main (String []args) {
			Sapo bufo;
			for (int cta = 1 ; cta <= nsapo; cta++) {
				bufo = new Sapo ("Sapo _  "+ cta, dis);
				bufo.start();
			}
		}
	}

