package ue3;
//18.Que escriba las tablas de multiplicar del 0 al 10
public class H2Ej18 {

	public static void main(String[] args) {
		int i;
		int j;
		int k=0;
		for (i=0;i<=10;i=i+1) {
			for (j=0;j<=10;j=j+1) {
				k=j*i;
				System.out.println(i+" * "+j+" ="+k);
			}
		}

	}

}
