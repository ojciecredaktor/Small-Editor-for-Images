import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DrawImage extends JPanel implements ListSelectionListener{
	
	/*-----------------------*/
	/* Variables declaration */
	/*-----------------------*/
	
	String fileName = new String(); // variable to set FileName for picLabel
	FileTree first = new FileTree(); //declaration of file_tree class
	JLabel picLabel = new JLabel();	
	
	public DrawImage() {		
		add(picLabel); //adding label to display in drawArea container of core class
		
	}
	
	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}	
	
}
