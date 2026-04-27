public class Sentencia {

    public static void main(String[] args) {
        System.out.println("¿cual es la capital del Peru?");
        String respuesta = System.console().readLine();

        if(respuesta.equals("lima")){
            System.out.println("¡ la respuesta es correcta !");

           }else{
            System.out.println(" la respuesta es incorrecta "); 
    }
}