import java.awt.*;
import javax.swing.*;

public class Quiz{
	public static void main(String[] args) {
		
		FrameMan fm=new FrameMan();

	}
}
class FrameMan{

	JFrame frame;
	JPanel panel;
	JLabel label;

	 public FrameMan(){
	 	System.out.println("Quiz やりますか？");
	 	openWindow();
	 }


	 	private void openWindow(){

	 	frame=new JFrame();
	 	frame.setLocation(200,300);
	 	frame.setSize(300,400);
	 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	frame.setTitle("QUIZ");

	 	panel=new JPanel();
	 	label=new JLabel("Quiz やりますか？");
	 	panel.add(label);
	 	frame.add(panel);

	 	frame.setVisible(true);
	 }
	}