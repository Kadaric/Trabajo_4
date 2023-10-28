import java.util.Scanner;

public class Principal
{
    public static void main (String [] args)
    {
        try
        {
            Scanner scan = new Scanner (System.in); 
            System.out.println("Digite el tamaño del arreglo");
            int mySize = scan.nextInt();
            Arreglo miArreglo = new Arreglo(mySize);
            int value = miArreglo.getValue(mySize);
            System.out.println("El valor del elemento es: "+value);
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Error consultando valor");
        }
    }
}