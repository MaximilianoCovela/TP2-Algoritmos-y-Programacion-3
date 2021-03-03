ue a[![Build Status](https://travis-ci.org/fiuba/algo3_proyecto_base_tp2.svg?branch=master)](https://travis-ci.org/fiuba/algo3_proyecto_base_tp2) [![codecov](https://codecov.io/gh/fiuba/algo3_proyecto_base_tp2/branch/master/graph/badge.svg)](https://codecov.io/gh/fiuba/algo3_proyecto_base_tp2)



# TP2 Algoritmos 3: AlgoBlocks

Trabajo Práctico número 2 de la materia Algoritmos y Programación III de FIUBA


![Imagen_De_Presentación](https://i.imgur.com/UPhL64r.png)

## Grupo 4

* **Chacón Irina Ailén** - 104416 - [integrante1](https://github.com/iruchita)
* **Dziuma Nicolás** - 100305  - [integrante2](https://github.com/nicolasss1993)
* **Ré Gabriel** - 105095 - [integrante3](https://github.com/Gabriel-Re)
* **Covela Maximiliano Gastón** - 102547 - [integrante4](https://github.com/MaximilianoCovela)

Corrector: Edson Justo

## Introducción

La aplicación consiste en un juego que utiliza bloques visuales.
Esta permitirá a un personaje moverse por la pantalla mientras dibuja con un lápiz, logrando realizar distintos diseños.
La aplicación se compondrá de 3 secciones:
- Tablero: el tablero comenzará siendo un espacio en blanco en el cual se colocará al personaje en su posición inicial.
- Lista de bloques: la lista de bloques mostrará los bloques que el jugador tendrá disponibles para utilizar.
- Algoritmo: el algoritmo comenzará en blanco, y el jugador podrá ir colocando bloques en esta sección, que luego se ejecutarán en forma secuencial.

Una vez armado el algoritmo, el jugador podrá elegir “ejecutar” el mismo.
En ese caso, cada bloque se irá procesando en forma secuencial, haciendo que el personaje realice la acción correspondiente.


## Supuestos Entrega 4

Se trabajó con los siguientes supuestos:

- La vista del personaje en una matriz de 9x9 empieza en el centro, es decir en la
posición (4,4). El personaje no puede moverse más allá de los límites
  de la matriz.
- Los bloques complejos Repetirx2, Repetirx3 e Invertir, son creados
como VBox dentro de la VBox a la que se le asignan los botones con
  los bloques simples seleccionados (todos los demás).
  - Estas VBox tienen la particularidad de que no se pueden mover
 de lugar, ni borrar.
  - Si se desea borrar una VBOX con bloques dentro, se debe proceder
 a borrar el bloque simple anterior si es que existía uno, o a presionar
    el botn Reiniciar, lo que vaciará la VBox con los bloques
    seleccionados.
  - Para poner la VBOX en otra posición se recomienda Reiniciar
   e ingresar la secuencia de bloques deseada y luego el bloque 
   complejo en el lugar indicado.
- Se pueden ingresar la cantidad de bloques complejos, combinándolos
como sea necesario.
- Cuando se abre un Repetirx2 luego de terminar de ingresar todos 
los bloques (simples o complejos) que se desee a su interior, se debe
seleccionar el botón que dice Parar (Repetirx2) para poder seguir
  agregando bloques a continuación o poder Iniciar la ejecución
  del programa al presionar el botón Ejecutar.
  
## Excepciones

- BloqueNoEncontradoException: Se genera esta excepción en 
el modelo cuando se busca un bloque en el tablero que no
  se encuentra cargado al array de Bloques. 
  Esta excepción se utiliza para realizar pruebas
  negativas, en las que se quiere quitar un bloque
  que no está cargado.
  

## Detalles de implementación

- Se utilizó el patrón Strategy para conectar los controladores
con la vista, en cuanto a la interacción del usuario con la 
creación de bloques en el sector de bloques a ejecutar.  
  

- Se utilizó también el patrón Observer para conectar la vista con el 
modelo, donde hubo varios observadores, los botones y la clase
VistaPersonaje que contiene un VistaSectorDibujo.  
  
  
   El patrón Observer se aplicó en la clase SectorDibujo, donde se tiene un
  arreglo de Dibujos que poseen la posición inicial del personaje y 
   la final luego de haberse ejecutado 1 movimiento en particular, así como 
  si el personaje tenía el lápiz con estado arriba u abajo.  

  Si el lápiz está arriba o abajo se crea un objeto Linea o Vacío, que
con un método devuelven un booleano que en la vista se interpreta 
  para dibujar césped en las posiciones donde se deba marcar
  que el lápiz estaba abajo, o no.  

  También para los botones, se creó 
  un estado que informa gracias al Update del patrón Observer
  cuando comienza y cuando termina
  la secuencia de dibujos enviada, esto se utiliza para deshabilitar y habilitar
  los botones Iniciar, MoverArriba, MoverAbajo, Reiniciar y Eliminar.
  
- En el modelo a la hora de tener movimientos que tengan 
dentro otros movimientos, (movimientos complejos) se utilizó 
  el patrón Composite, para poder tratar a cada movimiento 
  con el método aplicar, que lo que hace es delegar en cada uno
  la acción que deba realizarse (en movimiento lápiz arriba, 
  subir el lápiz, en movimiento derecha, hacer que el personaje
  del modelo se mueva un casillero hacia la derecha, en los movimientos
  complejos, llamar el aplicarMovimiento para cada movimiento individual del array 
  que tienen guardad, etc). Todo esto
  se pudo lograr gracias a la interfaz de Movimiento con su método
  aplicarMovimiento.  
  
  
- Se utilizaron interfaces y herencia para englobar comportamientos
que debían realizar varias clases. Una de ellas es la clase
  VBoxBotones en la vista, donde cada botón sabe como almacenar el movimiento
  que le ingresan los handlers por parámetro gracias al 
  método guardarMovimiento.  
  
  
- Para la representación de los movimientos Repetir e Invertir en la
vista, se utilizaron VBox de JavaFx donde le son ingresados
  botones de los movimientos simples cuando el usuario 
  hace click en los botones de la lista de botones disponibles,
  y a su vez otras Vbox creadas por movimientos complejos, para ello, se creo una clase
  VBoxBotones.  
  
  
- Se creó un botón Menú de Ayuda, en el que se explican 
comportamientos importantes del programa, que el usuario debe
  tener en cuenta a la hora de querer ejecutar el programa, en él
  se muestra un resumen de los supuestos que son detallados
  con anterioridad en este informe en el apartado de Supuestos.  
  
  
- Para la creación de la vista sector dibujo, que es el 
recuadro verde con grillas que se muestra a la izquierda de 
  la interfaz gráfica, se utilizó un GridPane en la vista.
  No se utilizó una doble matriz (es decir una matriz en el 
  modelo y otra matriz en la vista), ya que se podía resolver
  directamente en la vista debido al array de Dibujos que se 
  cargan luego de ejecutar cada movimiento en el Tablero (simple o complejo).   
  

- Para borrar, subir bloque y bajar bloque, se utilizaron 
3 controladores donde se realiza la lógica correspondiente a cada botón 
  (se borra, se mueve hacia arriba un lugar, o hacia abajo un lugar).
  El usuario selecciona un bloque con movimiento de la secuencia
  de bloques 
  seleccionados y luego presiona (↓, ↑ o X) y se ejecuta la lógica
  correspondiente al botón presionado (↓, ↑ o X).
  

## Diagramas De Clase

![Diagrama de clases general](https://i.imgur.com/zFC1Gbi.png)
Diagrama general de clases.

![Diagrama de clase del Estado Lapiz](https://i.imgur.com/YvFnfyP.png)
Diagrama de clase del Estado Lapiz.

![Diagrama de clase de los Movimientos](https://i.imgur.com/tyGxePD.png)
Diagrama de clase de los Movimientos.

## Diagramas De Secuencia

![Diagrama de Secuencia Movimiento a Derecha](https://i.imgur.com/vyozdGs.png)
Diagrama de secuencia MovimientoADerecha.

![Diagrama de Secuencia Bloque Invierte Movimientos Simples](https://i.imgur.com/sPvfvtW.png)
Diagrama de secuencia Bloque Invierte Movimientos Simples.

![Diagrama de Secuencia Movimiento de Personaje y Creación De Dibujos](https://i.imgur.com/TrU3xWU.png)
Diagrama de secuencia Movimiento de Personaje y Creación de Dibujos según el estao del lápiz.

![Diagrama de Secuencia Movimiento Invertir Invierte los Movimientos](https://i.imgur.com/sPvfvtW.png)
Diagrama de secuencia Movimiento Invertir Invierte los Movimientos.

![Diagrama de Secuencia Creacion Y Ejecución de Movimiento Personalizado](https://i.imgur.com/KpScFY5.png)
Diagrama de secuencia Creacion Y Ejecución de Movimiento Personalizado.

## Diagrama De Paquetes

![Diagrama de Paquetes](https://i.imgur.com/rmImqIf.png)
Diagrama de Paquetes.

## Diagramas De Estado

![Diagrama de Estado de Personaje](https://i.imgur.com/8JKSyES.png)
Diagrama de Estado de Personaje.

![Diagrama de Estado de Tablero](https://i.imgur.com/PH9cLIx.png)
Diagrama de Estado de Tablero.


