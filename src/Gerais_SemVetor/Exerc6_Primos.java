package Gerais_SemVetor;

import javax.swing.JOptionPane;

public class Exerc6_Primos {

	public static void main(String[] args) {
		int SomaP =0, Div =0;
		
		for(int x =1; x<=100; x++) {
			for(int y = 1; y<=x; y++) {
				if(x%y==0)
					Div++;
			}
			if(Div==2) {
				SomaP += x;
			}
			Div=0;
		}

		JOptionPane.showMessageDialog(null, "A soma dos primos é igual à: " + SomaP, "ValoresPrimos", 1);
	}

}
