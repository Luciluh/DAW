/*1. Obtener por orden alfabético los nombres de los empleados cuyos salarios superen la mitad del salario del
empleado 180.*/

SELECT nomem 
FROM temple
WHERE salar > (SELECT salar FROM temple WHERE numem = 180)/50
ORDER BY 1;

/*2. Obtener por orden alfabético los nombres de los empleados cuyos salarios superan dos veces al mínimo salario
de los empleados del departamento 121.*/

SELECT nomem
FROM temple
WHERE salar > (SELECT MIN(salar*2) FROM temple WHERE numde=121)
ORDER BY 1;


/*3.Obtener por orden alfabético los nombres y los salarios de los empleados cuyo salario es inferior a tres veces la
comisión más baja existente distinta de NULL.*/

SELECT nomem, salar
FROM temple 
WHERE salar < (SELECT MIN(comis*3) FROM temple)
ORDER BY 1,2;

/*4. Obtener, utilizando el predicado BETWEEN, por orden alfabético los números (identificador único), nombres y los  salarios de 
los empleados con hijos cuyo salario dividido por su número de hijos cumpla una, o ambas, de las dos condiciones siguientes:
-Que sea inferior a 1200 Euros.
-Que sea superior al doble de su comisión.*/

SELECT numem, nomem, salar
FROM temple
WHERE numhi > 0 
AND (
    (salar / numhi BETWEEN 0 AND 1200)  -- Condición 1: Inferior a 1200 Euros
    OR (salar / numhi BETWEEN (ISNULL(comis, 0) * 2) + 1 AND 1000000) -- Condición 2: Mayor al doble de su comisión
)
ORDER BY 2;

/*5.Obtener por orden alfabético los nombres de los empleados cuyo primer apellido es Mora o empieza por Mora.*/

SELECT nomem
FROM temple
WHERE nomem LIKE 'MORA%'
ORDER BY 1;

/*6. Obtener por orden alfabético los nombres de los empleados cuyo primer apellido termina en EZ y su nombre de
pila termina en O y tiene al menos tres letras.*/

SELECT nomem 
FROM temple 
WHERE nomem LIKE '%ez,%___O'
ORDER BY 1;

/*7. Obtener, utilizando el predicado IN, por orden alfabético los nombres de los empleados del departamento 111 cuyo
salario es igual a alguno de los salarios del departamento 112 ¿Cómo lo obtendrías con el predicado ANY?.*/

SELECT nomem
FROM temple
WHERE numde = 111 
  AND salar IN (   --La condición salar IN (...) significa que solo se seleccionarán aquellos empleados del departamento 111 cuyo salario esté en la lista de salarios del departamento 112.
      SELECT salar
      FROM temple
      WHERE numde = 112
  )
ORDER BY 1;


SELECT nomem
FROM temple
WHERE numde = 111 
	AND salar = ANY (
		SELECT salar
		FROM temple
		WHERE numde = 112)
ORDER BY 1;

 
 /*8. Obtener por orden alfabético los nombres y comisiones de los empleados del departamento 110 si hay en él algún
empleado que tenga comisión.*/

SELECT nomem, comis, numde
FROM temple
WHERE numde = 110
ORDER BY 1;


/*9. Obtener por orden alfabético los nombres de los departamentos que tienen algún empleado sin comisión*/

SELECT nomde
FROM tdepto A JOIN temple B ON (A.numde = B.numde)
WHERE comis IS NULL
ORDER BY 1;


/*10. Para los departamentos cuyo nombre empieza por las letras O o P, mostrar el nombre del departamento y el nombre
del departamento del que depende.*/

-- REFLEXIVAS 

SELECT T1.nomde,T2.nomde
FROM tdepto T1 JOIN tdepto T2 ON (T1.depde=T2.numde)
WHERE T1.nomde LIKE '[OP]%';

/*11. Para los departamentos del centro 20 obtener el nombre del departamento y el nombre del director.*/


SELECT nomde,nomem
FROM tdepto A JOIN temple B ON (A.direc=B.numem)
WHERE A.numce = 20;



/*12. Obtener el nombre de los departamentos que no tienen empleados con menos de dos hijos. Realiza la consulta primero
con un predicado ALL y después con un predicado EXISTS.*/

--ALL 
SELECT nomde
FROM tdepto D
WHERE 2 <= ALL (
    SELECT numhi
    FROM temple E
    WHERE D.numde = E.numde);

--EXISTS
SELECT NOMDE
FROM tdepto D
WHERE NOT EXISTS (
    SELECT *
    FROM temple E
    WHERE E.numde = D.numde AND numhi < 2);




