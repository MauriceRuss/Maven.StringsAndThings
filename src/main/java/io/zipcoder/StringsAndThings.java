package io.zipcoder;


import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        /*int yzCount = 0;
        input = input.toLowerCase() + " ";


        for (int counter = 0; counter < input.length() - 1; counter++) {

                if (input.charAt(input.length() - 1) == 'z' || input.charAt(input.length() - 1) == 'y') {
                    yzCount++;
                }
            }
        System.out.println(yzCount);*/
        int count = 0;
        char charZ = 'z';
        char charY = 'y';
        for(int q = 0; q < input.length(); q++ ){
            if((input.charAt(q)== charY)  ||  input.charAt(q) == charZ){
                count++;

            }
        }

            return count;
        }


    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */


    public String removeString(String base, String remove) {
        return base.replaceAll(remove, "");
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    //go through string
    // match if is pattern and not happens
    //return a boolean response if pattern occurs
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        input = input.toLowerCase();
        input = input.replaceAll("x", "");
        input = input.replaceAll("y", "");
        input = input.replaceAll("is", "x");
        input = input.replaceAll("not", "y");
        int x = 0;
        int y = 0;
        for(int q = 0; q < input.length(); q++){
            if(input.charAt(q) == 'x'){
                x++;
            } else if (input.charAt(q) == 'y'){
                y++;
            }
        }


        return x == y;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        char[] arr = input.toCharArray();
        for(int q = 1; q < arr.length -2; q++){
            if(arr[q] == 'g'){
                if(!(arr[q-1] == 'g' || arr[q + 1] == 'g')){
                    return false;
                }
            }
        }
        return true;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        int count = 0;
        for (int q = 0; q <= input.length() - 3; q++) {
            if (input.charAt(q) == input.charAt(q + 1) && input.charAt(q) == input.charAt(q + 2)) {
                count++;

            }
        }
        return count;
    }
}
