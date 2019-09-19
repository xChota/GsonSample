package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nombre: ");
		String scannom = scanner.nextLine();
		System.out.println("Apellido: ");
		String scanape = scanner.nextLine();
		System.out.println("Edad: ");
		int scaneda = scanner.nextInt();
		
		Persona persona = new Persona(scannom,scanape,scaneda);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(persona);
		System.out.println(json);
		
		scanner.close();
	}
}
