/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoegame;

import javax.swing.JOptionPane;
import javax.swing.JButton;

/**
 *
 * @author IstipanyaGrasya
 */
public class TicTacToeGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        private String turn = "X";

    

    public void turn() {
        if (turn.equals("X")) {
            turn = "O";
        } else {
            turn = "X";
        }
    }

    private void reset() {
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");

    }

    private void xWins() {

        JOptionPane.showMessageDialog(this, "Player X Wins!");
        reset();
    }

    private void oWins() {

        JOptionPane.showMessageDialog(this, "Player O Wins!");
        reset();
    }

    private void winner() {
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();

        // x wins
        if (one == "X" && two == "X" && three == "X") {
            xWins();
        }
        if (four == "X" && five == "X" && six == "X") {
            xWins();
        }
        if (seven == "X" && eight == "X" && nine == "X") {
            xWins();
        }
        if (two == "X" && five == "X" && eight == "X") {
            xWins();
        }
        if (three == "X" && six == "X" && nine == "X") {
            xWins();
        }
        if (seven == "X" && five == "X" && three == "X") {
            xWins();
        }
        if (one == "X" && five == "X" && nine == "X") {
            xWins();
        }
        // o wins
        if (one == "O" && two == "O" && three == "O") {
            oWins();
        }
        if (four == "O" && five == "O" && six == "O") {
            oWins();
        }
        if (seven == "O" && eight == "O" && nine == "O") {
            oWins();
        }
        if (two == "O" && five == "O" && eight == "O") {
            oWins();
        }
        if (three == "O" && six == "O" && nine == "O") {
            oWins();
        }
        if (seven == "O" && five == "O" && three == "O") {
            oWins();
        }
        if (one == "O" && five == "O" && nine == "O") {
            oWins();

        }
    }
}
    
    

