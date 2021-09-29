## Libro  
Prisma mentoreado  
version jdk 8  
IDE NetBeans 8.2  
Crear una clase Libro que contenga los siguientes atributos:  
– ISBN   
– Titulo  
– Autor  
– Número de páginas  
  
Crear el método para mostrar la información relativa al libro con el siguiente formato:  
“El libro con ISBN creado por el autor tiene páginas”.  
En el fichero main, crear 5 objetos Libro (los valores que se quieran), validando que el campo ISBN de valor numerico y solo permita 10 digitos  
listarlos sin que pueda haber dos libros con el mismo ISBN y mostrarlos por pantalla.  
Por último, indicar cuál de los 2 tiene más páginas  


### nuevas funcionalidades

* agregar el genero y el tipo de subgenero al libro.
 Genero : tipoGenero -> : Dramatico , lirico ,epico y didactico.    y subgenero
 Subgenero:

libros 1 ..n ----- 1 Genero

  Genero
  tipo genero
  subgenero
agregar libro (........., Genero , subgenero)

Libro ("titulo","autor", New Genero(TipoGenero.Dramatico, Subgenero.subgenero));

* agregar el atributo estado para saber si un libro esta habilitado   sus respetivos get y set.

 booleano estado.

* modificar el metodo mostrar para se solo muestre los libros  habilitados.
* crear el metodo borrar  libro que me permita borra un libro por su isbn.
  lucho

* agregar el metodo buscar libro que me permita buscar un libro por isbn y que me muestre los datos del libro  si se encuentra o  el mensaje , el libro  buscado no se encuentra.

** agregar el uml  para ver en la portada del github si es posible.  readme.md

*sofi