import java.sql.CallableStatement;
import java.util.Scanner;

public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        //your code here
        for(int i = 0; i < s.length(); i++){ // creates loop that assigns indexes to each character in the string
            char letter = s.charAt(i); // assigns char "letter" to the character returned at every index
            if(letter == 'a'||letter == 'e'||letter == 'i'||letter == 'o'||letter == 'u'){ // if char "letter" is equal to a vowel follow next line
                answer++; // add increment of 1 to int "answer"
            }
        }

        return answer; // returns int "answer" when method problemOne is used
    }
    //Code your solution to problem number two here
    static int problemTwo(String s){
        int answer = 0;
        //your code here
        String bob = "bob"; // stores "bob" under string bob
        for(int i = 0; i < s.length()-2; i++){ // creates loop that assigns values until the third last character, exempting last two.
            if(s.substring(i, i+3).equals(bob)){ // if an index to an index +3's values are equal to string bob, follow next line
                answer++; // add  increment of 1 to int "answer"
            }
        }
        return answer; // returns int "answer" when method problemTwo is used
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        //your code here
        /** Ingredients **/
        String longestSubstring = ""; // will store temporary longest alphabetical string as string longestString
        String tempString = ""; // will store temporary longest string as string tempString
        int nums = 0; // stores int "nums" as zero
        int previousNums = 0; // stores int "previousNums" as zero

        for(int i = 0; i < s.length(); i++){ // creates a loop that assigns indexes to each character in the string
            for (int k = 0; k < 27; k++) { // creates a loop that assigns indexes to each character in the alphabet
                // if an index in a substring is a certain letter, assigns corresponding number to nums (for all 27 letters below)
                if (s.substring(i, i +1).equals("a")){
                    nums = 1;
                }if (s.substring(i, i +1).equals("b")) {
                    nums = 2;
                }if (s.substring(i, i +1).equals("c")) {
                    nums = 3;
                }if (s.substring(i, i +1).equals("d")) {
                    nums = 4;
                }if (s.substring(i, i +1).equals("e")) {
                    nums = 5;
                }if (s.substring(i, i +1).equals("f")) {
                    nums = 6;
                }if (s.substring(i, i +1).equals("g")) {
                    nums = 7;
                }if (s.substring(i, i +1).equals("h")) {
                    nums = 8;
                }if (s.substring(i, i +1).equals("i")) {
                    nums = 9;
                }if (s.substring(i, i +1).equals("j")) {
                    nums = 10;
                }if (s.substring(i, i +1).equals("k")) {
                    nums = 11;
                }if (s.substring(i, i +1).equals("l")) {
                    nums = 12;
                }if (s.substring(i, i +1).equals("m")) {
                    nums = 13;
                }if (s.substring(i, i +1).equals("n")) {
                    nums = 14;
                }if (s.substring(i, i +1).equals("o")) {
                    nums = 15;
                }if (s.substring(i, i +1).equals("p")) {
                    nums = 16;
                }if (s.substring(i, i +1).equals("q")) {
                    nums = 17;
                }if (s.substring(i, i +1).equals("r")) {
                    nums = 18;
                }if (s.substring(i, i +1).equals("s")) {
                    nums = 19;
                }if (s.substring(i, i +1).equals("t")) {
                    nums = 20;
                }if (s.substring(i, i +1).equals("u")) {
                    nums = 21;
                }if (s.substring(i, i +1).equals("v")) {
                    nums = 22;
                }if (s.substring(i, i +1).equals("w")) {
                    nums = 23;
                }if (s.substring(i, i +1).equals("x")) {
                    nums = 24;
                }if (s.substring(i, i +1).equals("y")) {
                    nums = 25;
                }if (s.substring(i, i +1).equals("z")) {
                    nums = 26;
                }
            }
            if (nums >= previousNums) { // if nums is greater than or equal to previousNums, follow next line
                tempString = tempString + s.substring(i, i+1); // adds the evaluated index to tempString and stores it as tempString.
                previousNums = nums; // stores num that has just been cycled through as previousNums
            }
            else if (tempString.length() > longestSubstring.length()){ // if the length of the temp string is longer than the current longest alphabetical substring, follow next line
                longestSubstring = tempString; // store the previously tempString as the new "longestSubstring".
                tempString = "" + s.substring(i, i+1); // resets tempString for next substring
                previousNums = nums; // stores num that has just been cycled through as previousNums
            }
            else{ // if any other possible outcome occurs, follow next line of code
                tempString = "" + s.substring(i,i+1); // resets tempString for next substring
                previousNums = nums; // stores num that has just been cycled through as previousNums
            }
        }
        if (tempString.length() > longestSubstring.length()){ // if tempString is longer than longestString, follow next line of code
            longestSubstring = tempString; // store tempString as longestSubstring
        }
        s = longestSubstring; // stores longestSubstring as "s"
        return s; // returns s when method "problemThree" is used
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        System.out.println("Please type in the word you would like to evaluate.");
        Scanner scan = new Scanner (System.in);
        String s = scan.next();
        System.out.println("Number of vowels: " + problemOne(s));
        System.out.println("Number of times 'bob' occurs: " + problemTwo(s));
        System.out.println("Longest substring in alphabetical order: " + problemThree(s));


    }
}