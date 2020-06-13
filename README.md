# JavaOCA_8_gen_2020
Este repositorio fue creado para almacenar las prácticas que se van a realizar durante el curso.

Sigue las instrucciones para poder incluir tu código para revisión:

- Crear cuenta de [github](https://github.com/) en la versión pública
- Nota: Si no tienes git en tu maquina primero debes descargarlo de la siguiente pagina [download git](https://git-scm.com/downloads ) y seguir las instrucciones para su instalación
- Esperar solicitud de colaboración y aceptar: Este punto yo lo voy a realizar: **alfonso.valdezaltamirano@gmail.com**
- Clona el repositorio en una ubicación local en tu equipo
  - `git clone https://github.com/breakponchito/JavaOCA_8_gen_2020.git`
- Abre git y ubicate en la carpeta raíz del repositorio. Yo tengo:
  -java
   -courses
    -certificatic
      -javaOCA_Jun2020
        -sourceProject
          -JavaOCA_8_gen_2020
- En esta ubicación es donde ejecutaremos los comandos git
- Abre el proyecto en Netbeans con la opción de abrir proyecto
- Localiza el paquete que te corresponde: Para cada usuario fue generado un paquete con la correspondencia a su correo electrónico. A continuación indico los usuarios creados:
  1. Paquete: deveduardoramirez para `dev.eduardoramirez@gmail.com`
  2. Paquete: deveduardodogs para `eduardogs.1030@gmail.com`
  3. Paquete: devdamunguia95 para `damunguia95@gmail.com`
  4. Paquete: devjuangofett para `juangofett@gmail.com`
  5. Paquete: devdanielgom91 para `daniel.gom.91@outlook.com`
- Descarga la práctica del módulo desde la siguiente liga: [drive](https://drive.google.com/drive/folders/1nvJ7ZXBFovhsj7V8be_aiQRm37mlfhrG?usp=sharing)
- Cada práctica da la instrucción de generar siempre un nuevo proyecto netbeans, en vez de eso vamos a ir agregando nuevos paquetes sobre la estructura de este proyecto
- Dentro del paquete creado de tu usuario, crear la carpeta del modulo que corresponda. Ejemplo:
  - deveduardoramirez
    -module6
      -practice1
        -agrega aqui el código fuente de tu práctica
      -practice2
        -agrega aqui el código fuente de tu práctica
- Puedes incluir tus cambios en cualquier momento
- Para consultar los cambios realizado utilizar el comando `git status` en caso de tener dudas consultar la siguiente [liga](https://git-scm.com/docs/git-status)
- crear un branch con el siguiente comando `git checkout -b nameofbranch` , si tienes dudas de como crear un branch consulta la siguiente [liga](https://git-scm.com/docs/git-checkout)
- Para indicar que cambios se van a promover para subir utilizar el comando `git add nameoffile` , si tienes dudas de como utilizar el comando consulta la siguiente [liga](https://git-scm.com/docs/git-add)

- Cuando todos los cambios esten en stage entonces es momento de crear un commit con el siguiente comando `git commit -m "message"` , este comando utiliza la opción -m para que podamos agregar un mensaje descriptivo del cambio que queremos publicar

- Ahora vamos a enviar los cambios al repositorio remoto con el comando `git push --set-upstream origin branchname` , en donde branchname es el nombre del branch que genere previamente y en donde estan mis cambios
	 
- Cuando tengamos este avance ahora vamos a generar un pull request desde la interfaz web de github, por lo que debemos logearnos en nuestra cuenta y entrar al repositorio del proyecto

- Dentor del repositorio del proyecto vamos a buscar el boton **Compare & pull request** le damos click y observamos la siguiente interfaz

- Agregamos un titulo al pull request y agregamos un comentario en el cuerpo del pull request

- En la sección de **Reviewers** seleccionar mi nombre de usuario de github **breakponchito** , yo sere el unico que aprobara sus cambios

- Cuando tengan esto ya solo falta dar click en el boton **Create Pull Request** dan click y esperan mi aprobacion y merge del branch para que el codigo que agregaron se propage al proyecto base master

- Ahora lo que tienes que hacer en tu local es moverte al branch master con el comando `git checkout master`

- Y borras el branch que utilizaste con el comando `git branch -d localbranchname` , donde localbranchname es el nombre del branch que crearon

- Y actualizamos nuestro branch local master con el siguiente comando `git pull` , para tener todos los cambios

- Dudas o comentarios enviarlos a mi correo: **alfonso.valdezaltamirano@gmail.com**  o lo platicamos en clase
