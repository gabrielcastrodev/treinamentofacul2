
public class AtividadeAula1 {

	public double numero1;
	public double numero2;
	public double numero3;
	public double numero4;
	public double soma;

	public AtividadeAula1(double numero1, double numero2, double numero3, double numero4) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.numero3 = numero3;
		this.numero4 = numero4;
		this.soma = numero1 + numero2 + numero3 + numero4;

	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public double getNumero3() {
		return numero3;
	}

	public void setNumero3(double numero3) {
		this.numero3 = numero3;
	}

	public double getNumero4() {
		return numero4;
	}

	public void setNumero4(double numero4) {
		this.numero4 = numero4;
	}
	
	public double getSoma() {
		return this.soma;
	}

}
