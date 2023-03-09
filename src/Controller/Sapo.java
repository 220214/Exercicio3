package Controller;

public class Sapo extends Thread {
	private String nome;
	private int disCo=0 ,distt, pu =0,pulos=0;
	private static int posição=0;
	private final static int puMax=10;
		public Sapo (String nome, int distt) {
				super(nome);
				this.distt=distt;
				this.nome = nome;
	
		}
		
		public void run() {
			while (disCo < distt) {
				saltasapo();
				mostrasapo();
				parasapo();
				try {
					sleep(10);
				}catch (InterruptedException e) {}
			
				}
				try {
					sleep(100);
				}catch (InterruptedException e) {}
					possapo();
				
		
			}
		

		public void saltasapo() {
			pulos++;
			pu =(int)(Math.random()*puMax);
			disCo= disCo + pu;
				if (disCo>distt) {
					disCo = distt;
				}
		}
		public void mostrasapo() {
			System.out.println("O "+ nome + "pulou "+ pu+ " m, ja percorreu "+ disCo +" m ");
		}
		public void parasapo() {
			yield();
		}
		public void possapo() {
			posição++;
			System.out.println("\n " + nome +" foi o "+ posição + "º colocado com "+ pulos + " pulos ");
		}
}

    