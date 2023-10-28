public class Conversion 
{
    String cadena;
    Conversion(String cadena)
    {
        this.cadena=cadena;
    }

    public int convertir()
    {
        int numero = Integer.parseInt(this.cadena);
        return numero;
    }
}
