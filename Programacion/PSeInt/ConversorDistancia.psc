Proceso ConversorDistancia
	
	Definir millas como real;
	Definir FACTOR_MILLAS como real;
	FACTOR_MILLAS <- 1.60934; 
	//PSeInt en modo estricto no simula las constantes, por lo que se ha definido como una variable de tipo real//
	Escribir "Diga una distancia en millas para convertir en kil�metros ";
	Leer millas;
	
	Escribir "El resultado de su conversi�n es ", millas * FACTOR_MILLAS;
	
FinProceso
