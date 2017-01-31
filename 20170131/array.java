import java.io.*;
public class array{
	public static void main(String[] args) {
		String msg;
		Filewriter fw;
		Printwriter pw;


        System.out.print("入力してください！");
         msg=new java.util.Scanner(System.in).nextLine();
		System.out.println(msg);

		Filewriter fw=null;
		Printwriter pw=null;

		try{
			fw=new Filewriter("output.txt",true);
			pw=new Printwriter(fw);

			pw.println(msg);	
		}catch (IOException e){
			System.out.println("IO Error");
		}finally{
			fw.close();
			pw.close();

	//	}catch (IOException e){
			//System.out.println("IO Error");
		}
	}
}