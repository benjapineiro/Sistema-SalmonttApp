## Actividad Sumativa 2: Sistema SalmontApp
### Autor del proyecto

Nombre: Benjamin Jesus Piñeiro Ramos

Asignatura: Desarrollo orientado a objetos 1

Profesor: Pablo Andrés Vilches Valenzuela

Carrera: Analista Programador Computacional

### Descripción del proyecto

Este proyecto corresponde a la continuación del sistema desarrollado para la compañía Salmontt, como parte de la Actividad Sumativa 2.
Su objetivo es fortalecer la estructura existente, haciéndola más funcional y eficiente.

Para lograrlo, se integran nuevas herramientas como validaciones básicas, colecciones de datos para almacenar y reutilizar información, relaciones entre clases y lectura de datos desde un archivo externo.

De esta manera, el sistema evita errores comunes, amplía sus capacidades y permite una gestión más completa y robusta de la información.

### Estructura de paquetes y clases implementadas

```
📁src/
├── ui/
│   └── Main.java                # Método main donde se ejecuta el programa
│
├── data/
│   └── GestorDatos.java         # Carga y procesa los registros del archivo
│
├── model/
│   └── CentroCultivo.java       # Clase que representa un centro de cultivo
│
└── util/
    └── LectorArchivo.java       # Lector de archivos .txt

📁resources/
└── centrosDeCultivo.txt         # Archivo externo con información de centros de cultivo
```

### Instrucciones para ejecutar el programa

Clona o descarga el proyecto en tu computador:
```
git clone https://github.com/benjapineiro/Sistema-SalmonttApp/tree/84c5a3326e929c47a41e43a74b6090dc3b3c5aee/SalmonttApp
```

Abre el proyecto en tu IDE.

Ejecuta la clase principal Main, ubicada en el paquete ui.

Revisa la consola para visualizar:

La lista completa de centros cargados.

El filtrado de centros con producción mayor o igual a 1000.
