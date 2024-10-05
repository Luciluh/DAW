//Escribe un algoritmo que dado un numero, muestre por pantalla todos su divisores
//Ej: 8= 1 2 4 8

Algoritmo Divisores
	
	Definir num Como Entero;
	Definir divisor Como Entero
	Definir resultado Como Caracter;
	Escribir "Introduxca un numero";
	Leer num;
	resultado<-"" ;
	
	Para divisor<-1 Hasta num Con Paso 1 Hacer
		
		Si 	(divisor == num)
			resultado = resultado + "y " + ConvertirATexto(divisor) + ".";
		FinSi
		
		Si 	(num%divisor==0 Y divisor <> num)
			resultado = resultado + ConvertirATexto(divisor) + ", ";
		FinSi
	Fin Para
		Escribir "Los divisores son: ",resultado;
FinAlgoritmo
