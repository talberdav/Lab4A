/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4a2;
import java.util.*;
import java.io.*;
import static java.lang.System.out;
import java.time.*;
/**
 *
 * @author talberdav
 */
import java.sql.Time;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("You walk up to your Xbox, What game do you wanna play?");
    String game= scan.nextLine();
    switch(game)
    {    
        case "Fortnite": System.out.println("\nWHERE WE DROPPING BOYS");
            break;
        case "R6":  System.out.println("\nMay lord Chanka be on your side.");
            break;
        default:System.out.println("\nSorry, that game is not epic enough. Please try again.");
           
    
    
    
            
    }
    
}
