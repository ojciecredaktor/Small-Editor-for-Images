import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxPanel extends JPanel implements ActionListener {
	
	/*-----------------------*/
	/* Variables declaration */
	/*-----------------------*/
	
	private JLabel fontSizeLabel = new JLabel(); 
	private JLabel textOption = new JLabel(); // JLabel for text options
	private String[] fontSizeText = {"12","14","16","18","20","24","28","30"}; //array of font sizes
	private int fontSize[] = {12,14,16,18,20,24,28,30}; //integer array of font sizes
	private JComboBox coreComboBox = new JComboBox();	//declaration of combo box
	
	/*---------------------------*/
	/* radio buttons for options */
	/*---------------------------*/
	private JRadioButton bold = new JRadioButton("Bold"); //radio buttons for options
	private JRadioButton italic = new JRadioButton("Italic");
	private JRadioButton underline = new JRadioButton ("Underline") ;
	
	public ComboBoxPanel(String title){
		super(new GridLayout(1,2));
		setBackground(Color.LIGHT_GRAY);
		setBorder(BorderFactory.createTitledBorder(title));
		
		for(int i=0;i<8;i++){
			coreComboBox.addItem(fontSizeText[i]);
		}
		
		
		coreComboBox.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		fontSizeLabel.setText("Font "+ fontSizeText[coreComboBox.getSelectedIndex()]);
		}
		});
		
		bold.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e){
				textOption.setText("Bold");
			}
		});
		
		italic.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e){
				textOption.setText("Italic");
			}
		});
		
		underline.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e){
				textOption.setText("Underline");
			}
		});
		
		add(fontSizeLabel);
		add(textOption);
		add(coreComboBox);
		add(bold);
		add(italic);
		add(underline);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	 
}
