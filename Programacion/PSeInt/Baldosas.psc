//Se necesita calcular cuantas baldosas caben en el suelo de una habitacion. Para ello el programa pedir� el ancho y largo de una habitaci�n (A= a*l) //
//adem�s el programa pedira al usuario cuanto mide el lado de la baldosa y cuanto vale el m2 de cada baldosa. Dime cuantas baldosas caben y el precio total//

Algoritmo Baldosas
	Definir anchoRectangulo Como Real;
	Definir altoRectangulo Como Real;
	Definir areaRectangulo Como Real;
	Definir ladoBaldosa Como Real;
	Definir areaBaldosa Como Real;	
	Definir precioBaldosa Como Real;
	Definir precioHabitacion Como Real;
	Definir numerobaldosas Como Real;
	Definir numerobaldosasalto Como Real;
	Definir numerobaldosasancho Como Real;
	
	
	
	Escribir "�Cu�l es el ancho de la habitaci�n (cm)?";
	Leer anchoRectangulo;
	Escribir "�Cu�l es el alto de la habitaci�n (cm)?";
	Leer altoRectangulo;	
	Escribir "�Cu�nto mide el lado de una baldosa (cm)?";
	Leer ladoBaldosa;
	Escribir "�Cu�nto cuesta el m2 de baldosas (?)?";
	Leer precioBaldosa;
	
	areaRectangulo <- anchoRectangulo*altoRectangulo;
	areaBaldosa <- ladoBaldosa*ladoBaldosa;
	precioHabitacion <- (areaBaldosa/100)*precioBaldosa;
	
	numerobaldosasalto <- (altoRectangulo/ladoBaldosa);
	numerobaldosasancho<- (anchoRectangulo/ladoBaldosa);
	numerobaldosas <- (altoRectangulo/ladoBaldosa) * (anchoRectangulo/ladoBaldosa);
	
	
	Escribir "El coste de las baldosas de su habitaci�n ser� de ", precioHabitacion, " euros";
	Escribir "Necesitar�s ", numerobaldosas, " baldosas";
	
FinAlgoritmo
