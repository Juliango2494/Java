import java.util.Scanner;

public class Nomina2 {
	public static void main(String Arg[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Ingresa el salario del empleado");
		double salario = input.nextDouble();
		System.out.println("Ingresa la categoria del empleado");
		int cat = input.nextInt();
		input.close();
		double desc=0;
		double bonif=0;
		double salTot=0;
		switch (cat) {
		case 1:
			desc=salario*0.02;
			bonif=salario*0.15;
			salTot=salario+bonif-desc;
			System.out.println("Salario base: $"+salario+", Descuento: $"+desc+", bonificación: $"+bonif+"\nSALARIO TOTAL: $"+salTot);
			break;
			
		case 2:
			desc=salario*0.015;
			bonif=salario*0.1;
			salTot=salario+bonif-desc;
			System.out.println("Salario base: $"+salario+", Descuento: $"+desc+", bonificación: $"+bonif+"\nSALARIO TOTAL: $"+salTot);
			break;
		case 3:
			desc=salario*0.01;
			bonif=salario*0.08;
			salTot=salario+bonif-desc;
			System.out.println("Salario base: $"+salario+", Descuento: $"+desc+", bonificación: $"+bonif+"\nSALARIO TOTAL: $"+salTot);
			break;
		case 4:
			desc=salario*0.0;
			bonif=salario*0.0;
			salTot=salario+bonif-desc;
			System.out.println("Salario base: $"+salario+", Descuento: $"+desc+", bonificación: $"+bonif+"\nSALARIO TOTAL: $"+salTot);
			break;
			
		default:
			break;
		}
		
	};
}
