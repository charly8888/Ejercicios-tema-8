public class Main {

    public static void main(String[] args) {

        Persona german = new Persona();

        german.setEdad(22);
        german.setNombre("German Hornus");
        german.setTelefono(5493454024322L);

        int edad = german.getEdad();
        String name = german.getNombre();
        Long tel = german.getTelefono();

        System.out.println("Edad: "+ edad + ", Nombre: " + name + ", Telefono: " + tel);
    }

  public static class Persona {
        private int edad;
        private String nombre;
        private long telefono;

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getEdad() {
            return this.edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setTelefono(long telefono) {
            this.telefono = telefono;
        }

        public long getTelefono() {
            return this.telefono;
        }
    }

}
