SELECT*
FROM tcentr;

SELECT*
FROM tdepto;

SELECT *
FROM temple;

--1. Hallar por orden alfab�tico los nombres de los departamentos cuyo director est� en funciones.

SELECT numde, nomde 
FROM tdepto
WHERE nomde BETWEEN 'A' AND 'Z';

--2. Obtener un listín telefónico de los empleados del departamento 121 incluyendo nombre del empleado,
--número del empleado y extensión telefónica. Por orden alfabético descendente.
SELECT extel, numem, nomem
FROM temple
WHERE numde = 121
ORDER BY NOMEM ASC;

--3. Obtener por orden creciente una relación de todos los números de extensiones telefónicas de los
--empleados (elimina las repeticiones).
SELECT DISTINCT extel, nomem
FROM temple
ORDER BY extel DESC;

/*4. Hallar el nombre, salario y la comisión de los empleados con más de un hijo, clasificados por comisión, y
dentro de la comisión por orden alfabético. El listado debe incluir también los empleados con más de un hijo
aunque no tengan comisión. Utilizar la función ISNULL para que cuando la comisión NULL muestre un 0.
Utiliza alias para los nombres de las columnas.*/

SELECT nomem AS 'Nombre', salar AS 'Salario', ISNULL (comis,0) AS 'Comision' 
FROM temple 
WHERE numhi>1
ORDER BY 3,1 ASC;

--5. Obtener salario y nombre de los empleados con dos hijos por orden decreciente de salario y por orden
--alfabético dentro del salario.

SELECT salar, nomem
FROM temple
WHERE numhi=2
ORDER BY salar DESC,2 ASC;

--6. Obtener el nombre de los empleados cuya comisión es superior o igual al 50% de su salario, por orden
--alfabético.

SELECT nomem
FROM temple
WHERE comis >= salar*0.5
ORDER BY 1;

/*7. En una campaña de ayuda familiar se ha decidido dar a los empleados una paga extra de 30 euros por
hijo, a partir del tercero inclusive. Obtener por orden alfabético para estos empleados: nombre y salario total
que van a cobrar incluyendo esta paga extra.*/

SELECT nomem, salar + 30*(numhi -2 ) AS 'Salario total'
FROM temple
WHERE numhi >2
ORDER BY 1 

/*8. Igual que el ejercicio anterior, pero mostrar también el nombre y el salario que ganan el resto de los
empleados (los que tienen 0, 1 o 2 hijos). Resuelve el ejercicio de dos formas diferentes: con el operador
UNION y con una expresión CASE. Consulta en el Manual SQL w3schools “SQL Union” y “SQL Case”.*/

SELECT nomem, salar + 30*(numhi -2 ) AS 'Salario total'
FROM temple
WHERE numhi >2
UNION
SELECT nomem, salar AS 'Salario total'
FROM temple
WHERE numhi <=2
ORDER BY 1 

-- Con CASE 

SELECT nomem, 
       salar + CASE 
                  WHEN numhi > 2 THEN 30 * (numhi - 2)  
                  ELSE 0 
               END AS 'Salario total'
FROM temple
ORDER BY 1;

/*9. Hallar por orden alfabético los nombres de los empleados, tales que si se les da una gratificación de 60
euros por hijo, esta gratificación no supera a la décima parte de su salario.*/ 

SELECT nomem
FROM temple 
WHERE 60*numhi<=salar/10
ORDER BY 1;

/*10. Obtener el nombre de cada centro, junto con el nombre de los departamentos que tiene. Ordena
ascendentemente por nombre de centro y a igual nombre de centro ordena por nombre de departamento.*/

SELECT nomce, nomde
FROM tcentr C JOIN tdepto D ON (C.numce=D.numce)
ORDER BY nomce, nomde;/*11. Obtener ordenadamente el nombre de cada departamento junto con el nombre de cada empleado que tiene.*/SELECT nomde , nomemFROM tdepto A JOIN temple B ON (A.numde=B.numde)ORDER BY 1,2;/*12. Obtener ordenadamente el nombre de cada centro, junto con el nombre de los departamentos que tiene y el nombre 
de los empleados que pertenecen a cada departamento.*/

SELECT nomce, nomde, nomem
FROM tcentr A JOIN tdepto B ON(A.numce=B.numce) 
JOIN temple C ON (B.numde=C.numde)
ORDER BY 1,2,3;

/*13. Obtener para los departamentos con un presupuesto superior a 5000 euros, su nombre junto con el nombre del centro
donde está ubicado. Hacer el ejercicio de dos formas: utilizando un producto cartesiano y con la cláusula JOIN. */SELECT nomde, nomce, presuFROM tdepto A JOIN tcentr B ON (B.numce=A.numce)WHERE A.presu>5000ORDER BY 1,2;/*14. Para cada empleado obtener el nombre, salario, número de hijos y el nombre del departamento en el que está.*/SELECT nomem, salar, numhi, nomdeFROM temple A JOIN tdepto B ON (A.numde=B.numde)ORDER BY 1,2;/*15. Para los empleados del departamento de Nóminas obtener el nombre, salario y número de hijos. Ordena ascendentemente 
por nombre de empleado y utiliza alias para las columnas. (nominas es numde = 110) */SELECT * FROM tdeptoSELECT nomem AS 'Nombre', salar AS 'Salario', numhi AS 'nº hijos'FROM temple A JOIN tdepto B ON (A.numde=B.numde)WHERE B.numde=110ORDER BY 1;/*16. Obtener el nombre de los empleados que están en el centro Sede Central (numce=10).*/SELECT nomemFROM tcentr A JOIN tdepto B ON (a.numce = b.numce) JOIN temple C ON (b.numde = c.numde)WHERE A.NUMCE=10ORDER BY 1;