package ex2;

public class GenericMethods {

	public static void main(String[] args) {
		Persona persona = new Persona();

		metodeGeneric(persona, "Juan", 18);

	}

	public static void metodeGeneric(Persona persona, String nom, int num) {
		System.out.print("Nom: " + nom + "\nN�mero: " + num + "\n" + persona.toString());
	}
}
