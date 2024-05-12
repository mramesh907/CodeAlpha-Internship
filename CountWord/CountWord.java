package CountWord;
import java.util.Scanner;
public class CountWord {
    void takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Paragraph:");
        String paragraph=sc.nextLine().trim();
        System.out.println("Given Paragraph: "+paragraph);
        int space=0;
        for(int i=0;i<paragraph.length();i++){
            if(paragraph.charAt(i)==' ' && paragraph.charAt(i+1)!=' '){
                space++;
            }
        }
        System.out.println("Number of words:"+(space+1));

    }
    public static void main(String[] args) {
        CountWord countWord=new CountWord();
        countWord.takeInput();
    }
}
