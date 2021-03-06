import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class TextEditor{
	public static void main(String[] args) {
		TextEditorMan man=new TextEditorMan();
	}
}

class TextEditorMan implements ActionListener{
	JFrame frame;
	JTextField fileName;
	JPanel fieldPanel;
	JButton buttonOpen;
	JButton buttonSave;
	JTextArea textArea;		
	JScrollPane scrollPane;

	public TextEditorMan(){
		frame=new JFrame("TextEditor");
		frame.setLocation(400,400);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		fileName=new JTextField("ALOHA",10);
		fieldPanel=new JPanel();


		buttonOpen=new JButton("開く");
	    buttonOpen.addActionListener(this);
		buttonOpen.setActionCommand("open");
		buttonSave=new JButton("保存");
		buttonSave.addActionListener(this);
		buttonSave.setActionCommand("save");

		textArea=new JTextArea(10,30);
		scrollPane = new JScrollPane(textArea);

        fieldPanel.add(fileName);
        fieldPanel.add(buttonOpen);   
        fieldPanel.add(buttonSave);
    

        Container con=frame.getContentPane();
        con.setLayout(new GridLayout(2,1));
        con.add(fieldPanel);
	    con.add(scrollPane);


        frame.setVisible(true);
			}
	  public void actionPerformed(ActionEvent ae) {
		String cmd = ae.getActionCommand();

			if(cmd.equals("open")){
				textArea.append("開く"+'\n');

				FileReader fr;
				BufferedReader br;
				try{
					String textFileName=fileName.getText();

					fr=new FileReader(textFileName);
					br=new BufferedReader(fr);

					String data;
					while((data=br.readLine()) !=null){
					textArea.append(data+'\n');
				}

				}catch (IOException e){
					System.out.println("IO error.");
				}
				
			} else if(cmd.equals("save")) {
            String textFileName=fileName.getText();

            FileWriter fw=null;
            PrintWriter pw=null;

            try{
            	fw=new FileWriter(textFileName);
            	pw=new PrintWriter(fw);

            	String data=textArea.getText();

                  pw.println(data);
            	} catch(IOException e) {
					System.out.println("IO error.");
				}finally{
					try{
						pw.close();
						fw.close();
				}catch(IOException e){
					System.out.println("IO Error.");
				}
				}

            }

		}	  
	}

