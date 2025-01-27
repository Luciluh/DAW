--1. Obtener por orden alfabético los nombres de los empleados cuyos salarios superen la mitad del
--salario del empleado 180.
SELECT NOMEM
FROM dbo.temple
WHERE SALAR > (SELECT SALAR / 2 FROM dbo.temple WHERE NUMEM = 180)
ORDER BY NOMEM;



--2. Obtener por orden alfabético los nombres de los empleados cuyos salarios superen dos veces al
--mínimo salario de los empleados del departamento 121.
SELECT NOMEM
FROM dbo.temple
WHERE SALAR > (2 * (SELECT MIN(SALAR) FROM dbo.temple WHERE NUMDE = 121))
ORDER BY NOMEM;



--3. Obtener por orden alfabético los nombres y los salarios de los empleados cuyo salario es inferior
--a tres veces la comisión más baja existente distinta de NULL.
SELECT NOMEM, SALAR
FROM dbo.temple
WHERE SALAR < (3 * (SELECT MIN(COMIS) FROM dbo.temple WHERE COMIS IS NOT NULL))
ORDER BY NOMEM;



--4. Obtener, utilizando el predicado BETWEEN, por orden alfabético los números (identificador
--único), los nombres y los salarios de los empleados con hijos cuyo salario dividido por su número
--de hijos cumpla una, o ambas, de las dos condiciones siguientes:
-- -Que sea inferior a 1200 euros.
-- -Que sea superior al doble de su comisión.
SELECT NUMEM, NOMEM, SALAR
FROM dbo.temple
WHERE NUMHI > 0 
  AND (SALAR / NUMHI BETWEEN 0 AND 1200 OR SALAR / NUMHI > 2 * COALESCE(COMIS, 0))
ORDER BY NOMEM;



--5. Obtener por orden alfabético los nombres de los empleados cuyo primer apellido es Mora o
--empieza por Mora.
SELECT NOMEM
FROM dbo.temple
WHERE NOMEM LIKE 'Mora%'
ORDER BY NOMEM;



--6. Obtener por orden alfabético los nombres de los empleados cuyo primer apellido termina en EZ y
--su nombre de pila termina en O y tiene al menos tres letras.
SELECT NOMEM
FROM dbo.temple
WHERE NOMEM LIKE '%EZ' AND SUBSTRING(NOMEM, 1, 1) LIKE '[A-Z]' AND LEN(SUBSTRING(NOMEM, CHARINDEX(' ', NOMEM) + 1, LEN(NOMEM))) >= 3
ORDER BY NOMEM;



--7. Obtener, utilizando el predicado IN, por orden alfabético los nombres de los empleados del
--departamento 111 cuyo salario es igual a alguno de los salarios del departamento 112.

SELECT NOMEM
FROM dbo.temple
WHERE NUMDE = 111
  AND SALAR IN (SELECT SALAR FROM dbo.temple WHERE NUMDE = 112)
ORDER BY NOMEM;

--¿Cómo lo obtendrías con el predicado ANY?

SELECT NOMEM
FROM dbo.temple
WHERE NUMDE = 111
  AND SALAR = ANY (SELECT SALAR FROM dbo.temple WHERE NUMDE = 112)
ORDER BY NOMEM;



--8. A. Obtener por orden alfabético los nombres y comisiones de los empleados del
--departamento 110 si hay en él algún empleado que tenga comisión.
SELECT NOMEM, COMIS
FROM dbo.temple
WHERE NUMDE = 110 AND EXISTS (SELECT 1 FROM dbo.temple WHERE NUMDE = 110 AND COMIS IS NOT NULL)
ORDER BY NOMEM;



--9. Obtener por orden alfabético los nombres de los departamentos que tienen algún empleado
--sin comisión. Hacer el ejercicio de cuatro formas diferentes

SELECT NOMDE
FROM dbo.tdepto
WHERE EXISTS (
    SELECT 1
    FROM dbo.temple
    WHERE NUMDE = dbo.tdepto.NUMDE AND COMIS IS NULL
)
ORDER BY NOMDE;

--ANY
SELECT NOMDE
FROM dbo.tdepto
WHERE NUMDE = ANY (
    SELECT NUMDE
    FROM dbo.temple
    WHERE COMIS IS NULL
)
ORDER BY NOMDE;

--IN

SELECT NOMDE
FROM dbo.tdepto
WHERE NUMDE IN (
    SELECT NUMDE
    FROM dbo.temple
    WHERE COMIS IS NULL
)
ORDER BY NOMDE;

--JOIN

SELECT DISTINCT tdepto.NOMDE
FROM dbo.tdepto
JOIN dbo.temple ON tdepto.NUMDE = temple.NUMDE
WHERE temple.COMIS IS NULL
ORDER BY tdepto.NOMDE;



--10. Para los departamentos cuyo nombre empieza por las letras O o P, mostrar el nombre del
--departamento y el nombre del departamento del que depende.

SELECT t1.NOMDE AS Departamento, t2.NOMDE AS Departamento_Depende
FROM dbo.tdepto t1
LEFT JOIN dbo.tdepto t2 ON t1.DEPDE = t2.NUMDE
WHERE t1.NOMDE LIKE 'O%' OR t1.NOMDE LIKE 'P%'
ORDER BY t1.NOMDE;


--11. Para los departamentos del centro 20 obtener el nombre del departamento y el nombre del
--director.

SELECT t1.NOMDE AS Departamento, t2.NOMEM AS Director
FROM dbo.tdepto t1
JOIN dbo.temple t2 ON t1.NUMDE = t2.NUMDE
WHERE t1.NUMCE = 20
ORDER BY t1.NOMDE;


--12. Obtener el nombre de los departamentos que no tienen empleados con menos de dos hijos.
--Realiza la consulta primero con un predicado ALL y después con un predicado EXISTS.

SELECT NOMDE
FROM dbo.tdepto
WHERE NUMDE NOT IN (
    SELECT NUMDE
    FROM dbo.temple
    WHERE NUMHI < 2
)
ORDER BY NOMDE;


SELECT NOMDE
FROM dbo.tdepto t
WHERE NOT EXISTS (
    SELECT 1
    FROM dbo.temple
    WHERE NUMDE = t.NUMDE AND NUMHI < 2
)
ORDER BY NOMDE;
