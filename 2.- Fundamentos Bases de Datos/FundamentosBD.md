# Fundamentos de Bases de Datos

## Notas

### Conceptos Básicos y contexto histórico de las Bases de Datos

El almacenamiento en la nube tiene un gran pro comparado con los otros métodos de almacenamiento ya que es accesible desde cualquier parte del mundo. Además es centralizada y puede ser usada por varias personas al mismo tiempo.

Las bases de datos entran cuando hacemos la transición a medios digitales.

#### **Tipos de bases de datos**

- **Relacionales**: En la industria hay varias compañías dedicadas a ser manejadoras de bases de datos relacionales como **SQL Server**, **Oracle**, **MariaDB**, entre otras.
- **No relacionales**: Todavía están avanzando y existen ejemplos muy distintos como **cassandra**, **elasticsearch**, **neo4j**, **MongoDB**, entre otras.

#### **Servicios**

- **Auto administrados**: Es la base de datos que instalas tú y te encargas de actualizaciones, mantenimiento, etc.
- **Administrados**: Servicios que ofrecen las nubes modernas como Azure y no debes preocuparte por mantenimiento o actualizaciones.

### Historia de las RDB (Relational Data Base)

Las bases de datos surgen de la necesidad de conservar la información más allá de lo que existe en la memoria RAM.

Las bases de datos **basadas en archivos** eran datos guardados en texto plano, fáciles de guardar pero muy difíciles de consultar y por la necesidad de mejorar esto nacen las **bases de datos relacionales**. Su inventor **Edgar Codd** dejó ciertas reglas para asegurarse de que toda la filosofía de las bases de datos no se perdiera, estandarizando el proceso.

#### LAS 23 REGLAS DE CODD DEL MODELO RELACIONAL

- Regla 1: REGLA DE LA INFORMACIÓN
  - Toda la información en una base de datos relacionales se muestra explícitamente en el nivel lógico mediante tablas y solo mediante tablas.
  - Por tanto, los metadatos (diccionario, catalogo) se representan y manipulan exactamente igual que los datos de usuario, usando quizás el mismo lenguaje (ejemplo SQL).
- Regla 2: REGLA DEL ACCESO GARANTIZADO
  - Para todos y cada uno de los datos (valores atómicos) de una base de datos relacional se garantiza que son accesibles a nivel lógico utilizando una combinación de nombre de tabla, valor de clave primaria y nombre de columna.
  - Cualquier dato almacenado en una base de datos relacionales tiene que poder ser direccionado unívocamente. Para ello hay que indicar en qué tabla está, cuál es la columna y cuál es la fila primaria.
- Regla 3: TRATAMIENTO SISTEMÁTICO DE VALORES NULOS
  - Se debe disponer de valores nulos (distinto de la cadena vaciá, blancos, 0, etc) para representar información desconocida o no aplicable de manera sistemática, independiente del tipo de datos.
  - Se reconoce la necesidad de la existencia del valor nulo, el cual puede servir para representar, o bien, una información desconocida (ejemplo, no se sabe la dirección de un empleado).
- Regla 4: CATÁLOGO DINÁMICO EN LÍNEA BASADO EN EL MODELO RELACIONAL
  - La descripción de la base de datos se representa a nivel lógico de la misma manera que los datos normales, de modo que los usuarios autorizados pueden aplicar el mismo lenguaje relacional a su consulta, igual que lo aplican los datos normales.
  - Los metadatos se almacenan y se manejan usando el modelo relacional, con todas las consecuencias.
- Regla 5: REGLA DEL SUB-LENGUAJE DE DATOS COMPLETO
  - Un sistema relacional debe soportar varios lenguajes y varios modos de uso de terminal (ejemplo: rellenar formularios, etc). Sin embargo, debe existir al menos un lenguaje cuyas sentencias sean expresables, mediante una sintaxis bien definida, como cadenas de caracteres y que sea completo.
  - Además, debe tener una interfaz de usuario para hacer consultas, etc. Siempre debe haber una manera de hacerlo todo de manera textual, que es tanto como decir que puede ser incorporado en un programa tradicional. Un lenguaje que cumple esto en gran medida es SQL.
- Regla 6: REGLA DE ACTUALIZACIÓN DE VISTAS
  - Todas las vistas que son teóricamente actualizables se pueden actualizar también por el sistema.
  - El problema está determinado en las vistas teóricamente actualizables, ya que no está muy claro.
  - Cada sistema puede hacer las suposiciones particulares sobre las vistas que son actualizables.
- Regla 7: INSERT, UPDATE, DELETE DE ALTO NIVEL
  - La capacidad de manejar una relación base o derivada como un solo operando se aplica no sólo a la recuperación de los datos (consultas), sino también a la inserción, actualización y borrado de datos.
  - Esto es, el lenguaje de manejo de datos también debe ser de alto nivel. Algunos sistemas de la cuenta se modifican en las filas de una tabla a la vez.
- Regla 8: INDEPENDENCIA DE LA REPRESENTACIÓN FÍSICA DE DATOS
  - Los programas de aplicación y actividades de terminal permanecen inalterados a nivel lógico cualesquiera sean  los cambios efectuados, tanto en la representación del almacenamiento, como en los métodos de acceso.
  - El modelo relacional es un modelo lógico de datos, y oculta las características de su representación física.