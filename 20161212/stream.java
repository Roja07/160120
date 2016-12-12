import java.io.*;
import java.util.*;
  public class stream{
  public static void main(String[] args) {

  	String filename=args[0];
  	FileReader inFile;
  	int data;
  	int n=0;

  	try{
  		inFile=new FileReader(filename);
  		while((data=inFile.read()) !=-1){
  			System.out.print((char) data);
  			n++;
  		}
  		inFile.close();

  	}
  	catch (IOException e){
  		System.err.println("Error");
  		System.exit(1);

  	}
	}
}