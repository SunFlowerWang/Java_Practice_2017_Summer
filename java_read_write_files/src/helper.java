import java.io.*;
import java.util.ArrayList;
//This class is a helper class to read in two different files and get each line and save them into arrays
import java.util.Arrays;

public class helper {
	public static void  main (String [] args){
			//The name of the file to open
		String fileName1 = "file1";
		String fileName2 = "file2";
		// These will reference one line
		String line1 = null;
		String line2 = null;
		
		try{
			//FileReader reads text files in the default encoding
			FileReader fileReader1 = new FileReader(fileName1);
			FileReader fileReader2 = new FileReader(fileName2);
			//Always wrap fileRead1/fileReader2 in BufferedReader
			BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
			BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
			//String arrays to store stuff
			String[] result1 = null;
			String[] result2 = null;
			//ArrayList to store test cases 
			ArrayList<String[]> test_case1= new ArrayList<String[]>();
			ArrayList<String[]> test_case2= new ArrayList<String[]>();
			
			System.out.println("test case 1");
			while((line1 = bufferedReader1.readLine()) != null ){
				System.out.println(line1);
				result1 = line1.split("\\s+");
				//System.out.println(result1);
				test_case1.add(result1);
			}
			System.out.println("test case 2");
			while((line2 = bufferedReader2.readLine()) != null){
				System.out.println(line2);
				result2 = line2.split("\\s+");
				test_case2.add(result2);
				
				//System.out.println(result2);
			}
			/*for(int i=0; i<test_case1.size();i++){
				System.out.println((test_case1.get(i)).toString());
			}*/
			System.out.println(Arrays.deepToString(test_case1.toArray()));
			System.out.println(Arrays.deepToString(test_case2.toArray()));
			bufferedReader1.close();
			bufferedReader2.close();
		}catch(FileNotFoundException ex){
			System.out.println("Unable to open file " + fileName1);
			System.out.println("Unable to open file " + fileName2);
		} catch (IOException e) {
			System.out.println("Error reading file " + fileName1);
			System.out.println("Error reading file " + fileName2);
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
