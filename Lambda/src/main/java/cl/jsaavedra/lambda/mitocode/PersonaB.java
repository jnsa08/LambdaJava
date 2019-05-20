package cl.jsaavedra.lambda.mitocode;

public interface PersonaB {
	
	default public void hablar() {
		System.out.println("Hablar Persona B");
	}
	
	default public void saltar() {
		System.out.println("Saltar Persona B");
	}

}
