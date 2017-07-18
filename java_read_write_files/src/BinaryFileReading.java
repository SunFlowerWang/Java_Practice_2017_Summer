/*
 If you want to read a binary file, or a text file containing weird chars(ones that your system doesn't deal with by default), you need to use FileInputStream instead of FileReader. Instead of wrapping fileinputstream in a buffer, FileInputStream define a method called read() that lets you fill a buffer with data, automatically reading just enough bytes to fill the buffer
 
 */

import java.io.*;
public class BinaryFileReading{
    public static void main(String [] args){
        //the name of the file to open 
        String fileName = "wiredtemp.txt";
        try{
            //Use this for reading the data
            byte[] buffer = new byte[1000];
            FileInputStream inputStream = new FileInputStream(fileName);
            //read fills buffer with data and returns the number of bytes read
            int total = 0;
            int nRead = 0;
            while((nRead = inputStream.read(buffer)) != -1){
                //Convert to String so we can display it
                System.out.println(new String(buffer));
                total += nRead;

            }
        //Always close files
         inputStream.close();
         System.out.println("Read" + total +" bytes");

        }catch(FileNotFoundException ex){
            System.out.println("Unable to  open file"+fileName+" ");
        }catch(IOException ex){
            System.out.println("Error reading file 0" + fileName + " ");
        }

    
    
    
    }



}
