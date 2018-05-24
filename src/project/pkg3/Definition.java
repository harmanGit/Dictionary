package project.pkg3;

/**
 * Class is used to create the object Definition which holds word and
 * description. The definition object requires two parameter as strings(word,
 * description) to be created. Class also has a toString method that converts
 * definition into a string.
 *
 * @author harmanjeetdhillon
 */
public class Definition
{

    private String word; // Word for the definition
    private String desc; // Description for the definition

    /**
     * Constructor creates a Definition object by storing the two parameters
     * "word" and "description".
     *
     * @param w a string "word" used to create the definition object
     * @param d a string "description" used to create the definition object
     */
    Definition(String w, String d)
    {
        word = w;
        desc = d;
    }

    /**
     * Method simply returns "word" from the object definition, which contains
     * word and the description
     *
     * @return a string which is the "word" from the definition object
     */
    public String getWord()
    {
        return word;
    }

    /**
     * Method simply returns "description" from the object definition, which
     * contains word and the description
     *
     * @return a string which is the "description" from the definition object
     */
    public String getDesc()
    {
        return desc;
    }

    /**
     * Method used to return the word and the description as a string from the
     * definition object
     *
     * @return a string which contains the word plus description
     */
    @Override
    public String toString()
    {
        return word + ": " + desc;
    }
}
