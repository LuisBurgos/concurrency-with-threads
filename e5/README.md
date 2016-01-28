# Sistemas Distribuidos

## Ejercicio 5

#### Estructura

```
e5
└─ src
  └─ main
   ├─ DemoJoin.java
   └─ NewThread4.java
```

### Explicación

El programa DemoJoin ejecuta el Main thread, en ese programa se crean tres threads. Cada thread, en intervalos de 1 segundo, imprime en consola el número del segundo en el cual se encuentra.

Cuando el Main thread invoca a la función join(), propia de un thread, detendrá su ejecución y esperará a que el thread dónde fue llamada la función termine su ejecución para continuar.
