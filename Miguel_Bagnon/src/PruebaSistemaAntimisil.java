import java.util.Scanner;

public class PruebaSistemaAntimisil {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un vector de dos dimensiones (coordenadas x, y):");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		Vector misil1 = new Vector (x1, y1);
		Vector antimisil1 = new Vector (x2, y2);
		
		/**
		 * @get modulo
		 */
		System.out.println("El módulo del vector es:" + misil1.modulo());

		Misil.t = ((misil1.modulo/2)/Misil.velocidad);
		
		Antimisil.velocidad = (((misil1.modulo/2) - antimisil1) / (Misil.t));
	}

}
