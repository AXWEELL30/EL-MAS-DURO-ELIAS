public class Array2 {
     
    public static void main(String[] args) {
        int[] num = new int[5];

        num[0]= 8;
        num[1]= 23;
        num[2]= 300;
        num[3]= 150;
        num[4]= 11;

        System.err.println("El array num tiene 5 elementos");
        System.out.print("Introduzca un numero de  0 al 4, para ver el valor: ");

        int indice = Interger.parseInt(System.console().readLine());

        System.err.println("El valor que se encontro en la posicion " +inidice );
        System.out.println("Es el:"+num[indice] );
        

    }
}
