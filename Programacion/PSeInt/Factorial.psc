//Escribe un programa que calcule el factorial de un numero. Tendras que solicitar el numero y acto seguido mostrarle el factorial
//Ej: 
//0!:1 ; 1!:1 ; 2!: 1·2 = 2; 3 = 1·2·3 = 6

//n = n · (n-1) · (n-2) · 
// 7 =  7·6·5·4·3·2·1
Algoritmo Factorial
	Definir num Como Entero;
	Definir resultado Como Entero;
	Escribir "Inserte número";
	resultado <- 1;
	Leer num;
	
	Repetir
		resultado <- resultado*num;
		num <- num-1;
		
	Hasta que num == 1 
		
	
	Escribir "El factorial es: ", resultado;
	
FinAlgoritmo
