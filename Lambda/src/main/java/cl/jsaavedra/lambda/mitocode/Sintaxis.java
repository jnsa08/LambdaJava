package cl.jsaavedra.lambda.mitocode;

public class Sintaxis {

	public double probarSintaxis() {
		//Operacion operacion = (double p1, double p2) -> (p1 + p2) / 2;
		//Operacion operacion = (double p1, double p2) -> { return (p1 + p2) / 2;};
		Operacion operacion = (p1, p2) -> (p1 + p2) / 2;
		return operacion.calcularPromedio(2, 3);
	}

	public static void main(String[] args) {
		Sintaxis app = new Sintaxis();
		System.out.println(app.probarSintaxis());

	}

}
