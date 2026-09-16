class Notas {

    private double nota1;
    private double nota2;
    private double nota3;

    Notas(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    void mostrarNotas() {

        IO.println("Nota 1: " + nota1);
        IO.println("Nota 2: " + nota2);
        IO.println("Nota 3: " + nota3);
        IO.println("Calificación final: " + calcularPromedio());
    }
}