//Realice un programa que solicite numeros enteros positivos hasta que el usuario
//introduzca el cero. Al terminar, se debera mostrar el resultado de la medida de los
//valores. AYUDA: La medida es igual a la suma de los numeros leidos entre el total de 
//valores

	Proceso CalMediaPositivos
		
		Definir numPos Como Entero;
		Definir suma Como Entero;
		DEfinir contador Como Entero;
		contador <- 0;
		suma <- 0;
		
		Repetir
			Escribir "Introduzca un valor entero positivo";
			Leer numPos;
			Si numPos>0 Entonces
				suma <- numPos+suma;
				contador <- contador + 1;
			Sino 
				Escribir "Debe introducir un valor entero positivo";
			FinSi
			
		Hasta Que numPos == 0
		
		//Para que no de error de division entre 0 haremos lasiguiente comprobacion//
		Si contador <> 0 Entonces
			Escribir "La media de los numeros introducidos es: ", (suma/contador);
		FinSi
		
	FinProceso
