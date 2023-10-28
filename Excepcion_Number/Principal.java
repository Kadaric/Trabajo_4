import java.util.Scanner;

public class Principal
{
    public static void main(String [] args)
    {
        try
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese la cadena numerica: ");
            String sCadena = scan.nextLine();
            Conversion conversion = new Conversion(sCadena);
            int numero = conversion.convertir();
            System.out.println("La cadena numerica es "+numero);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Error: ingrese una cadena numerica valida");
        }
    }
}