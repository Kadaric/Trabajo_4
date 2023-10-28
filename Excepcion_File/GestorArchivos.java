import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class GestorArchivos 
{    
    public String abrirArchivo(String nombreArchivo)
    {
        try
        {
            File archivo = new File(nombreArchivo);
            FileReader lectorArchivo = new FileReader(archivo);
            BufferedReader br = new BufferedReader(lectorArchivo);
            String lectura="",linea;  
            while((linea=br.readLine())!=null)
            {
                lectura += linea;
            }
            return lectura;
        }
        catch(FileNotFoundException e)
        {
            return "archivo no encontrado";
        }
        catch (IOException e) {
            return "error al leer el archivo";
        }
    }
}
