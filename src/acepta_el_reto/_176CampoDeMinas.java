package acepta_el_reto;

import java.util.Scanner;

public class _176CampoDeMinas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int altura = tec.nextInt(), base = tec.nextInt();
		String[][] matrizbb = new String[altura][base];
		tec.nextLine();
		for (int i = 0; i < matrizbb.length; i++) {
			for (int j = 0; j < matrizbb[0].length; j++) {
				matrizbb[i][j] = tec.nextLine();
			}
		}
		System.out.println(comprobacion(matrizbb));
	}

	public static int comprobacion(String[][] matrizbb) {
		int x = 0, conjunto_bombas = 0;
		for (int i = 1; i < matrizbb.length - 1; i++) {
			for (int j = 1; j < matrizbb[0].length - 1; j++) {
				x = 0;
				for (int k = i - 1; k <= i + 1; k++) {
					for (int a = j - 1; a <= j + 1; a++) {
						if (matrizbb[i][j].equals("-") && matrizbb[k][a].equals("*")) {
							x++;
						}
					}
				}
				if (x == 6) {
					conjunto_bombas++;
				}
			}
		}
		return conjunto_bombas;
	}
}
