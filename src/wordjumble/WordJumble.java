/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordjumble;
import javax.swing.*;

/**
 *
 * @author Gloria Song
 * Date : 2018/11/4
 */
public class WordJumble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              String letters = JOptionPane.showInputDialog("Please enter a word: ");
              jumbleWords(letters, "");
    }

        //input parameters
        //word - the remaining letters in the word still to jumble
        //jumbLet - the letters already used to create
        //the jumbled word
    public static void jumbleWords(String word, String jumbLet) {
        int pos;
        String remainingLetters;
        String origWord = word;
        String origJumbledLetters = jumbLet;
        if (word.length() == 1) {
            System.out.println(jumbLet + word);
    }   else {
            for (pos = 0; pos < origWord.length(); pos++) {
                remainingLetters = origWord.substring(0, pos)
                + origWord.substring(pos + 1, origWord.length());
            //recursive call to jumbleWords()
            jumbleWords(remainingLetters,origJumbledLetters + origWord.charAt(pos));
      }
    }
    }
    
}
