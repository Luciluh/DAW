//Escribe un programa que pida la altura en cm y el peso en kg y muestre por pantalla
//el imc. Indica ademas si el usuario tiene un peso inferior al normal, sie s normal
//si tiene sobrebeso u obesidad (IMC=peso(kg)/estatura(m)^2


Proceso IMCCalculadora 
	
	Definir altura Como Real;
	Definir peso Como Real;
	Definir IMC Como Real;
	
	Escribir "Introduzca su peso (kg)";
	Leer peso;
	Escribir "Introduzca su altura (cm)";
	Leer altura;
	
	altura <- altura/100;
	IMC <- (peso)/(altura*altura);
	Escribir "Su IMC es ", IMC;
	
	Si (IMC < 18.5) Entonces		
		Escribir "Su peso es inferior al normal";
	SiNo
		Si (IMC < 25) Entonces	
			Escribir "Su peso es normal";
		SiNo
			Si (IMC < 30) Entonces
				Escribir "Su peso es suoperior al normal";
			SiNo
				Escribir "Usted tiene obesidad";
			FinSi
		FinSi
	FinSi

FinProceso

