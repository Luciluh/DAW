/*1. Obtener para cada película el título, el director y el nombre de los personajes (no protagonista)
que participan en la misma. Si una película aún no tiene personajes que participan
almacenados, el nombre de la película debe aparecer igualmente. Utiliza alias para el nombre de
los personajes y en el resultado que salga el valor NULL, debes poner "Aún no se han añadido
personajes.*/

SELECT titulo, director, ISNULL(C.NomPer, 'Aun no se han añadido personajes') AS 'Nombre personaje'
FROM pelicula A LEFT JOIN participa_pel B ON (A.CodPel=B.CodPel) LEFT JOIN personaje C ON (B.CodPer=C.CodPer)
WHERE C.CodPer<>A.CodPerProtagonista;

/*2. Obtener el nombre de cada personaje y en cuántas películas ha participado, pero solo deben
salir los personajes que hayan participado en más de dos películas. Utiliza alias para las
columnas. Ordena por nombre de personaje descendentemente.*/

SELECT nomper AS 'Nombre de personaje', COUNT(*) AS 'Número de peliculas'
FROM personaje A JOIN participa_pel B ON(a.CodPer=B.CodPer)
GROUP BY nomper
HAVING COUNT(*)>2
ORDER BY 1 DESC;

/*3. Obtener el nombre y el apellido del actor más joven almacenado en la base de datos a día de
hoy, junto con el nombre del personaje que interpreta, así como la edad que tiene el actor.*/

SELECT nomact AS 'Nombre', apeact AS 'Apellido', MIN(DATEDIFF(DAY,Edad,GETDATE())/365) AS 'Edad minima', nomper AS 'Nombre personaje', DATEDIFF(DAY,Edad,GETDATE())/365 AS 'Edad actor'
FROM personaje A JOIN actor B ON (A.codper = B.codact)
WHERE DATEDIFF(DAY,Edad,GETDATE())/365 = (SELECT MIN(DATEDIFF(DAY,Edad,GETDATE())/365)FROM actor)
GROUP BY nomact, apeact, nomper,edad;


/*4. Utilizando la sentencia adecuada del LMD de SQL, modifica la película que contiene la palabra
"Bosque" (solo conoces esta palabra del título de la película), para que el año de lanzamiento
sea igual al año de lanzamiento de la película más antigua almacenada en la base de datos. La
sentencia debe estar dentro de una transacción y cuando hayas comprobado que has realizado
el ejercicio correctamente, debes deshacerla.*/

BEGIN TRANSACTION

UPDATE pelicula
SET Lanzamiento = (SELECT MIN(Lanzamiento) FROM pelicula)
WHERE Titulo LIKE '%Bosque%';

ROLLBACK TRANSACTION

/*5. Borra las películas en las que aún no existe ningún personaje que participe. No tienes más
información que la que se te indica en el enunciado. La sentencia debe estar dentro de una
transacción y cuando hayas comprobado que has realizado el ejercicio correctamente, debes
deshacerla. Realizar el ejercicio de tres formas diferentes: utilizando un predicado EXISTS, un
predicado cuantificado y un predicado IN.*/

--SOLUCIÓN 1
BEGIN TRANSACTION

DELETE FROM pelicula
WHERE NOT EXISTS (SELECT * 
				  FROM Participa_Pel Par 
				  WHERE Par.CodPel=pelicula.CodPel)

ROLLBACK TRANSACTION

--SOLUCIÓN 2
BEGIN TRANSACTION

DELETE FROM pelicula
WHERE CodPel <> ALL (SELECT CodPel 
				     FROM Participa_Pel)
ROLLBACK TRANSACTION

--SOLUCIÓN 3
BEGIN TRANSACTION

DELETE FROM pelicula
WHERE CodPel NOT IN (SELECT DISTINCT CodPel FROM participa_pel);

ROLLBACK TRANSACTION

/*6. Para todos los actores mayores de edad a día de hoy, obtener el nombre y el apellido, la fecha de
nacimiento en formato español, la correspondiente edad a día de hoy, junto con el nombre del
personaje que interpreta. Utiliza alias para las columnas. Ordena por nombre de personaje
descendentemente.*/

SELECT NomAct AS 'Nombre', ApeAct AS 'Apellido',
       FORMAT(Edad,'d') AS 'Fecha Nacimiento',
	   DATEDIFF(DAY,Edad,GETDATE())/365 AS 'Edad',
	   NomPer AS 'Personaje'
FROM actor a JOIN personaje p ON (a.CodAct=p.CodAct)
WHERE DATEDIFF(DAY,EDAD,GETDATE())/365>=18
ORDER BY 5 DESC;

