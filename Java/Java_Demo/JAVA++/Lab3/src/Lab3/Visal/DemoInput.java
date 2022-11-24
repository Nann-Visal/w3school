package Lab3.Visal;

import java.util.Scanner;

public class DemoInput {
    public static void main(String[] arg){
        char character;
        int sumConsonant=0;
        int sumVowel=0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter char : ");
            String text = scanner.next();
            character=text.charAt(0);
            if(Character.isUpperCase(character) )break;
            if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
                sumVowel += 1;
            }
            else{
                sumConsonant += 1;

            }
        }while(Character.isAlphabetic(character));
        System.out.println("Vowel = " + sumVowel);
        System.out.println("Consonant = " + (sumConsonant));//we minus 1 from sumConsonant because in the final od character is digit
    }
}
