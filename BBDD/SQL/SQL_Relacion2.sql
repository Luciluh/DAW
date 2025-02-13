/*1. Hallar el nombre de los empleados que no tienen comisión, clasificados de manera que aparezca 
primero aquellos nombres que son más cortos.*/

SELECT nomem 
FROM temple 
WHERE comis IS NULL
ORDER BY LEN(nomem);

/*2. Hallar, por orden alfabético, los nombres de los empleados suprimiendo las dos últimas letras. 
Mirar en la ayuda el funcionamiento de las funciones escalares de manejo de cadena: substring y len.*/

SELECT SUBSTRING(nomem,1,LEN(nomem)-2) AS 'NOMBRE'
FROM temple
ORDER BY 1;

/*3. Hallar cuántos departamentos hay y el presupuesto anual medio de ellos.*/

SELECT COUNT(numde) AS 'Numero departamentos', AVG(presu) AS 'Presupuesto anual medio'
FROM tdepto;

/*4. Hallar la masa salarial anual (salario más comisión) de la empresa (se suponen 14 pagas anuales).*/

SELECT SUM( (salar*14) + ISNULL((comis*14),0)) AS 'Masa salarial anual'
FROM temple;

/*5.Hallar la masa salarial anual (salario más comisión) de cada empleado (se suponen 14 pagas anuales).*/

SELECT nomem, salar, comis, (salar + ISNULL(comis,0))*14 AS 'Masa salarial anual'
FROM temple;

/*6. Hallar cuántos empleados han ingresado en el año actual. Utiliza la función year.*/

SELECT COUNT(*) AS 'Empleados en el año actual'
FROM temple
WHERE YEAR(fecin)=YEAR(GETDATE());

/*7. Hallar la diferencia entre el salario más alto y el salario más bajo.*/

SELECT MAX(salar) - MIN(salar) AS 'Diferenciad de salarios'
FROM temple;
