import java.util.Scanner;

public class Calculadora 
{
    int valor1, valor2;    
    public int Sumar()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite el primer valor: ");
        valor1 = scan.nextInt();
        System.out.println("Digite el segundo valor: ");
        valor2 = scan.nextInt();
        return valor1+valor2;
    }
}
