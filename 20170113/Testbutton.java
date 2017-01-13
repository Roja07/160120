import java.awt.*;
import javax.swing.*;

public class Testbutton{
	public static void main(String[] args) {
		TestbuttonMan tbm=new TestbuttonMan();

	}
}
class TestbuttonMan{
	JFrame frame;
	JButton button;
	JTextField fileName;		
	JPanel fieldPanel;	

	  public TestbuttonMan(){
	  	frame=new JFrame("Testbutton");
	  	frame.setLocation(400,400);
	    frame.setSize(400,400);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    button=new JButton("Click Me!");

	    Container con=frame.getContentPane();
	    con.setLayout(new GridLayout(2,1));
	    con.add(button);

	    frame.setVisible(true);
	}
}


