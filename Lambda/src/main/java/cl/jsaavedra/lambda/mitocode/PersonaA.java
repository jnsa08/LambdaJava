package cl.jsaavedra.lambda.mitocode;

public interface PersonaA {
	public void caminar();
	
	default public void hablar() {
		System.out.println("Hablar Persona A");
	}
	
	default public void saltar() {
		System.out.println("Saltar Persona A");
	}
}
