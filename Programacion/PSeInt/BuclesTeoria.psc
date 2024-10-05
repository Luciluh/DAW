Algoritmo BuclesTeoria
	
//Mientras que no se cumpla esa condici�n no se sale del bucle [While...]/ CUANDO NO ESTOY SEGURA CUANTAS VECES SE PUEDE HACER EL BUCLE/
	Mientras expresion_logica Hacer
		secuencia_de_acciones
	Fin Mientras
	
//Tu haz cosas y luego comprueba la condicion a ver si repetimos el bucle Do...while  CUANDO AL MENOS QUIERO QUE EL BUCLE DE HAGA UNA VEZ//
	Repetir
		instrucciones
	Hasta Que (condicion);
	
//Cuando sabes cuantas veces tienes que recorrer el bucle  For(contador=0;contador<5;contador ++)[....]// 
	Para variable_control<-valor_inicial Hasta valor_final //[Con Paso X Hacer] sin esto se da por hecho que es +1 al contador,//
		//pero si queremos que aumente otro valor hay que a�adir esto// 
		secuencia_de_acciones
	Fin Para
	

FinAlgoritmo
