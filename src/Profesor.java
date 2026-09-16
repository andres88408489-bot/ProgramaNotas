class Profesor extends Registro {

    private Estudiante estudiante1;
    private Estudiante estudiante2;
    private Estudiante estudiante3;
    private Estudiante estudiante4;

    Profesor(String nombre, String apellido,
             Estudiante estudiante1,
             Estudiante estudiante2,
             Estudiante estudiante3,
             Estudiante estudiante4) {

        super(nombre, apellido);

        this.estudiante1 = estudiante1;
        this.estudiante2 = estudiante2;
        this.estudiante3 = estudiante3;
        this.estudiante4 = estudiante4;
    }

    void mostrarDatos() {
        IO.println("Hola " + getNombre() + " " + getApellido());
    }

    void menuProfesor() {

        int opcion = Integer.parseInt(IO.readln(
                "\n1. Ver estudiantes \n2. Editar Perfil \n3. Salir \n"
        ));

        switch (opcion) {

            case 1:
                IO.println("===ESTUDIANTES===");

                IO.println("1. " + estudiante1.getNombre() + " " + estudiante1.getApellido());
                IO.println("2. " + estudiante2.getNombre() + " " + estudiante2.getApellido());
                IO.println("3. " + estudiante3.getNombre() + " " + estudiante3.getApellido());
                IO.println("4. " + estudiante4.getNombre() + " " + estudiante4.getApellido());

                int estudiante = Integer.parseInt(
                        IO.readln("Seleccione un estudiante: ")
                );

                switch (estudiante) {

                    case 1:
                        menuNotas(estudiante1);
                        break;

                    case 2:
                        menuNotas(estudiante2);
                        break;

                    case 3:
                        menuNotas(estudiante3);
                        break;

                    case 4:
                        menuNotas(estudiante4);
                        break;

                    default:
                        IO.println("Estudiante no válido");
                        break;
                }

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

    void menuNotas(Estudiante estudiante) {

        IO.println("\n=== ESTUDIANTE SELECCIONADO ===");
        IO.println(estudiante.getNombre() + " " + estudiante.getApellido());

        int opcion = Integer.parseInt(IO.readln(
                "\n1. Ver notas" +
                        "\n2. Ingresar notas" +
                        "\n3. Cambiar notas" +
                        "\n4. Volver" +
                        "\n"
        ));

        switch (opcion) {

            case 1:
                estudiante.getNotas().mostrarNotas();
                break;

            case 2:
                ingresarNotas(estudiante);
                break;

            case 3:
                ingresarNotas(estudiante);
                break;

            case 4:
                IO.println("Volviendo...");
                break;

            default:
                IO.println("Opción inválida");
                break;
        }
    }

    void ingresarNotas(Estudiante estudiante) {

        double nota1 = Double.parseDouble(
                IO.readln("Ingresar nota 1: ")
        );

        double nota2 = Double.parseDouble(
                IO.readln("Ingresar nota 2: ")
        );

        double nota3 = Double.parseDouble(
                IO.readln("Ingresar nota 3: ")
        );

        estudiante.getNotas().setNota1(nota1);
        estudiante.getNotas().setNota2(nota2);
        estudiante.getNotas().setNota3(nota3);

        IO.println("Notas guardadas correctamente.");
        estudiante.getNotas().mostrarNotas();
    }
}