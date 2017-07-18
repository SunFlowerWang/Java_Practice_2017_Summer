import java.io.*;

public class WritingTextFile{
    public static void main(String [] args){
        //the name of the file to open
        String fileName = "writeTemp.txt";

        try{
            //Assume default encoding
            FileWriter fileWriter = new FileWriter(fileName);
            //Always wrap FileWriter in Bufferewriter
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            //note tha write() does not automatically append a newline char
            bufferedWriter.write("Hello there,");
            bufferedWriter.write("Here is some test");
            bufferedWriter.newLine();
            bufferedWriter.write("hdjfalkjdkjf");

            //always close files
            bufferedWriter.close();
        
        }catch(IOException ex){
            System.out.println("Error writing to file "+fileName);
        }
    
    }



}
