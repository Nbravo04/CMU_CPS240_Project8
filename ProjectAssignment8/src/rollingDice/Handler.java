/*
 ============================================================================
 Name        : Program Assignment 8
 Author      : Nicholas Bravata
 Class		 : CPS240
 CRN		 : 22359097
 Date		 : 11/29/2018
 Description : This class handles the GUI and checks user inputs and updates 
 			   text areas in the GUIs. Also casts images of the die to the GUI
 ============================================================================
 */
package rollingDice;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Handler implements ActionListener, ItemListener{

	//Global Variables
	GameFrame gameGUI;
	StatFrame freqGUI;
	JTextArea freqArea;
	JTextField solText;
	int[] numDiceChoice;
	int[] freqArr = {0,0,0,0,0,0};
	int sum;
	int numberOfdi = 1;
	JLabel label;
	ArrayList <JLabel> labels = new ArrayList<JLabel>();
	Random roll = new Random();
	JPanel panel;
	
	//Constructor
	public Handler(GameFrame gameGUI, StatFrame freqGUI) {
		
		this.gameGUI = gameGUI;
		this.freqGUI = freqGUI;
		
		freqArea = freqGUI.getText();
		solText = gameGUI.getText();
		numDiceChoice = gameGUI.getDi();
		panel = gameGUI.getImagePanel();
		
		gameGUI.freq.addActionListener(this);
		gameGUI.roll.addActionListener(this);
		gameGUI.numDice.addItemListener(this);
		
	}//End Constructor

	//ActionListener for JButtons
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		JButton jb = (JButton)source;
		
		if(jb.getText() == "Roll!") {
			
			sum = 0;
			int rolls = 0;
			int n;
			
			
			panel.removeAll();
			panel.revalidate();
			panel.repaint();
			
			//gets all images for rolls. blah blah blah -sorry allen 
			while(rolls < numberOfdi) {
				n = roll.nextInt(6)+1;
				updateFrequency(n);
				sum += n;
				ImageIcon icon = new ImageIcon(n + ".png");
				// Scale the image to fit nicely in the frame
				Image img = icon.getImage();
				img = img.getScaledInstance(75, 73, Image.SCALE_SMOOTH);
				ImageIcon newIcon = new ImageIcon(img);
				// Set the image in the frame's JLabel
				label = new JLabel("", SwingConstants.CENTER);
				labels.add(label);
				panel.add(label, BorderLayout.CENTER);
				label.setIcon(newIcon);
				rolls++;
			}//End While
			setFreqTA();
			solText.setText("You got " + sum + "!");
		}//End if
		
		else {
			freqGUI.setVisible(true);				
		}//End Else

	}
	
	@Override
	//checks to see the ammount of die being rolled.
	public void itemStateChanged(ItemEvent e) {
		Object item = e.getSource();
		Choice c = (Choice)item;
		numberOfdi = Integer.parseInt(c.getSelectedItem().substring(0, 1));
	}//End itemStateChanged
	
	//Updates each die's frequency in the array
	public void updateFrequency(int n) {
		freqArr[n-1] += 1;
	}
	
	//Sets the text for the frequency list 
	public void setFreqTA() {
		freqArea.setText("Die 1 was rolled " + freqArr[0] + " times.\n" +
						 "Die 2 was rolled " + freqArr[1] + " times.\n" +
						 "Die 3 was rolled " + freqArr[2] + " times.\n" +
						 "Die 4 was rolled " + freqArr[3] + " times.\n" +
						 "Die 5 was rolled " + freqArr[4] + " times.\n" +
						 "Die 6 was rolled " + freqArr[5] + " times.");
	}
	
}
		
