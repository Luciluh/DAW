	//Escribe un algoritmo que solicite al usuario el dia de la semana (1, 2 ,3 ,4...) y muestre por pantalla el nombre del dia (lunes, martes, miercoles...)
Proceso DiaSemana
	Definir dia Como Entero;
		
	Escribir "Inserte un n�mero";
	Leer dia;
	
	Segun (dia) Hacer
		1: Escribir "Lunes" ;
		2: Escribir "Martes" ;
		3: Escribir "Miercoles" ;
		4: Escribir "Jueves" ;
		5: Escribir "Viernes" ;
		6: Escribir "S�bado" ;
		7: Escribir "Domingo" ;
			
		De Otro Modo:
			Escribir "El d�a es incorrecto";
	FinSegun
	
FinProceso
