import java.util.Scanner;
public class MessageAnalyser {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the message:");
        String message = scanner.nextLine().toLowerCase();
        int vowels = 0, cosonants = 0;
        for(char ch : message.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch)!=-1){
                    vowels++;
                }else{
                    cosonants++;
                }
            }
        } 
        System.out.println("Vowels:"+vowels+",Cosonants:"+cosonants);
        scanner.close();
    }
    
}
