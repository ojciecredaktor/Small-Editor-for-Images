import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class FileTree extends JPanel implements ListSelectionListener{
	
	/*-----------------------*/
	/* Variables declaration */
	/*-----------------------*/
	
	public JList dataList; //list declaration
	public JLabel label1 = new JLabel(); //label declaration for testing ListSelectionListener
	public File my_dir; //variable for directory setting
	public String[] filenames_in_dir; //array for items in directory
	public JScrollPane scrollPane;
	public static String text = new String(); // variable for getting value from ListSelectionListener
	  
	
	public FileTree(){
		
		setBackground(Color.LIGHT_GRAY); //setting background color of component
		setBorder(BorderFactory.createTitledBorder("Lista")); //setting border of components and title
		
		my_dir = new File("backgrounds"); //setting directory
		assert(my_dir.exists()); 		  //check the directory exists
		assert(my_dir.isDirectory());     // and is actually a directory
		filenames_in_dir = my_dir.list(); //copy list of files to array
		
		dataList = new JList(filenames_in_dir); // setting array to list
		
		scrollPane = new JScrollPane(dataList); // Scroll Panel for dataList
		scrollPane.setPreferredSize(new Dimension(250,80)); // preffered size for scrollPane
		scrollPane.setViewportView(dataList); 
		
		dataList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION); //setting selection mode to Single Interval		 
		 	
		/*---------------------------------*/
		/* Initiating ListSelectioListener */
		/*---------------------------------*/
		
		ListSelectionListener lListener = new ListSelectionListener() { //declaring ListSelectionListener for dataList
			
			public void valueChanged(ListSelectionEvent e) { //internal function for getting value from dataList
				dataList = (JList) e.getSource();
				
				if((dataList.isSelectionEmpty())){ // check if item is not selected
					
				} else { // if item is selected get selected value
					 
					text(dataList.getSelectedValue().toString()); // Call of Text Function which returns value
					
				}  
				
			}
			
		};
		dataList.addListSelectionListener(lListener);	//adding ListSelectionListener to class	
		
		/*
		/*  
		 */
		

		
		
		add(scrollPane); //adding dataList
		add(label1); // adding test label 
		 
		 
	}
	
	/*--------------------*/
	/*     Methods        */
	/*--------------------*/
	
	public String text(String text){ //function which displays current selected item on dataList
		 
		 label1.setText(text); // setting text in label1
		 return text;
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		
	}
	
	
}
