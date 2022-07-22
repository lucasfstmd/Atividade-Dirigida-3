/*
 * autores: Lucas Fausto Medeiros
 *          Kaike da Silva Ivo
 *          Jose Jamilsom Ferreira da Silva
 */

        // imports //
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.NoSuchElementException;


public class Quest1 { // Inicio da Classe principal

    public static Scanner scan = new Scanner(System.in); // Variavel de entrada do teclado

    public static void lerArquivo(File arquivo) throws IOException{ // Inicio da classe lerArquivo
        FileReader leitor = new FileReader(arquivo);
        try (BufferedReader leitorBuffer = new BufferedReader(leitor)) { // Inicio do try 
            String linha = leitorBuffer.readLine();

            do{
                System.out.println(linha);
                linha = leitorBuffer.readLine();
            }while(linha != null);
        }// Fim do try
    }// Fim da classe lerArquivo

    public static void escreveArquivo(File arquivo){ // Inicio da classe escreverArquivo
        try{
            FileWriter escritor = new FileWriter(arquivo);
            BufferedWriter escritorBuffer = new BufferedWriter(escritor);

            System.out.println("Digite as palavras, finalize com CTRL d ou CTRL z: ");
            while(scan.hasNext()){
                String palavra = scan.nextLine();
                escritorBuffer.write(palavra + "\n");

            }
            escritorBuffer.close();
            escritor.close();
        /*
         * Tratemento de erros, Excessoes.
         */
        }catch(IOException ex){
            System.err.println("Erro na escrita do arquivo.");

        }catch(NoSuchElementException ex){
            System.err.println("Entrada invalida");
            scan.nextLine();

        }catch(NullPointerException ex){
            System.err.println("Abrir o arquibo primerio.");
            System.exit(1); 
        }
    }// Fim da classe escreverArquivo

    public static void main(String[] args) throws Exception { // Inicio da classe main
        System.out.print("\nDigite o nome para o aquivo: ");
        System.out.println();
        String Arquivo = scan.nextLine() + ".dat";
        Path check = Paths.get(Arquivo);

        if(Files.exists(check)){
            File arquivo = new File(Arquivo);
            escreveArquivo(arquivo);
            System.out.println("\nArquivo existente.\n");
            lerArquivo(arquivo);
        }else{
            File arquivo = new File(Arquivo);
            escreveArquivo(arquivo);
            System.out.println("\nArquivo não existe.");
            System.out.printf("Um arquivo de nome %s foi criado.\n", Arquivo);
            System.out.println();
            lerArquivo(arquivo);
        }
    }// Fim da classe main
    
}// Fim da classe principal
