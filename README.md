ue a[![Build Status](https://travis-ci.org/fiuba/algo3_proyecto_base_tp2.svg?branch=master)](https://travis-ci.org/fiuba/algo3_proyecto_base_tp2) [![codecov](https://codecov.io/gh/fiuba/algo3_proyecto_base_tp2/branch/master/graph/badge.svg)](https://codecov.io/gh/fiuba/algo3_proyecto_base_tp2)



# TP2 Algoritmos 3: AlgoBlocks

Trabajo Práctico número 2 de la materia Algoritmos y Programación III de FIUBA

## Grupo 4

* **Chacón Irina Ailén** - [integrante1](https://github.com/iruchita)
* **Dziuma Nicolás** - [integrante2](https://github.com/nicolasss1993)
* **Ré Gabriel** - [integrante3](https://github.com/Gabriel-Re)
* **Covela Maximiliano Gastón** - [integrante4](https://github.com/MaximilianoCovela)

Corrector: Edson Justo

### Pre-requisitos

Listado de software/herramientas necesarias para el proyecto

```
java 11
maven 3.6.0
...
```

## Ejecutando las pruebas

```bash
    mvn test
```

Este comando crea el reporte de cobertura para CI y el reporte HTML que pueden abrir de la siguiente manera:

```bash
    <browser> ./target/site/jacoco/index.html
```

## Ejecutando la aplicación

Explicación de como ejecutar la aplicación

## Licencia

Este repositorio está bajo la Licencia MIT

## Supuestos para la Entrega 0

- Posicion: Inicialmente se crea con valorHorizontal = 5 y valorVertical = 5.
 Ya que empezaría en la mitad de la matriz si esta tiene 10 filas y 10 columnas.
Este aspecto va a ser modificable cuando creemos la matriz en sí,
para representar al personaje junto a sus movimientos.
-  Cuando se implementen los bloques, mover dentro de LapizArriba y LapizAbajo, lo único que hace es llamar a actualizarEstadoLapiz
 de Personaje, ya que no realizan ningún cambio en la posición del personaje, por lo que estos métodos no tendrían un propio Movimiento.
- Para la clase Lapiz, el dibujarCamino no implementa el dibujar, ya que es necesario un modo de mostrar
 graficamente la linea del trazado del mismo.
 
