/*1. Para cada extensión telefónica, hallar cuántos empleados la usan y salario medio de estos.*/

SELECT extel, COUNT(*), AVG(salar)
FROM temple
GROUP BY extel;

/*2. Agrupando por departamento y número de hijos, hallar cuántos empleados hay en cada grupo.*/

SELECT numde, numhi, COUNT(*) AS 'Cantidad empleados'
FROM temple
GROUP BY numde, numhi
ORDER BY 1,2;


/*3.Hallar por departamentos la edad en años cumplidos del empleado más mayor, así como la edad
media del mismo (el empleado debe tener comisión). Ordenar el resultado por edades.*/

SELECT numde,
MAX(DATEDIFF(DAY,FECNA,GETDATE())/365), --Calcula la edad del empleado más mayor en años cumplidos para cada departamento.
ROUND( AVG( CONVERT(FLOAT,
DATEDIFF( DAY,FECNA,GETDATE() )/365) ),2,1) -- Calcula la edad media de los empleados con comisión en cada departamento, redondeada a 2 decimales.
FROM temple
WHERE comis IS NOT NULL
GROUP BY numde
ORDER BY 2;


/*4. Para los departamentos cuyo salario medio supera al de la empresa, hallar cuántas extensiones telefónicas tienen. 
Se debe mostrar el número de departamento (numde) y el número de
extensiones telefónicas distintas que tiene cada uno de ellos*/

SELECT numde , COUNT(DISTINCT extel)AS 'n1 ext tlf', AVG(salar)AS 'salario medio'
FROM temple
GROUP BY numde
HAVING AVG(salar)> (SELECT AVG(salar) FROM temple);


/*5. Hallar el máximo valor de la suma de los salarios de los departamentos.
Queremos obtener el número de departamento (numde) y la suma de sus salarios,
pero del departamento cuya suma de salarios es la mayor de todas.*/

SELECT numde, SUM(salar)
FROM temple
GROUP BY numde
HAVING SUM(salar) >= ALL (SELECT SUM(salar)
FROM temple
GROUP BY numde);


/* 6. Para cada departamento con presupuesto inferior a 10.000 euros obtener el nombre, el
nombre del centro donde está ubicado y el máximo salario de sus empleados, si éste excede de 1500
euros. Clasificar alfabéticamente por nombre de departamento. Hacer el ejercicio de dos maneras:
con producto cartesiano y con JOIN.*/

--JOIN
SELECT nomde, nomce, MAX(salar)
FROM tcentr A JOIN tdepto B ON (A.numce=B.numce) JOIN temple C ON (B.numde=C.numde)
WHERE B.presu < 10000
GROUP BY nomde,nomce
HAVING MAX (salar)>1500
ORDER BY 1;

--PRODUCTO CARTESIANO

SELECT nomde, nomce, MAX (salar)
FROM tcentr c,tdepto d, temple e
WHERE c.numce=d.numce AND d.numde=e.numde AND presu < 10000
GROUP BY nomde,nomce
HAVING MAX(salar)>1500
ORDER BY 1;

/*7. Hallar por orden alfabético los nombres de los departamentos que dependen de los que tienen
un presupuesto inferior a 10000 euros. Mostrar el nombre del departamento y el nombre del
departamento del que dependen. Realizar la consulta de cuatro formas distintas:
con predicado IN, con predicado ANY, con producto cartesiano y con JOIN.*/

-- JOIN (reflexiva)

SELECT A.nomde,B.nomde as 'dep que depende'
FROM tdepto A JOIN tdepto B ON (A.depde=B.numde)
WHERE A.presu<10000
ORDER BY 1;

-- IN

SELECT nomde, depde
FROM tdepto
WHERE depde IN (SELECT numde
FROM tdepto
WHERE presu < 10000)
ORDER BY 1;

-- ANY

SELECT nomde, depde
FROM tdepto
WHERE depde = ANY (SELECT numde
FROM tdepto
WHERE presu < 10000)
ORDER BY 1;

-- PRODUCTO CARTESIANO
SELECT A.nomde, B.nomde
FROM tdepto A, tdepto B
WHERE A.depde = B.numde AND B.presu < 10000
ORDER BY 1;

