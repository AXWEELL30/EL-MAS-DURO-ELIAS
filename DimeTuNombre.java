public  class DimeTuNombre {
    public static void main(String[] args) {
        String nombre; //declaramos la variable de tipo de cadena de caracteres 
        System.out.println("Por favor dime como te llamas");
        nombre = System.console().readLine(); //leemos lo que escribe el usuario

        System.out.println("Hola" + nombre + "bienvenido a Java!!!");
    }
    
}