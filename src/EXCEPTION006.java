import java.util.Scanner;

class NotContainVowelException extends Exception{
    public NotContainVowelException(String massage){
        super(massage);
    }
}
public class EXCEPTION006 {

    public static void checkVowel(String word) throws NotContainVowelException{
        String lowerCaseWord = word.toLowerCase();

        if(lowerCaseWord.contains("a") || lowerCaseWord.contains("e") || lowerCaseWord.contains("i") || lowerCaseWord.contains("o") || lowerCaseWord.contains("u")){
            System.out.println("String has vowels");
        }
        else{
            throw new NotContainVowelException("String not contain vowels");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- >0){
            String word = sc.nextLine();
            try{
                checkVowel(word);
            }
            catch(NotContainVowelException e){
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}
//Nguyên âm -- lưu  ý