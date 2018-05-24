/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg3;

/**
 * Test program for the Dictionary and Definition class. Checks the add method
 * and lookFor method from Dictionary class.
 *
 * @author harmanjeetdhillon
 */
public class Project3
{
    
    public static void main(String[] args)
    {
        // Creating the dictionary object
        Dictionary dicTest = new Dictionary(50_000);
        // Testing the add method
        dicTest.add("Abomasum", "the fourth stomach of a ruminant, "
                + "such as a cow or sheep");
        dicTest.add("Alcazar", "a Spanish palace or fortres");
        dicTest.add("Umbriferous", "shady");
        dicTest.add("Superbious", "proud and overbearing");
        dicTest.add("Skelf", "Scottish a splinter or sliver of wood");
        // Testing if Dictionary allows a single word to contain multiply 
        // description.
        dicTest.add("QWERTY", "Definition 1");
        dicTest.add("QWERTY", "Definition 2");
        dicTest.add("QWERTY", "Definition 3");
        // Testing the lookFor for single word and description
        System.out.println(dicTest.lookFor("Abomasum"));
        System.out.println(dicTest.lookFor("Alcazar"));
        System.out.println(dicTest.lookFor("Umbriferous"));
        System.out.println(dicTest.lookFor("Skelf"));
        // Testing the lookFor for a single word to contain multiply
        System.out.println(dicTest.lookFor("QWERTY"));
    }

}
