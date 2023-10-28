import java.util.Scanner;

public class Principal
{
    public static void main(String [] args)
    {
        Scanner entradaEscaner = new Scanner (System.in); 
        GestorArchivos gestor = new GestorArchivos();
        System.out.println("Escriba un numero de archivo para abrir:");
        System.out.println("1. texto1");
        System.out.println("2. texto2");       

        int seleccion = entradaEscaner.nextInt();
        
        if(seleccion==1)
        {
            System.out.println(gestor.abrirArchivo("texto1.txt"));
        }
        else
        {
            System.out.println(gestor.abrirArchivo("texto2.txt"));
        }
       

        entradaEscaner.close();
    }
}