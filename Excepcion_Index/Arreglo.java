public class Arreglo 
{
    int[] arreglo;
    Arreglo(int size)
    {
        arreglo = new int[size];
        for(int i =0 ;i<arreglo.length;i++)
        {
            arreglo[i]=i+1;
        }
    }

    public int getValue(int index)
    {
        return arreglo[index];
    }
}