/* 8. Obtener por orden alfabético los nombres de los departamentos cuyo presupuesto es inferior al
10 % de la suma de los salarios anuales de sus empleados (sin tener en cuenta la comisión y son
14 pagas).Hacer el ejercicio con predicado básico y con agrupamiento.*/

SELECT DISTINCT nomde 
FROM tdepto A JOIN temple B ON (A.numde=B.numde)
WHERE presu < (SELECT SUM((salar*14) *0.10) FROM temple)
ORDER BY 1;

--9. Ejecutar las siguientes sentencias:
--Añadir los siguientes centros:
INSERT INTO tcentr (numce,nomce,señas)
VALUES (30,'PRODUCCIÓN','C. DEL ARTE, 13, MADRID'),
(40,'INNOVACIÓN','AVDA. ANDALUCÍA, 20, MÁLAGA');
--Añadir los siguientes departamentos:
INSERT INTO tdepto(numde,numce,direc,tidir,presu,depde,nomde)
VALUES (122,NULL,NULL,'F',10000,120,'MARKETING Y PUBLICIDAD'),
(123,20, NULL,'F',10000,120,'COMPRAS Y LOGÍSTICA');
--Añadir los siguientes empleados:
INSERT INTO temple(numem,numde,extel,fecna,fecin,salar,comis,numhi,nomem)
VALUES (381,122, 350,'12/03/2000','8/1/2025',1800,100,0,'ROMERO, MÍRIAM'),
(382,122, 350,'13/04/1998','8/1/2025',1800,100,1,'SÁNCHEZ, LUCÍA'),
(383,NULL,350,'14/05/1997','8/1/2025',1800,100,1,'LÓPEZ, LAURA');
--Asignar el empleado 381 como director del departamento 122.
UPDATE tdepto
SET direc =381
WHERE numde=122;

SELECT* FROM TCENTR;
SELECT* FROM TDEPTO;
SELECT* FROM TEMPLE;

/*10. Para los centros de Madrid, obtener el nombre de cada centro junto con el nombre de los
departamentos que tienen. Si un centro aún no tiene departamentos que pertenezcan al mismo, el nombre
del centro debe salir igualmente y en el nombre del departamento debe aparecer "Sin departamento
por el momento".*/

/*SELECT nomce, ISNULL(nomde,'Sin departamento por el momento')
FROM tcentr A JOIN tdepto B ON (A.numce = B.numce)
WHERE señas LIKE '%MADRID';

RESULTADO INCORRECTO*/

SELECT nomce, ISNULL(nomde,'Sin departamento por el momento')
FROM tcentr A LEFT JOIN tdepto B ON (A.numce = B.numce)
WHERE señas LIKE '%MADRID';

/*11. Para los departamentos con director obtener el nombre del centro en el que se encuentra y la
dirección. Si un departamento aún no tiene asignado centro, el nombre del departamento debe
salir igualmente y en el nombre del centro debe aparecer "Sin ubicar" y en la dirección
"Desconocida."*/

SELECT nomde,
ISNULL(nomce,'Sin ubicar'),
ISNULL(direc,'Desconocida')
FROM tcentr c RIGHT JOIN tdepto d ON
(c.numce=d.numce)
WHERE direc IS NOT NULL;
/*Se usa un RIGHT JOIN, lo que significa que se mostrarán todos los registros de tdepto (departamentos) 
aunque no tengan un centro asociado en tcentr.*/

/*12. Obtener para todos los departamentos su nombre, junto con el nombre y fecha de ingreso en
la empresa en formato español de sus empleados. Si un departamento aún no tiene empleados, el nombre
del departamento debe salir igualmente, en nombre de empleado debe aparecer "Sin empleados" y en
fecha "Sin fecha".*/

SELECT nomde AS 'Departamento',
ISNULL(nomem,'Sin empleados') AS
'Empleado',
ISNULL(FORMAT(fecin,'d'),'Sin fecha') AS --Formato de fecha español 
'Fecha ingreso'
FROM tdepto d LEFT JOIN temple e ON
(d.numde=e.numde);

/*13. Para los empleados que han ingresado en la empresa en el año actual, obtener su nombre y
salario, así como el nombre y el presupuesto del departamento al que pertenece. Si al empleado aún
no se le ha asignado departamento, el nombre del empleado y su salario deben salir igualmente y en
nombre de departamento y en presupuesto debes poner el mensaje "Sin asignar". Debes poner alias
para todas las columnas.*/

