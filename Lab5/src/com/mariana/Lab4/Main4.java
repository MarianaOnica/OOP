package com.mariana.Lab4;
import java.io.*;
import java.util.*;

public class Main4 {
    public static void main(String[] args) throws Exception {

        // We need to provide file path as the parameter:
        // double backquote is to avoid compiler interpret words
        // like \test as \t (ie. as a escape sequence)
        File file = new File("D:\\Calculatorul Meu\\Faf 171\\OOP\\one_expression.txt");
        //File file = new File("D:\\Calculatorul Meu\\Faf 171\\OOP\\three_expression.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }


        Scanner scanner = new Scanner(file);
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        String theString;

        theString = scanner.nextLine();
        while (scanner.hasNextLine()){
            theString = theString + "\n" + scanner.nextLine();
        }

        char[] charArray = theString.toCharArray();

        for( int i = 0; i < charArray.length; ++i){
            if (charArray[i] == '(') {
                stack.push(charArray[i]);
            }
            if (charArray[i] == ')'){
                if (stack.isEmpty()) {
                    stack2.push(charArray[i]);
                }
                else {
                    stack.pop();
                }
            }
        }

        if (stack.contains('(')) {
            System.out.println("The expression contains more " + stack.size() + " ) paranthases");
        }
        else {
            if (stack2.contains(')')) {
                System.out.println("The expression contains more " + stack2.size() + " ( paranthases");
            } else {
                System.out.println("The paranthases are put correct in this expression");
            }
        }
    }
}