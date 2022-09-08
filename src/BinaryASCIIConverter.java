import java.util.Locale;
import java.util.Scanner;

public class BinaryASCIIConverter {


    private static Scanner sc = new Scanner(System.in);

    public static void run(){

        System.out.println("""
                1. Text to Binary
                2. Binary to Text 
                3. Quit
                Enter choice:\s
                """);
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            textToBinary();
        }
        else if (choice ==2){
            binaryToText();
        }
    }

    private static void binaryToText() {
        System.out.println("Enter binary: ");
        String binInput = sc.nextLine();
        int length = binInput.length();
        int result2 = 0;
        String ans = "";

        for(int i = 0;i < length; i+=9)
        {
            int num2 = 128;
            for(int j = 0; j < 9; j++)
            // j goes up by one while i goes up by nine due to each bite =8 + the space
            {
                if(binInput.charAt(i+j) == '1')
                {
                    result2 += num2;
                    // result u have + new value
                }
                else if(binInput.charAt(i+j) == ' ')
                {
                    num2 = 128;
                    ans += (char)result2;
                    //char to convert number to letter
                    result2 = 0;
                    // add result to ans and make result2 go to 0 in order to reset the value for the next letter
                }
                num2 /= 2;

            }
        }
        System.out.println(ans);

    }

    private static void textToBinary() {
        System.out.println("Enter Text: ");
        String input = sc.nextLine();
        int length1 = input.length();

        String result = "";
        for(int i = 0; i < length1; i++)
        {
            int ascii = input.charAt(i);

            if(ascii >= 128)
            {
                ascii -= 128;
                result += "1";
            }
            else{
                result += "0";
            }
            if(ascii >= 64)
            {
                ascii-=64;
                result += "1";
            }
            else{
                result += "0";
            }
            if(ascii >= 32)
            {
                ascii-=32;
                result += "1";
            }
            else{
                result += "0";
            }
            if(ascii >= 16)
            {
                ascii-=16;
                result += "1";
            }
            else{
                result += "0";
            }
            if(ascii >= 8)
            {
                ascii-=8;
                result += "1";
            }
            else{
                result += "0";
            }
            if(ascii >= 4)
            {
                ascii-=4;
                result += "1";
            }
            else{
                result += "0";
            }
            if(ascii >= 2)
            {
                ascii-=2;
                result += "1";
            }
            else{
                result += "0";
            }
            if(ascii >= 1)
            {
                ascii-=1;
                result += "1 ";
            }
            else{
                result += "0 ";
            }

            //String binary = Integer.toBinaryString(ascii);


        }
        System.out.print(result);


    }

}
