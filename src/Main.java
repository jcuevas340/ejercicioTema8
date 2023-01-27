import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        persona.setNombre(nombre);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        persona.setEdad(edad);

        System.out.print("Ingresa tu telefono: ");
        String telefono = scanner.nextLine();
        persona.setTelefono(telefono);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Telefono: " + persona.getTelefono());
        System.out.println("Edad: " + persona.getEdad());

    }

    static class Persona{
        private int edad;
        private String nombre;
        private String telefono;

        public void setEdad(int edad){
            this.edad = edad;
        }

        public int getEdad(){
            return this.edad;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getNombre(){
            return this.nombre;
        }

        public void setTelefono(String telefono){
            this.telefono = telefono;
        }

        public String getTelefono(){
            return this.telefono;
        }
    }
}