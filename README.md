# Taller de Nivelación PI a PII

## Autor
**Jesús David Arrechea Gómez**

## Programa
Tecnología en Sistemas de la Información

## Git y Control de Versiones

1. **¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?**  
   Un repositorio guarda el historial de cambios, mientras que un proyecto normal solo contiene los archivos actuales.

2. **¿Cuáles son las tres áreas principales de Git?**
   - Working directory: donde editas los archivos.
   - Staging area (index): donde seleccionas los cambios que quieres guardar.
   - Repository: donde se almacenan los commits.

3. **¿Cómo representa Git los cambios internamente?**
   - Blob: contenido de un archivo.
   - Tree: estructura de carpetas y archivos.
   - Commit: captura del proyecto en un momento dado.
   - Tag: marca para señalar commits importantes.

4. **¿Cómo se crea un commit y qué información guarda?**  
   Se usan `git add` y `git commit`. Guarda cambios, autor, fecha y mensaje.

5. **Diferencia entre git pull y git fetch**
   - `git fetch`: descarga cambios sin mezclarlos.
   - `git pull`: descarga y mezcla los cambios.

6. **¿Qué es un branch (rama)?**  
   Línea de desarrollo independiente. Git usa punteros para indicar el commit actual.

7. **¿Cómo se hace un merge y qué conflictos pueden surgir?**  
   Une dos ramas. Si hay cambios en la misma parte de un archivo, se debe resolver manualmente.

8. **¿Cómo funciona el área de staging (git add)?**  
   Prepara los cambios para el commit. Si no se usa, los cambios no se guardan.

9. **¿Qué es .gitignore?**  
   Archivo que indica qué archivos o carpetas ignorar.

10. **Diferencia entre commit --amend y un nuevo commit**
    - Nuevo commit: agrega un registro nuevo.
    - --amend: modifica el último commit.

11. **¿Qué es git stash y para qué sirve?**  
    Guarda temporalmente los cambios sin hacer commit.

12. **¿Cómo deshacer cambios en Git?**
    - `git reset`: borra cambios del historial o staging.
    - `git revert`: crea un commit que deshace otro.
    - `git checkout`: vuelve a otra rama o versión.

13. **¿Qué son los remotos (origin, upstream)?**
    - origin: tu copia en GitHub.
    - upstream: repositorio original del fork.

14. **¿Cómo ver el historial?**
    - `git log`: lista de commits.
    - `git diff`: diferencias entre versiones.
    - `git show`: detalles de un commit.

## Programación en Java

15. **Tipos de datos primitivos en Java**  
    `int`, `double`, `float`, `char`, `boolean`, `byte`, `short`, `long`.

16. **Estructuras de control en Java**
    - `if / else`: condiciones.
    - `switch`: múltiples opciones.
    - `for / while`: bucles.

17. **Importancia de nombres significativos**  
    Facilitan la comprensión del código.

18. **Programación Orientada a Objetos (POO)**  
    Organiza el código en clases y objetos.

19. **Cuatro pilares de la POO**
    - Encapsulación
    - Abstracción
    - Herencia
    - Polimorfismo

20. **Herencia en Java**  
    Una clase hereda atributos y métodos de otra.

21. **Modificadores de acceso en Java**
    - `public`: accesible desde cualquier parte.
    - `private`: solo dentro de la clase.
    - `protected`: desde la clase y subclases.

22. **Variable de entorno**  
    Valor definido en el sistema operativo, útil para configurar Java (como el JDK).

