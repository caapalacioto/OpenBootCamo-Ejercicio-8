public class main {
    public static void main(String[] args) {
        Persona person = new Persona();
        person.setEdad(25);
        person.setNombre("Carlos");
        person.setTelefono(320797413);
        String nombre= person.getNombre();
        int edad=person.getEdad();
        int telefono= person.getTelefono();
        System.out.println("El nombres es: "+ nombre);
        System.out.println("La edad es: "+ edad);
        System.out.println("El telefono es: "+ telefono);
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
}
