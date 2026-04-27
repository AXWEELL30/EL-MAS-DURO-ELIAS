import java.util.Scanner;

public class LeeNumeros {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println(" Introduce tu nombre y edad ");
        String nombre = s.nextLine();

        System.out.println("Ingrese su edad");
        int edad = s.nextInt();

        System.out.println(" Tu nombre es:"+nombre+" y tu edad "+edad);
    }

}
    

