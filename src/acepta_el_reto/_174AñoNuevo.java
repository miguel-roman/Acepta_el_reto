package acepta_el_reto;

import java.util.Scanner;

public class _174AñoNuevo {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		int numero = tec.nextInt();

		boolean repetido = repetidos(String.valueOf(numero)), repDeNuevo = repetido;
		int signumero = numero, anyoMenor = -1;

		while (repDeNuevo == repetido) {
			repDeNuevo = repetidos(String.valueOf(signumero));
			if (repDeNuevo == repetido) {
				signumero--;
				anyoMenor++;
			}
		}

		signumero = numero;
		repDeNuevo = repetido;
		int anyoMayor = 0;

		while (repDeNuevo == repetido) {
			repDeNuevo = repetidos(String.valueOf(signumero));
			if (repDeNuevo == repetido) {
				signumero++;
				anyoMayor++;
			}
		}
		int Anyo1 = numero - anyoMenor;
		int seriemayor = anyoMayor + anyoMenor;
		System.out.println(Anyo1 + " " + seriemayor);
	}

	public static boolean repetidos(String num) {
		for (int i = 0; i < num.length() - 1; i++) {
			for (int j = i + 1; j < num.length(); j++) {
				if (num.charAt(i) == num.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
}
