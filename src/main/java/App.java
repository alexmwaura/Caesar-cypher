import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    private static String endocrypt ="null";
    public static void endoCrypt(String sentence, int shiftInteger, String option){
        CaesarCypher caesarCypher = new CaesarCypher();
        if(shiftInteger > 25){
            System.out.println("Shift value must be between 0 to 25");
        }
        endocrypt = caesarCypher.encryptDecrypt(sentence, shiftInteger, option);
        System.out.println("---- Your result is ----");
        System.out.println(endocrypt);
        System.out.println("-----------------------");
        System.out.println("-----------------------");
    }
     public static void main(String[] args) {
        boolean caephar = true;
        while (caephar){
            System.out.println("Hello welcome to caesar caephar");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("--------------------------");
                System.out.println("Choose to encrypt, decrypt or exit");
                String userOption = bufferedReader.readLine();
                if(userOption.equals("encrypt")){
                    System.out.println("Enter a word or sentence you want to encrypt");
                    String encryptString = bufferedReader.readLine();
                    System.out.println("Enter the shift value between 0 to 25");
                    int shiftInteger = Integer.parseInt(bufferedReader.readLine());
                    endoCrypt(encryptString,shiftInteger,userOption);
                }else if(userOption.toLowerCase().equals("decrypt")){
                    if(endocrypt.equals("null")){
                        System.out.println("Enter a word or sentence you want to decrypt");
                        String decryptString = bufferedReader.readLine();
                        System.out.println("Enter the shift value between 0 to 25");
                        int shiftInteger = Integer.parseInt(bufferedReader.readLine());
                        endoCrypt(decryptString,shiftInteger,userOption);
                    }else if(!endocrypt.equals(null)){
                        System.out.println("Enter the shift value between 0 to 25");
                        int shiftInteger = Integer.parseInt(bufferedReader.readLine());
                        endoCrypt(endocrypt,shiftInteger,userOption);
                    }
                }
                else if(userOption.toLowerCase().equals("exit")){
                    System.out.println("Thank you");
                    caephar = false;
                }
                else {
                    System.out.println("Your option is not recognized in the system");
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
