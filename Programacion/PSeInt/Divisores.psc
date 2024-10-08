Algoritmo DivisoresExamen
	
	Definir num Como Entero;
	Definir divisor Como Entero;
	Definir resultado Como Caracter;
	
	Repetir
		Escribir "Inserte un numero entero entero mayor que 0";
		Leer num; 
	Hasta Que num>0
	
	Para divisor<-1 Hasta num Hacer
		
		Si 	(divisor == num) Entonces
			resultado <- resultado + "y " + ConvertirATexto(divisor) + "."; 
		FinSi
		
		Si 	(num%divisor==0 Y divisor <> num)  Entonces
			resultado <- resultado + ConvertirATexto(divisor) + ", ";
		FinSi
		
	Fin Para
	
	Escribir "Los divisores son: ",resultado;
	
FinAlgoritmo
