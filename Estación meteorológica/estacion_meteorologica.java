import java.util.Scanner;

public class PreciAbril {

	public static void main(String[] args) {
		double totalPreci=0;
		int diasLluvia=0;
		double [] diasAbril = new double[30];
		double max = diasAbril[0];
		int posiMax=0;
		
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario que introduzca las precipitaciones
		System.out.println("Introduzca las precipitaciones: ");
		for (int i=0; i<diasAbril.length; i++) {
			System.out.print("Precipitaciones día "+(i+1)+": ");
			diasAbril[i] = sc.nextDouble();
		}
		
		//Sumo el total de precipitaciones
		for (int i=0; i<diasAbril.length; i++) {
			totalPreci+=diasAbril[i];
		}
		
		//Cuento los días de lluvia
		for (int i=0; i<diasAbril.length; i++) {
			if (diasAbril[i]>0) {
				diasLluvia++;
			}
		}
		
		//Obtengo el día con más precipitaciones
		for (int i = 1;i< diasAbril.length; i++){
			if ( max < diasAbril[i]){
				max = diasAbril[i];
			}
		}
		
		for (int i=0; i<diasAbril.length; i++) {
			if (diasAbril[i]==max) {
				posiMax = i;
			}
		}
		
		System.out.println("Día con más precipitaciones: "+(posiMax+1)+" de Abril. Con un total de "+max+" milímetros");
		System.out.println("Día con precipitaciones > 0: "+diasLluvia);
		System.out.println("Total de precipitaciones recogidas: "+totalPreci);

	}

}
