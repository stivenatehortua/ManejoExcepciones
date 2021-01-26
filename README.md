# Manejo de Excepciones

## OBJETIVO

El objetivo de este taller es fortalecer los conceptos sobre el manejo de las excepciones que se generan en Java, mediante el desarrollo de ejercicios que permitan identificar algunas de las excepciones existentes, su captura y correspondiente manejo incluyendo el relanzamiento de la excepci�n y la generaci�n de excepciones personalizadas.

## REQUERIMIENTOS:
-	IDE Java: IntelliJ IDEA, Eclipse,Spring, Jcreator, Netbeans u otro.
-	Versi�n Java: 8 o superior.
-	Cuenta creada GitHub, GitLab u otro.

# Ejercicios 
Todas las actividades se corren desde el main de la clase  ExcepcionesApplication 
Solo des comente el caso que vaya a ejecutar para realizar el ejercicio.


1.	
	a.	En el m�todo caso1 de la clase ExcepcionesApplication   cree una instancia de la clase ProcesarDatos ;  haga uso del m�todo division enviando los valores ("48", "0") para que se genere una excepci�n. En el m�todo divisi�n capture e identifique la excepci�n especifica que se genera (no la excepci�n general de java Exception) e imprima en consola el StackTrace, Cause, Message del errror.
	
	b.	Repita el procedimiento, pero envi� los valores ("15.8", "30") y agregue la nueva excepci�n que se genera.

2.	En el m�todo caso2 de la clase ExcepcionesApplication   cree una instancia de la clase ProcesarDatos ; haga uso del m�todo arreglo y envi� un array de string de 3 posiciones  para que se genere una excepci�n. En el m�todo arreglo capture e identifique la excepci�n especifica que se genera (no la excepci�n general de java Exception) e imprima en consola el StackTrace, Cause, Message del error.

3.	En el m�todo caso3 de la clase ExcepcionesApplication   cree una instancia de la clase ProcesarDatos  y haga uso del  m�todo fecha de la clase ProcesarDatos ; envi� una fecha con el formato �yyyy/mm/dd� para que se genere una excepci�n. Re-lance la excepci�n generada y capt�rela en el m�todo caso3  e imprima en consola el StackTrace, Cause, Message del error.

4.	
	a.	En el paquete com.capacitacion.excepciones.personalizadas, cree una clase para el manejo personalizado de excepciones,esta clase debe heredar de la clase Exception de Java y tener dos atributos. String causa y String tipoFalla. 

	b.	En la clase ProcesarDatos cree un m�todo que lea el archivo data.txt que est� en el paquete com.capacitacion.excepciones.datos, el m�todo debe recibir como par�metro la ruta del archivo. Capture y relance  la excepci�n que se genera en caso de no encontrar el archivo en la ruta indicada, haciendo uso la clase creada en el literal anterior . haga un llamado de este m�todo desde el caso4 indicando un causa y tipo de falla de la clase ExcepcionesApplication  e imprima en consola  la casusa y el tipo de falla.

5.	En la clase ProcesarDatos cree un m�todo que lea el archivo data.txt que est� en el paquete com.capacitacion.excepciones.datos, de forma iterativa 	     obtenga el nombre y la profesi�n de cada uno de los registro y escr�balos en el archivo de nombre data2.txt. agregue las excepciones que se requer�an y garantice que los objetos que se usaron para la lectura y escritura de los archivos sean correctamente cerrados (close) en el catch.





