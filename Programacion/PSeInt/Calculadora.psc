//Escribe un programa que pida dos numeros y, a continuacion pregunte por la operacion a realizar (1. suma, 2 resta, 3 multiplicacion, 4. division). 
//El programa debe mostrar en pantalla el resultado de la operacion indicada
Proceso Calculadora 
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	Definir operacion Como Entero;
	Escribir "Introduce un número";
	Leer num1;
	Escribir "Introduce un número";
	Leer num2;
	
	Escribir "1. Suma";
	Escribir "2. Resta";
	Escribir "3. Multiplicacion";
	Escribir "4. Division";
	Escribir "¿Qué operacion quiere realizar?";
	Leer operacion;
	
	Segun operacion Hacer
		1: Escribir "Resultado: ", num1+num2;
		2: Escribir "Resultado: ", num1-num2;
		3: Escribir "Resultado: ", num1*num2;
		4: Escribir "Resultado: ", num1/num2;
		De Otro Modo:
			Escribir "No es una operacion válida";
	FinSegun
FinProceso
