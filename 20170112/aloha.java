public class aloha{
	public static void main(String[] args) {
		Alohaman am=new Alohaman();
		am.sayHello(90,3);
	}
}
  class Alohaman{
	private String msg;
	private String msg2;
	public Alohaman(){
		this.msg = "ALOHA!";
		this.msg2 ="アロハ!";
  }
  public void sayHello(){
	System.out.println(this.msg);
  }

  public void sayHello(int num){
  	for (int i=0;i<num ; i++) {
   	  System.out.println(i + this.msg);
  }
}
  public void sayHello(int num,int x){
  	for (int i=0;i<num; i++ ) {
  		if (i%x ==0) {
         System.out.println(i+this.msg2);  			
  		}else{
  			System.out.println(i+this.msg);
  		}
  	}
  }
}
