import java.awt.*;
import javax.swing.*;

public class AlohaWindow2{
	
		static JFrame frame;
		static JLabel label;
		static JButton button;
		static Container ctnr;

	public static void main(String[] args) {
	    frame=new JFrame();

		frame.setSize(400,200);

		frame.setTitle("アオキ！");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(new FlowLayout());


		JLabel label=new JLabel("HI");
	
		JButton button=new JButton("Click して！");
	
         ctnr=frame.getContentPane();
         ctnr.add(label);
         ctnr.add(button);

		frame.setVisible(true);
		}
	}
