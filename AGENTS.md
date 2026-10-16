# Instrucciones generales del proyecto

## 1. Contexto

Este proyecto es una aplicación académica desarrollada en Java para gestionar estudiantes y sus calificaciones.

Actualmente, el programa funciona desde la consola y está organizado en cuatro clases principales:

* `Registro`: contiene los datos personales comunes y el punto de entrada del programa.
* `Profesor`: permite consultar estudiantes y gestionar sus calificaciones.
* `Estudiante`: representa a cada estudiante y permite consultar sus notas.
* `Notas`: almacena tres calificaciones y calcula su promedio.

## 2. Reglas para modificar el código

* Analiza el código existente antes de proponer modificaciones.
* Conserva las funcionalidades que ya funcionan.
* No elimines clases, métodos o atributos sin justificar el cambio.
* Evita reescribir todo el proyecto cuando sea suficiente una modificación pequeña.
* Explica los cambios con un lenguaje sencillo y apropiado para un estudiante que está aprendiendo Java.
* No agregues dependencias ni tecnologías nuevas sin explicar su utilidad.

## 3. Buenas prácticas

* Mantén responsabilidades claras para cada clase.
* Utiliza nombres descriptivos para las variables y los métodos.
* Evita duplicar código cuando exista una alternativa sencilla.
* Valida las entradas del usuario cuando corresponda.
* Comprueba que el código compile después de realizar cambios, siempre que sea posible.
* Informa claramente sobre los errores que no hayas podido resolver.

## 4. Uso de OpenCode

* Antes de realizar cambios importantes, presenta un plan de trabajo.
* No modifiques archivos cuando el usuario solicite únicamente un análisis.
* Solicita autorización antes de realizar cambios que puedan eliminar información o alterar considerablemente el proyecto.
* Después de modificar el código, explica qué archivos cambiaste y por qué.
* No afirmes que una funcionalidad funciona si no la has comprobado.

## 5. Control de versiones

* Respeta los cambios existentes del usuario.
* No ejecutes comandos destructivos de Git sin autorización.
* Propón mensajes de commit claros y descriptivos.
* No incluyas contraseñas, claves API ni otras credenciales en el repositorio.
