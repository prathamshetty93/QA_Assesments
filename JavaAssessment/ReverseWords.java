package JavaAssessment;


//Write a program to reverse each word in a sentence

public class ReverseWords {

    public static void main(String args[]) {
        String str = "hello hii tekion";
        String[] words = str.split(" ");
        String reversedString = "";
        for (String w : words) {
            String reversedWord = " ";
            for (int i = w.length() - 1; i >= 0; i--) {

                reversedWord  = reversedWord + w.charAt(i);
            }
            reversedString = reversedString + reversedWord + " ";

        }
        System.out.println(reversedString);
    }
}






