class Registro {
    private String nombre;
    private String apellido;

    String getNombre() {
        return nombre;
    }

    String getApellido() {
        return apellido;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void setApellido(String apellido) {
        this.apellido = apellido;
    }

    Registro(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public static void main(String[] args) {

        Registro usuario1 = new Registro(
                IO.readln("Ingresar nombre: "),
                IO.readln("Ingresar apellido: ")
        );

        Estudiante estudiante1 = new Estudiante("Carlos", "Sanchez");
        Estudiante estudiante2 = new Estudiante("Sara", "Suarez");
        Estudiante estudiante3 = new Estudiante("Pablo", "Toro");
        Estudiante estudiante4 = new Estudiante("Juan", "Gomez");

        int opcion = Integer.parseInt(IO.readln(
                "Ingresar el tipo de usuario: \n1. Profesor \n2. Estudiante \n"
        ));

        switch (opcion) {

            case 1:
                IO.println("===BIENVENIDO AL PROGRAMA DE PROFESORES===");

                Profesor profesor1 = new Profesor(
                        usuario1.getNombre(),
                        usuario1.getApellido(),
                        estudiante1,
                        estudiante2,
                        estudiante3,
                        estudiante4
                );

                profesor1.mostrarDatos();
                profesor1.menuProfesor();
                break;

            case 2:
                IO.println("===BIENVENIDO AL PROGRAMA DE ESTUDIANTES===");

                if (usuario1.getNombre().equals(estudiante1.getNombre())
                        && usuario1.getApellido().equals(estudiante1.getApellido())) {

                    estudiante1.mostrarDatos();
                    estudiante1.menuEstudiante();

                } else if (usuario1.getNombre().equals(estudiante2.getNombre())
                        && usuario1.getApellido().equals(estudiante2.getApellido())) {

                    estudiante2.mostrarDatos();
                    estudiante2.menuEstudiante();

                } else if (usuario1.getNombre().equals(estudiante3.getNombre())
                        && usuario1.getApellido().equals(estudiante3.getApellido())) {

                    estudiante3.mostrarDatos();
                    estudiante3.menuEstudiante();

                } else if (usuario1.getNombre().equals(estudiante4.getNombre())
                        && usuario1.getApellido().equals(estudiante4.getApellido())) {

                    estudiante4.mostrarDatos();
                    estudiante4.menuEstudiante();

                } else {
                    IO.println("Usuario no encontrado");
                }

                break;

            default:
                IO.println("===OPCIÓN INVÁLIDA===");
                break;
        }
    }
}