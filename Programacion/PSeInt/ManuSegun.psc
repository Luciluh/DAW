Algoritmo MenuSegun
	
	Definir opcion Como Entero;
	Definir nombre Como Caracter;
	
Repetir
		Escribir "0. Despedir"
		Escribir "1. Saludar";
		Escribir "2. Introducir nombre";
		Escribir "Introduce una opción";
		Leer opcion; 
		
		Segun (opcion) Hacer
			0:
			1:
				Escribir "Hola"
			2:
				Escribir "Dame tu nombre"
				Leer nombre 
			De Otro Modo:
				Escribir "Opcion incorrecta"
				
		FinSegun
		
Hasta Que (opcion==0)
		
FinAlgoritmo
