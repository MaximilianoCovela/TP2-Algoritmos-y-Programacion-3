ue a[![Build Status](https://travis-ci.org/fiuba/algo3_proyecto_base_tp2.svg?branch=master)](https://travis-ci.org/fiuba/algo3_proyecto_base_tp2) [![codecov](https://codecov.io/gh/fiuba/algo3_proyecto_base_tp2/branch/master/graph/badge.svg)](https://codecov.io/gh/fiuba/algo3_proyecto_base_tp2)



# TP2 Algoritmos 3: AlgoBlocks

Trabajo Práctico número 2 de la materia Algoritmos y Programación III de FIUBA

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


## Supuestos para las Entregas 0 y 1

- Posicion: Inicialmente se crea con valorHorizontal = 5 y valorVertical = 5.
 Ya que empezaría en la mitad de la matriz si esta tiene 10 filas y 10 columnas.

-  Dibujar dentro de LapizArriba y LapizAbajo, lo que hace es crear una Figura cuyos métodos no implementamos; estas figuras las
 almacenará el SectorDibujo en la segunda entrega.
 
- El Dibujo abstrae si la figura que contiene una posición determinada, 
puede ser dibujada o no, en base al estado del lápiz.

## Supuestos para la Entrega 2

- En Dibujo, Vacío y Linea tienen un método booleano para poder 
comprobar si se actualiza el estado del lápiz correctamente.

## Diagramas

![Diagrama de clases general](https://i.imgur.com/x095J6H.jpg)
Diagrama general de clases.

![Diagrama de clase del Estado Lapiz](https://i.imgur.com/IYTxSVn.jpg)
Diagrama de clase del Estado Lapiz.

![Diagrama de clase de los Movimientos](https://i.imgur.com/3oPVhnf.jpg)
Diagrama de clase de los Movimientos.

![Diagrama de Secuencia Movimiento a Derecha](https://i.imgur.com/H7ytPFm.jpg)
Diagrama de secuencia MovimientoADerecha.

