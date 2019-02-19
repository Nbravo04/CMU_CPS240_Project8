/*
 ============================================================================
 Name        : Program Assignment 8
 Author      : Nicholas Bravata
 Class		 : CPS240
 CRN		 : 22359097
 Date		 : 11/29/2018
 Description : Main for the assignment. Initiates Handler and both GUIs
 ============================================================================
 */
package rollingDice;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameFrame gui = new GameFrame("Dice rolling!");
		StatFrame fgui = new StatFrame("Frequency");
		Handler eventHandler = new Handler(gui, fgui);
		
		gui.setVisible(true);
		
		
	}

}
