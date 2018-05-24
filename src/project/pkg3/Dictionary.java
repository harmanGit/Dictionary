/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg3;

import java.util.LinkedList;

/**
 * Class creates a dictionary with is a array of linkedList of the type
 * Definition. Class also has a method called add which takes two parameter
 * "word" and "description" and creates the object definition and adds the
 * definition in the linkedList located in the array dictionary at the
 * index(index equals hashCode). Class also has a method called lookFor which
 * goes through the dictionary and returns the word and the description. But
 * requires a parameter "word" to locate the word and the description. The
 * hashCode of the parameter "word" is used to search. Lastly class has a
 * private hashCodeX method that uses the hashCode function from the java
 * library to convert the parameter "word" into a unique integer value
 *
 * @author harmanjeetdhillon
 */
public class Dictionary
{

    private int length; // length of the array
    private LinkedList<Definition>[] dic; // array of LinkedList of type Definition

    /**
     * Constructor creates the dictionary which is a array of LinkedList and has
     * a length of 50000
     */
    Dictionary(int l)
    {
        length = 50_000;
        dic = new LinkedList[length];
        for (int i = 0; i < length; i++)
        {
            dic[i] = new LinkedList();
        }
    }

    /**
     * Method uses the hashCode function from the java library to convert the
     * parameter "word" into a unique integer value. HasHvalue is used as the
     * index for the dictionary.
     *
     * @param word a string used in the hashCode function
     * @return a unique integer value from the hashCode function
     */
    private int hashCodeX(String word)
    {
        // converting "word" to a hashCode
        int hashValue = word.hashCode();

        // Checking to make sure the hashValue is not a negative number
        if (hashValue < 0)
        {
            hashValue = -hashValue; //converts negative hashValue into positive
        }
        // Checking to make sure the hashValue is not more than the length
        if (hashValue > length)
        {
            // divides by length and sets hashValue equal to the reminder
            hashValue %= length;
        }

        return hashValue;
    }

    /**
     * Adds the definition which is a object containing the word and the
     * description into the dictionary
     *
     * @param word a string used create the definition
     * @param desc a string used create the definition
     */
    public void add(String word, String desc)
    {
        Definition def = new Definition(word, desc);// Creating the object definition
        int hV = hashCodeX(word); // hashCode method used on the word
        // adding object definition in linkedList in the array dictionary at the 
        // index(index equals hashCode)
        dic[hV].add(def);
    }

    /**
     * Method goes through the dictionary and returns the word and the
     * description. But requires a parameter "word" to locate the word and the
     * description aka the definition. The hashCode of the parameter "word" is
     * used to search.
     *
     * @param word a string used to search the "word" in the dictionary for the
     * definition
     * @return a string which is the word and the description as a string from
     * the definition object
     */
    public String lookFor(String word)
    {
        int hV = hashCodeX(word); // hashCode method used on the word
        int size = dic[hV].size(); // size of the linkedList at the hashValue index
        String rDesc = ""; // Empty return string 

        // Checking to see if linkedList has more then on item. So checking if a
        // word has more than one description 
        if (size == 1)
        {
            // If size is one, then print the first and only value as a string. 
            // So if a word only has one definition only print that definition
            return rDesc = dic[hV].get(0).toString();
        } else // If the size is greater than one return all values
        // So if the word has more than one definition print all definitions
        {
            for (int i = 0; i < size; i++) // loop used to go through the linkedList
            {
                // Check if the parameter "word" is equal to the word in the dictionary
                if (word.equals(dic[hV].get(i).getWord()))
                {
                    rDesc += dic[hV].get(i).toString(); //retirn all definitions
                    if (size > i + 1)
                    {
                        rDesc += " * ";
                    }
                }
            }
        }

        // If now rDesc stays the same as when it was create, that means the
        // parameter"word" used in the lookFor method does not exist in the dictionary
        if (rDesc == "")
        {
            return "Null";
        }
        return rDesc;
    }
}
