package lab3;

import java.util.Scanner;

public class VowelConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the letter : ");
        char c = sc.next().charAt(0);
        switch(c){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Letter is vowel");
                break;

            default:
                System.out.println("Letter is consonant");
        }

    // using if else
    //		if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
    //			System.out.println("Letter is vowel");
    //		}
    //		else {
    //			System.out.println("Letter is consonant");
    //		}
    }
}
