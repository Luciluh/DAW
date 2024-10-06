Algoritmo MultiploCinco
	
	Definir multipl Como Entero
	Definir vueltas Como Entero
	
	multipl<-1
	vueltas<-0

	Mientras vueltas<100 Hacer
		Si multipl%5==0 Entonces
			vueltas <- vueltas + 1
			Escribir multipl, "," Sin Saltar
		FinSi
		multipl<- multipl + 1
	Fin Mientras
	
FinAlgoritmo
