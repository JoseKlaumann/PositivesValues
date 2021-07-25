package positivesValues;

public class Positives {
	
	public int positiveValues;
	public double media;
	public double sum;
	public double x;
	
	public Positives() {
	}
	
	public Positives(int positiveValues, double media, double sum, double x) {
		this.positiveValues = positiveValues;
		this.media = media;
		this.sum = sum;
		this.x = x;
	}
	
	public double getX() {
		return x;
	}
	
	public void addPositivesValues(int positiveValues) { //adicionar +1 na variavel quando for positivo
		this.positiveValues += positiveValues;
	}
	
	public void addSum(double sum) { //efetua a soma conforme o valor der positivo
		this.sum += sum;
	}
	
	public double media() { //efetua o calculo da media
		return sum / positiveValues; 
	}
	
	public String toString() { //faz a impressao na tela
		return positiveValues
			   + " positives values\n"
			   + String.format("%.1f", media());
	}
}
