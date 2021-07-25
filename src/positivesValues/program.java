//URI 1064 - 25/07/2021

package positivesValues;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int positiveValues = 0;
		double sum = 0, x = 0, media = 0;
		
		Positives pos = new Positives(positiveValues, media, sum, x);
		
		for (int i = 0; i < 6; i++) {
			x = sc.nextDouble(); //faz a leitura do valor desejado
			
			if(x > 0) { //caso for positivo
				pos.addPositivesValues(positiveValues + 1); // adiciona 1
				pos.addSum(x); //soma o valor 'x' com a variavel sum
			}
		}
		
		System.out.println(pos); //imprime o toString
		
		sc.close();
	}

}
