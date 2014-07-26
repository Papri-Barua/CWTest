package text.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	/**
	 * This class contains a main method which will be able to read a file.
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException{
		/* Use java API to read a file from external sources(can be a text file 
		 * in your documents folder)
		 * You must use Try...catch and finally block.
		 * You must use while loop.Use String array for extra credit.
		 */
		BufferedReader br=null;
		String filename =("C:/Users/prithul/myworkspace/Hello1.txt");
		
		String reader= "";
		
		FileReader fr = new FileReader(filename);
		br = new BufferedReader (fr);


try
{   
		    while ((reader = br.readLine()) != null) {
			        System.out.println(reader);
		           }
		     }catch (IOException ex){
		    	 System.out.println("invalid location");
		    	 ex.printStackTrace();
		     }finally{
		    	 
		    	 try{
		    		 if(br!=null)
		    			 br.close();}
		    		 catch(Exception ex){
		    			 ex.printStackTrace();
		    		 }
		    	 }
		     }
		     
  
}

