/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correll_4_guessinggame;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author acorrell5106
 */
public class Correll_4_guessinggame {

    /**
     * @param args the command line arguments
     */
    static boolean youWon = false;
    static String yourname;
    static Random randomNumber = new Random();
    static int i = randomNumber.nextInt(100) + 1;
    static int guesses = 10;
    
    public static void main(String[] args) {
        Scanner muffins = new Scanner(System.in);
        System.out.println("What's your name?");
        yourname = muffins.nextLine();
        System.out.println("Hello " + yourname + "!");     
        while (!youWon && guesses >= 0) {
            pickNumber();
        guesses-- ;
    }
    }
    
static void pickNumber() {
    System.out.println("Pick a Number, any Number!");
    Scanner guess = new Scanner(System.in);
    int g = guess.nextInt();
    if (i == g) {
        System.out.println("You Win, " + yourname + "!" + "\n The lucky number was " + i + "." + "\n You finished with " + guesses + " guesses left.");
        youWon = true;
    } else if (i > g) {
        System.out.println("Too Low!" + "\n You have " + guesses + " guesses left.");
    } else {
        System.out.println("Too High!" + "\n You have " + guesses + " guesses left.");
    }
    if (guesses == 0) {
        System.out.println("You don't have any more guesses left! You Lose!");
        youWon = true;
        }
    }
}

