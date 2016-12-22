import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrameMan3{
	public static void main(String[] args) {
		
		FrameMan fm=new FrameMan();

	}
}
class FrameMan implements ActionListener{

	JFrame frame;
	JPanel panel;
	JLabel label;
   // ImageIcon icon;
	JButton button;
	int num=0;

	 public FrameMan(){
	 		 	openWindow();
	 }


	 	private void openWindow(){

	 	frame=new JFrame();
	 	frame.setLocation(200,300);
	 	frame.setSize(300,400);
	 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	frame.setTitle("WINDOW");

     //   icon=new ImageIcon("icon_128.png");
	 	panel=new JPanel();
	 	label=new JLabel("HELLO!");
        button=new JButton("Click_Me");
        button.addActionListener(this);

	 	panel.add(label);
	 	panel.add(button);
	 	frame.add(panel);



	 	frame.setVisible(true);
	 }
	 public void actionPerformed(ActionEvent e){

	 	if (num%2==0) {
	 		label.setText("Aoki");
	 	}else{	
	 	label.setText("SAROJ!");	
	 	}
	 	num++;
	 }
	 	
	 
}