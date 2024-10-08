Algoritmo PiramideUnoDos
	Definir altura Como Entero;
	Definir fila Como Entero;
	Definir columna Como Entero;
	
	//Leemos la altura de la piramide
	Escribir "Introduce una altura";
	Leer altura; 
	
	Para fila <- 1 Hasta altura Hacer
		
		//escribo en pantalla los espacios
		Para columna <- 1 Hasta (altura - fila) Hacer
			Escribir " " Sin Saltar;
		FinPara
		
		//escribo en pantalla asteriscos
		Para columna <- 1 Hasta fila Hacer
			Escribir  "*" Sin Saltar;
		FinPara
		
		Escribir ""; 
	FinPara
	
FinAlgoritmo