SELECT nomem AS 'Empleado',
salar AS 'Salario',
ISNULL(nomde,'Sin asignar') AS
'Departamento',
ISNULL(CONVERT(VARCHAR(12),presu),'Sin
asignar') AS 'Presupuesto'
FROM tdepto d RIGHT JOIN temple e ON
(d.numde=e.numde)
WHERE YEAR(GETDATE())=YEAR(FECIN);

/*14.Para los departamentos de "Nóminas", "Organización", "Personal" y "Compras y
Logística", obtener el número de departamento (identificador único), así como el nombre y
extensión telefónica de los directores. Si alguno de estos departamentos no tiene aún asignado un
director, el número del departamento debe salir igualmente y en nombre del director y extensión
telefónica debes poner el mensaje. Debes poner alias para todas las columnas.*/

SELECT d.numde AS 'Número de departamento',
ISNULL(nomem,'Pendiente de asignar') AS
'Director',
ISNULL(CONVERT(VARCHAR(10),extel),'Sin 
datos') AS 'Teléfono' -- No podemos comparar un INT con un VARCHAR y como extel es INT lo convertimos para poder usar la funcion ISNULL
FROM tdepto d LEFT JOIN temple e ON
(d.direc=e.numem)
WHERE nomde IN ('NOMINAS', 'ORGANIZACION', --Con el IN filtramos los departamentos para mostrar solo los que tienen los nombres
'PERSONAL', 'COMPRAS Y LOGÍSTICA');


/*15. Para cada departamento obtener el nombre y el nombre del departamento del que depende, si
existe algún departamento que no depende de ningún otro, el nombre del departamento debe salir
igualmente y en la columna depde debe aparecer "No depende de ningún departamento."*/

SELECT d1.nomde,
ISNULL(d2.nomde,'No depende de ningún
departamento')
FROM tdepto d1 LEFT JOIN tdepto d2 ON
(d1.depde=d2.numde);

/*16. Obtener para los empleados con hijos y con comisión,su nombre, el nombre del departamento
para el que trabajan y el nombre del centro en el que se encuentra su departamento. Si el empleado
no tiene departamento, este debe salir igualmente, y si el departamento en el que está el empleado no
tiene centro también debe salir.*/

SELECT nomem, nomde, nomce
FROM (tdepto d RIGHT JOIN temple e ON -- Se mostrarán todos los empleados (temple e) aunque no tengan departamento asignado (tdepto d)
(e.numde=d.numde)) LEFT JOIN --Se mostrarán todos los departamentos, aunque no tengan centro asociado.
tcentr c ON (c.numce=d.numce)
WHERE numhi>0 AND comis IS NOT NULL;

/*17. Obtener los nombres de todos los centros junto con los nombres de los departamentos que
tiene. Si un centro aún no tiene departamentos, este debe salir igualmente. Además, debes obtener
el nombre de todos los departamentos aunque no tengan asignado centro. En los centros sin
departamento debes poner en la columna nombre de departamento el mensaje "Sin departamento" y en
los departamentos sin centros debes poner en la columna centro "Sin centro". Debes poner alias
para todas las columnas.Ordena por el nombre del centro ascendentemente y a igual nombre del
centro por nombre de departamento descendentemente.*/

SELECT ISNULL(nomce,'Sin centro') AS 'Centro',
ISNULL(nomde,'Sin departamento') AS
'Departamento'
FROM tcentr c FULL JOIN tdepto d ON
(c.numce=d.numce)
ORDER BY 1,2 DESC;

/*18. Obtener por cada centro, cuántos empleados hay que trabajen en departamentos que están
ubicados en los mismos. Debe salir el nombre del centro y la frase "X empleados", donde X es el
número de empleados que trabajan en departamentos ubicados en cada centro. Debes poner alias para
todas las columnas.*/

SELECT nomce AS 'Centro',
CONCAT(CONVERT(VARCHAR(6),COUNT(d.numde)), -- CONCAT(expresión1, expresión2, ...) concatena (une) valores en una sola cadena de texto.
' empleados') AS 'Numero de empleados'
FROM (tcentr c LEFT JOIN tdepto d ON
(c.numce=d.numce)) LEFT JOIN
temple e ON (d.numde=e.numde)
GROUP BY nomce;