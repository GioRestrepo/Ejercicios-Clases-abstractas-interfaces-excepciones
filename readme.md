### Ejercicio clases abstractas, interfaces y excepciones

## 1.
 En el primer punto se optó por manejar una excepción propia, con la que se busca manejar la entrada de datos que no estén dentro de los rangos permitidos. Se eligió lanzar la excepción para interrumpir el flujo de la aplicación en caso de que los rangos no sean los adecuados.

 ## 2.
En este punto se decidió manejar con una excepción en tiempo de ejecución un posible retorno vacío a la hora de consultar las materias inscritas del estudiante.
## 3
En todos los casos se decidió optar por el uso de clases abstractas para permitir la herencia de atributos no constantes a las clases hijas. El uso de clases abstractas también permite heredar la firma del método a través de la cadena de herencia. 
 Para garantizar la escalabilidad, cuando se desee agregar un nuevo formato al reproductor, este deberá extender de la clase abstracta audio o de la clase abstracta video según sea el caso.   
