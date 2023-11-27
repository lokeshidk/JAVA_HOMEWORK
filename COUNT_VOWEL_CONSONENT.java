import java.util.Scanner;
public class COUNT_VOWEL_CONSONENT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ënter a word");
        String word=input.nextLine();
        int vowel_count=0;
        int consonent_count=0;

        for (int i=0; i<word.length();i++){
            if (word.toLowerCase().charAt(i)=='a'||word.toLowerCase().charAt(i)=='e'||word.toLowerCase().charAt(i)=='i'||word.toLowerCase().charAt(i)=='o'||word.toLowerCase().charAt(i)=='u'){
            vowel_count=vowel_count+1;
            }
            else {
                consonent_count=consonent_count+1;
            }
        }
        System.out.println("vowel count is "+vowel_count);
        System.out.println("consonent count is "+ consonent_count);

    }
}
