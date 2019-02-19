/*
 ============================================================================
 Name        : Program Assignment 8
 Author      : Nicholas Bravata
 Class		 : CPS240
 CRN		 : 22359097
 Date		 : 11/29/2018
 Description : This class is the main gui for this assignment. Allows user to 
 			   click JButtons and select amount of die to roll. Displays the
 			   sum of the die rolled as well as the individual images of each
 			   die.
 ============================================================================
 */
package rollingDice;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GameFrame extends JFrame{
	
		int[] di = {1,2,3,4};
		
		JTextField text = new JTextField();
		Choice numDice = new Choice();
		JButton freq = new JButton("Freq");
		JButton roll = new JButton("Roll!");
		JPanel imagePanel = new JPanel(new GridLayout());
		JPanel buttonPanel = new JPanel(new GridLayout());
		JLabel label;
		
		public GameFrame(String title) {
			
			super(title);
			
			//Basic settings for setting up the GUI
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(600, 400);
			setLayout(new BorderLayout());
				
			//Add panels to Frame
			add(imagePanel, BorderLayout.CENTER);
			add(buttonPanel, BorderLayout.SOUTH);
			numDice.setFont(new Font("TimesRoman", Font.BOLD, 18));
		
			
			//Adds choices to numDice
			for(int i: di) {
				numDice.add(i + " Dice");
			}
			
			//Add Buttons to button panel
			buttonPanel.add(freq, BorderLayout.WEST);
			buttonPanel.add(roll, BorderLayout.CENTER);
			buttonPanel.add(numDice, BorderLayout.EAST);
			
			//Settings for the text textField that holds the solution.
			text.setFont(new Font("TimesRoman", Font.BOLD, 34));
			text.setForeground(Color.BLUE);
			text.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			text.setHorizontalAlignment(JTextField.CENTER);
			text.setEditable(false);
			text.setPreferredSize(new Dimension(70,70));
			add(text, BorderLayout.NORTH);
			
			
		}

		public JPanel getImagePanel() {
			return imagePanel;
		}

		//Getters
		public JTextField getText() {
			return text;
		}

		public Choice getNumDice() {
			return numDice;
		}

		public JButton getFreq() {
			return freq;
		}

		public JButton getRoll() {
			return roll;
		}
		public int[] getDi() {
			return di;
		}
		
		
		
}
