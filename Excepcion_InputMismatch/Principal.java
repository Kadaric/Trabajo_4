import java.util.InputMismatchException;

public class Principal
{
    public static void main (String [] args)
    {
        try
        {
            Calculadora miCalculadora = new Calculadora();
            int suma = miCalculadora.Sumar();
            System.out.println("El valor de la suma es: "+suma);
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Ingrese un numero, no ingrese letras ni caracteres especiales");
        }
    }
}