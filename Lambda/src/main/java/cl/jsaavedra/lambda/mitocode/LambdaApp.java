package cl.jsaavedra.lambda.mitocode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class LambdaApp {
	
	public void ordenar() {
		List<String> lista = new ArrayList<String>();
		lista.add("Jonathan");
		lista.add("Daniela");
		lista.add("Alejandra");

		/* Jdk <= 1.7
		Collections.sort(lista, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}

		});*/
		
		//Jdk 8
		Collections.sort(lista, (String a, String b) -> a.compareTo(b));
		

		for (String nombre : lista) {
			System.out.println(nombre);
		}
	}
	
	public void calcular() {
		
		/*Operacion operacion = new Operacion() {

			@Override
			public double calcularPromedio(double p1, double p2) {
				return (p1+p2)/2;
			}
			
		}; 
		System.out.println(operacion.calcularPromedio(2, 3));
		*/
		
		Operacion op = (p1,p2) -> (p1+p2)/2;
		System.out.println(op.calcularPromedio(2, 3));
		
		
	}

	public static void main(String[] args) {

		LambdaApp app = new LambdaApp();
		app.ordenar();
		//app.calcular();
	}
}
