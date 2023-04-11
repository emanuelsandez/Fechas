//<

package cl.emanuelsandez;


import java.util.Scanner;

public class Fechas {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int anio1, mes1, dia1, anio2, mes2, dia2, largoFecha1,largoFecha2;	//Declaración de variables
		String fecha1, fecha2;
		boolean continua;
		
		do {
			continua = false;
		do {	
			Scanner tecla = new Scanner(System.in);		// Ingreso de variables fecha 1
		
				System.out.println("Ingrese la primera fecha, con formato DD/MM/AAAA");
				fecha1=tecla.next();
				largoFecha1 = fecha1.length();
				tecla.close();
			if( largoFecha1 != 10) {				// Validación de formato fecha 1
				System.out.println("Fecha con formato incorrecto, favor ingresar nuevamente con el formato solicitado");
			}		
		}
		while( largoFecha1 != 10);
				
		
		do {	
			Scanner tecla = new Scanner(System.in);		// Ingreso de variables fecha 2
			System.out.println("Ingrese la segunda fecha, con formato DD/MM/AAAA");
			fecha2=tecla.next();
			largoFecha2 = fecha2.length();
			tecla.close();
			
				
			if(largoFecha2 != 10) {					// Validación de formato fecha 2
				System.out.println("Fecha con formato incorrecto, favor ingresar nuevamente con el formato solicitado");
			}		
		}
		while( largoFecha2 != 10);
		try {													//Manejo de excepción
		
		anio1 = Integer.parseInt(fecha1.substring(6));			// Descomposición de variables
		mes1 = Integer.parseInt(fecha1.substring(3,5));
		dia1 = Integer.parseInt(fecha1.substring(0,2));
		
		anio2 = Integer.parseInt(fecha2.substring(6));
		mes2 = Integer.parseInt(fecha2.substring(3,5));
		dia2 = Integer.parseInt(fecha2.substring(0,2));
		
		
		if(fecha1.equals(fecha2)){						// Análisis fecha mayor
			System.out.println("Las personas tienen la misma edad");
		}
		
		else if (anio1<anio2) {				
		
			System.out.printf("La persona mayor es la nacida en %s", fecha1);
			}
			else if (anio1>anio2) {
				System.out.printf("La persona mayor es la nacida en %s", fecha2);
				}
				else if(mes1<mes2){
					System.out.printf("La persona mayor es la nacida en %s", fecha1);
					}
					else if(mes1>mes2) {
						System.out.printf("La persona mayor es la nacida en %s", fecha2);	
						}
						else if(dia1<dia2){
							System.out.printf("La persona mayor es la nacida en %s", fecha1);
							}
							else if(dia1>dia2) {
								System.out.printf("La persona mayor es la nacida en %s", fecha2);	
								}
			
		}
		catch(NumberFormatException ex) {
			
			System.out.println("Fecha con formato incorrecto, favor ingresar nuevamente con el formato solicitado.");
				
			continua = true;			
		}	
		}
		while ( continua );
		
	}

}
