import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a palavra a ser invertida: ");
        String input = sc.nextLine();

        char[] letters = input.toCharArray();
        char[] inverse = new  char[letters.length];

        int i = letters.length  -1 ;
        for(char c: letters){
            inverse[i] = c;
            i--;
        }

        input = new String(inverse);

        System.out.println("A palavra invertida ficou: " + input);
    }
}