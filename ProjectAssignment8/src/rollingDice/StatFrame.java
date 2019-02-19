/*
 ============================================================================
 Name        : Program Assignment 8
 Author      : Nicholas Bravata
 Class		 : CPS240
 CRN		 : 22359097
 Date		 : 11/29/2018
 Description : The Frequency GUI for the assignment
 ============================================================================
 */
package rollingDice;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class StatFrame extends JFrame{

	JTextArea text = new JTextArea();

	public StatFrame(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(350, 350);
		
		text.setFont(new Font("TimesRoman",Font.PLAIN, 28));
		text.setForeground(Color.BLACK);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		add(text);
		
	}//End StatFrame Constructor
	
	public JTextArea getText() {
		return text;
	}
}
