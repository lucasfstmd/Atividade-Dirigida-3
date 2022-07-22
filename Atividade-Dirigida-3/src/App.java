import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;


public class App {

    public static Scanner scan = new Scanner(System.in);

    public static boolean checkArquivo(File arquivo){
        if(arquivo == null){
            return false;
        }
        return true;
    }

    public static void lerArquivo(File arquivo) throws IOException{
        
        FileReader leitor = new FileReader(arquivo);
        BufferedReader leitorBuffer = new BufferedReader(leitor);

        String linha = leitorBuffer.readLine();

        do{
            System.out.println(linha);
            linha = leitorBuffer.readLine();
        }while(linha != null);
    }

    public static void escreveArquivo(String frase, File arquivo){
        
        
    }
    public static void main(String[] args) throws Exception {
        System.out.print("\nDigite o nome para o aquivo: ");
        String Arquivo = scan.nextLine();
        String nomeArquivo = Arquivo + ".dat";
    
        File arquivo = new File(nomeArquivo);
        
        
        
    }
}
