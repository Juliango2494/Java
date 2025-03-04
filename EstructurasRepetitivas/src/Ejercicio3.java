
public class Ejercicio3 {
	public static void main(String Arg[]) {
		int n= 10;
		int x=0,y=0,sumx=0,sumy=0,sumi=0;
		System.out.println("\nWHILE");
		while (x<n) {
			x++;
			sumx+=x;
			System.out.println((sumx-x)+"+"+x+"="+sumx);
		}
		System.out.println("\nDO WHILE");
		do {
			y++;
			sumy+=y;
			System.out.println((sumy-y)+"+"+y+"="+sumy);
		} while (y<n);
		System.out.println("\nFOR");
		for (int i = 0; i < n; ) {
			i++;
			sumi+=i;
			System.out.println((sumi-i)+"+"+i+"="+sumi);
		}
	};

}
