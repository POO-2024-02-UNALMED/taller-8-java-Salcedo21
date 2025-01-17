package futbol;

abstract public class Futbolista implements Comparable {
    private String nombre;
    private int edad;
    private String posicion;

    public Futbolista() {
        edad = 30;
        posicion = "delantero";
        nombre = "Maradona";
    }

    public Futbolista( String nombre,int edad, String posicion) {
        this.edad = edad;
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }


    public boolean equals(Futbolista f){
        return this.posicion.equals(f.posicion) || this.edad == f.edad || this.nombre.equals(f.nombre);
    }

    abstract public boolean jugarConLasManos();

    @Override
    public String toString() {
        return "El futbolista "+ nombre+" tiene "+edad+" y juega de "+ posicion;
    }
}
