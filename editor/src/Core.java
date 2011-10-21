import javax.swing.*;
import java.awt.*;
public class Core extends JFrame {
	public static JPanel drawArea = new JPanel(); //JPanel drawArea which can display image
	 public static void main (String[] args) {
		  new Core();
	 }
	
	 public Core()  {
		 Container content = getContentPane(); 
		 content.setBackground(Color.LIGHT_GRAY); //setting background color to Gray
		 JPanel controlArea = new JPanel(new GridLayout(3,1)); // JPanel for controls
		 			
		 
		 controlArea.add(new FileTree()); //adding FileTree control 
		 add(controlArea, BorderLayout.EAST);
		 
		 
		 drawArea.setPreferredSize(new Dimension(400, 0));
		 drawArea.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		 drawArea.setBackground(Color.white);
		 drawArea.add(new DrawImage()); //adding DrawImage control which displays images to drawArea JPanel 
		 add(drawArea, BorderLayout.WEST);
		 pack();
		 setVisible(true);
	 }
	 
}
