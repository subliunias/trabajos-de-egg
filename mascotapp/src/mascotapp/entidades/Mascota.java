package mascotapp.entidades;

public class Mascota {

    private String nombre;
    private String apodo;

    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    
    private int energia;
    

    public Mascota() {
        energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo){
        //this hace referencia a la clas. el otro hace referencia a lo que ingresa.
        this.nombre = nombre;
        this.apodo = apodo;
        if(tipo.equals("gato") || tipo.equals("perro") || tipo.equals("conejo") || tipo.equals("mono")){
        this.tipo = tipo;
        }
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
    }
    //esto es para crear un set
    public void setNombre(String nombre){
      //  if(nombre.length()>0){
        this.nombre = nombre;
      //  }
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    //para crear un getter dejan ingresar a 1 parte de los datos
    public String getNombre(){
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }
    
    /**
     * para pasear
     * 
     * @param restarEng
     * @return energia
     */
    public int pasear(int restarEng){
        //energia = energia - restarEng;
        energia -= restarEng;
        return energia;
    }
    
    
    /**
     * pasear por vueltas
     * 
     * @param restarEng
     * @param vueltas
     * @return energia
     */
    public int pasear(int restarEng, int vueltas){
       
        for (int i = 0; i < vueltas; i++) {
            energia -= restarEng;
        }
        return energia;
    }
    
    // to string/ genera un mensaje con todos los datos disponibles ingresa a todos los datos

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }
    
    
    
}

