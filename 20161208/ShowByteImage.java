import java.io.*;
public class ShowByteImage{
	public static void main(String[] args) {
		
FileInputStream inFile=null;
try{
	inFile =new FileInputStream("wallpaper.jpg");
	int data=inFile.read();
	System.out.println(data);
	inFile.close();


}catch(IOException e){
	System.err.println("Error");
	System.exit(1);
}
}
}