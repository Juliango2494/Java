import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String Arg[]) {
		int i=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa el numero de la tabla que deseas ver");
		int num=input.nextInt();
		input.close();
		System.out.println("\nTABLA DEL "+num+":");
		while (i<=10) {
			System.out.println(num+"x"+i+"="+i*num);
			i++;
		}
	};

}
