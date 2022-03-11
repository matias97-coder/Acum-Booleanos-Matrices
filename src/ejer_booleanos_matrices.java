public class ejer_booleanos_matrices {

	// TEMA ACUMULADORES BOOLEANOS

	public static boolean esPar(int n) {

		return n % 2 == 0;

	}

	public static boolean todosPares(int vec[]) {

		boolean sonTodosPar = true;

		for (int i = 0; i < vec.length; i++) {
			sonTodosPar = sonTodosPar && esPar(vec[i]);
		}
		return sonTodosPar;
	}

	public static boolean algunPar(int vec[]) {

		boolean existeAlgunPar = false;

		for (int i = 0; i < vec.length; i++) {
			existeAlgunPar = existeAlgunPar || esPar(vec[i]);
		}
		return existeAlgunPar;
	}

	public static boolean esNegativo(int n) {
		return n < 0;
	}

	public static boolean hayNegativo(int fila[]) {
		boolean existeNegativo = false;

		for (int i = 0; i < fila.length; i++) {

			existeNegativo = existeNegativo || esNegativo(fila[i]);

		}

		return existeNegativo;
	}
	
	public static boolean negativoEnTodas(int matriz[][]){
		
		boolean todasConNegativo = true;
		
		for (int i = 0; i < matriz.length; i++) {
			todasConNegativo = todasConNegativo && hayNegativo(matriz[i]);
		}
		
		return todasConNegativo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vec[] = { 8, 3, 5, 9 };
		int matriz[][] = { { 8, 3, 5, -7 }, { 0, -2, 4, 6 }, { 8, -9, 10, 11 } };
		System.out.println("son todos pares? " + todosPares(vec));
		System.out.println("Hay algun Par? " + algunPar(vec));
		System.out.println("Hay 1 negativo en todas filas? "+ negativoEnTodas(matriz));

	}
}