Algoritmo RectanguloMenuExamen
	
	Definir base Como Entero;
	Definir altura Como Entero;
	Definir contador Como Entero;
	Definir contador2 Como Entero;
	Definir espacios Como Entero;
	
	Definir num Como Entero;
	
	Escribir " 1. Introduzca la dimensi�n de la base del rect�ngulo.";
	Escribir " 2. Introduzca la dimensi�n de la altura del rect�ngulo.";
	Escribir " 3. Pinta el rect�ngulo.";
	Escribir " 4. Intercambia base por altura.";
	Escribir " 5. Salir.";
	
	Repetir
		Leer num;
		Segun num Hacer
			1:
				Escribir " 1. Introduzca la dimensi�n de la base del rect�ngulo.";
				Leer base;
				Escribir " Vuelva a elegir una opcion";
			2:
				Escribir " 2. Introduzca la dimensi�n de la altura del rect�ngulo.";
				Leer altura;
				Escribir " Vuelva a elegir una opcion";
			3:
				Escribir " 3. Pinta el rect�ngulo.";
				Para contador<-1 Hasta altura Hacer
					
					Si contador==1 O contador==altura Entonces
						Para contador2<-1 Hasta base  Hacer
							Escribir '*'Sin Saltar;
						FinPara
					SiNo
						Escribir '*'Sin Saltar;
						Para espacios<-1 Hasta base-2 Con Paso 1 Hacer
							Escribir " " Sin Saltar;
						FinPara
						Escribir '*'Sin Saltar;
					FinSi
					
					Escribir '';
					
				FinPara
				Escribir " Vuelva a elegir una opcion";
			4:	
				Escribir " 4. Intercambia base por altura.";
				base <- altura;
				altura <- base;
				
				Para contador<-1 Hasta altura Hacer
					
					Si contador==1 O contador==altura Entonces
						Para contador2<-1 Hasta base  Hacer
							Escribir '*'Sin Saltar;
						FinPara
					SiNo
						Escribir '*'Sin Saltar;
						Para espacios<-1 Hasta base-2 Con Paso 1 Hacer
							Escribir " " Sin Saltar;
						FinPara
						Escribir '*'Sin Saltar;
					FinSi
					
					Escribir '';
					
				FinPara
				Escribir " Vuelva a elegir una opcion";
			5:
				Escribir " 5. Salir.";
		Fin Segun
		
	Hasta Que num==5
	
FinAlgoritmo
