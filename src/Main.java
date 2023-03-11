import java.util.Scanner;

public class Main {
    public static String Solution (String[] s) {
        String input[] = s;
        if (input[0].equals("")) return ("");
        if (input.length == 1) return (input[0]);

        char[][] toCharInput = new char[input.length][];
        for (int i = 0; i < input.length; i++) {
            toCharInput[i] = input[i].toCharArray();
        }

        char[] counter = new char[toCharInput[0].length];
        int i = 0;
        int ii = 0;
        int iii = 0;
        while (toCharInput[i][ii] == toCharInput[toCharInput.length - 1][iii]) {
            counter[ii] = toCharInput[i][ii];
            ii++;
            iii++;
        }
        char[] newCounter = new char[ii];
        for (int a = 0; a < newCounter.length; a++) {
                newCounter[a] = counter[a];
        }

        String adf = String.valueOf(newCounter);
        if (ii == 0) return ("");
        else return adf;
        //flower,flow,flight
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your words:");
        String wordArray = scanner.nextLine();

        String[] words = wordArray.split(",");
        System.out.println(Solution(words));
    }
}