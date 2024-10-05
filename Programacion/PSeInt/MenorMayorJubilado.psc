//Crea un algoritmo que dada la edad el usuario, muestre por pantalla si es mayor de edad, menor de edad o si esta jubilado (67 años o más)//

Proceso MenorMayorJubilado
	
		Definir edad Como Entero;
		
		Escribir "Inserte su edad";
		Leer edad;
		
		Si (edad<18) Entonces
			Escribir "Eres menor de edad";
		SiNo
			Si (edad>=18 Y edad<67) Entonces
				Escribir "Eres mayor de edad, pero aun no estas en la edad de jubilacion";
			SiNo
				Si (edad>=67) Entonces
					Escribir "Enhorabuena, puedes jubilarte";
				FinSi
			FinSi
		FinSi
FinProceso
