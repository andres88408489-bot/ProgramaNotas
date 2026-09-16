class Estudiante extends Registro {

    private Notas notas;

    Estudiante(String nombre, String apellido) {
        super(nombre, apellido);
        notas = new Notas(0, 0, 0);
    }

    Notas getNotas() {
        return notas;
    }

    void mostrarDatos() {
        IO.println("Hola " + getNombre() + " " + getApellido());
    }

    void menuEstudiante() {

        int opcion = Integer.parseInt(IO.readln(
                "\n1. Ver Notas \n2. Editar Perfil \n3. Salir \n"
        ));

        switch (opcion) {

            case 1:
                notas.mostrarNotas();
                break;

            case 2:
                setNombre(IO.readln("Ingresar nuevo nombre: "));
                setApellido(IO.readln("Ingresar el nuevo apellido: "));

                IO.println("Ahora tu nombre es: " + getNombre());
                IO.println("Ahora tu apellido es: " + getApellido());
                break;

            case 3:
                IO.println("Abandonando el programa...");
                break;

            default:
                IO.println("Opción inválida");
                break;
        }
    }
}