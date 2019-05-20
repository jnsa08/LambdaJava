package cl.jsaavedra.lambda.mitocode;

public class DefaultMethod implements PersonaA, PersonaB {

	@Override
	public void caminar() {
		System.out.println("Caminar implementación");
		
	}
	
	@Override
	public void saltar() {
		PersonaA.super.saltar();
	}

	@Override
	public void hablar() {
		PersonaA.super.hablar();
	}

	public static void main(String[] args) {
		DefaultMethod app = new DefaultMethod();
		app.hablar();
		app.saltar();
		app.caminar();

	}

}