/*7. Obtener el nombre y el apellido de cada actor almacenado en la base de datos, junto con el
nombre del personaje que interpreta y el título de las películas de las que es protagonista, si no
es protagonista aún de ninguna película, en lugar de salir el valor NULL, debe salir el mensaje
"No es protagonista”. Utiliza alias para el título de la película que protagonizan.*/

SELECT NomAct, ApeAct, NomPer,ISNULL(Titulo,'No es protagonista')
       AS 'T�tulo pel�cula protagonista'
FROM (actor a JOIN personaje p ON (a.CodAct=p.CodAct))
     LEFT JOIN pelicula pe ON (pe.CodPerProtagonista=p.CodPer);

/*8. Por cada película mostrar el título y la edad media de los actores que interpretan los personajes
que participan en la misma (no tener en cuenta al personaje protagonista). La edad media debe
salir con uno o dos decimales. Ordenar ascendentemente por nombre de película. Utiliza alias
para la columna edad media.*/

SELECT Titulo, 
       ROUND(AVG (CONVERT (FLOAT,DATEDIFF(DAY,EDAD,GETDATE())/365)),2,1) -- REDONDEO: ROUND(expresión, número_de_decimales [, modo])
	   AS 'Edad media de los personajes'
FROM ((actor a JOIN personaje p ON (a.CodAct=p.CodAct))
     JOIN participa_pel pp ON (pp.CodPer=p.CodPer))
	 JOIN pelicula pe ON (pe.CodPel=pp.CodPel)
GROUP BY Titulo
ORDER BY Titulo;

/*9. Obtener con una sola sentencia el título de todas las películas, el año de lanzamiento y nombre
del personaje protagonista, para las películas con un año de lanzamiento anterior a 2020. Y para
las películas de 2020 o posteriores, obtener el título de la película, el año de lanzamiento y el
nombre del director. Ordenar ascendentemente por año de lanzamiento. Utiliza como alias de
columna para el nombre del personaje protagonista o del director el texto: 'Personaje o Director'.*/

--UNION
SELECT Titulo, Lanzamiento, NomPer AS 'Personaje o Director'
FROM personaje p JOIN pelicula pe ON (pe.CodPerProtagonista=p.CodPer)
WHERE Lanzamiento < 2020
UNION
SELECT Titulo,Lanzamiento,Director
FROM pelicula 
WHERE Lanzamiento >= 2020
ORDER BY 2;

--CASE
SELECT Titulo, Lanzamiento, 
       CASE WHEN Lanzamiento < 2020 THEN NomPer
	   ELSE Director 
	   END  AS 'Personaje o Director'
FROM personaje p JOIN pelicula pe ON (pe.CodPerProtagonista=p.CodPer)
ORDER BY 2;

--IIF
SELECT Titulo, Lanzamiento,IIF( Lanzamiento < 2020, NomPer,Director) AS 'Personaje o Director'
FROM personaje p JOIN pelicula pe ON (pe.CodPerProtagonista=p.CodPer)
ORDER BY 2;

/*10. Utilizando la sentencia adecuada del LMD de SQL, borra los personajes que cumplen las
siguientes tres condiciones: que no sean protagonistas, que no participan en ninguna película y
su nombre empiece por la letra E. La sentencia debe estar dentro de una transacción y cuando
hayas comprobado que has realizado el ejercicio correctamente, debes deshacerla.*/

BEGIN TRANSACTION

DELETE FROM personaje
WHERE (CodPer NOT IN (SELECT CodPerProtagonista FROM pelicula))
       AND (CodPer NOT IN (SELECT CodPer FROM participa_pel))
	   AND (NomPer LIKE 'E%');

SELECT * FROM personaje;

ROLLBACK TRANSACTION

/*11. Ha habido un error cuando se ha almacenado en la base de datos la fecha de nacimiento de
Isabel Sánchez. Precisamente, Isabel Sánchez nació el mismo día que Javier Díaz. Utilizando la
sentencia adecuada del LMD de SQL, modifica la fecha de nacimiento de Isabel Sánchez para
que sea la misma que la de Javier Díaz. Solo conoces los nombres de los actores. La sentencia
debe estar dentro de una transacción y cuando hayas comprobado que has realizado el
ejercicio correctamente, debes deshacerla.*/

BEGIN TRANSACTION

UPDATE actor
SET Edad= (SELECT Edad 
           FROM actor 
		   WHERE NomAct LIKE 'Javier' AND ApeAct LIKE 'D�az')
WHERE NomAct LIKE 'Isabel' AND ApeAct LIKE 'S�nchez';

SELECT * FROM actor;

ROLLBACK TRANSACTION