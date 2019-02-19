/*
 ============================================================================
 Name        : Program Assignment 8
 Author      : Nicholas Bravata
 Class		 : CPS240
 CRN		 : 22359097
 Date		 : 11/29/2018
 Description : Dice class for the assignment. Takes the face value of the die
 			   and also an image of that face value.
 ============================================================================
 */
package rollingDice;

import javax.swing.ImageIcon;

public class Die {
	int face;
	ImageIcon img;
	Die(int Face, ImageIcon Img){
		this.face = Face;
		this.img = Img;
	}
	
	public int getFace() {
		return face;
	}
	public ImageIcon getImg() {
		return img;
	}
	
}
