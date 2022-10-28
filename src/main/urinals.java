// project: Count number of usable empty urinals
// author: Ish Takkar

package main;

import java.util.Scanner;

public class urinals {

    public static int countUrinals(String input) {
        if(input.contains("11"))
            return -1;
        int count = 0;

        if(input.equals("0")) {
            return 1;
        }
        if(input.equals("1")) {
            return 0;
        }

        StringBuilder temp = new StringBuilder(input);


        for(int i = 0; i < temp.length(); i++) {
            if(i == 0) {
                if(temp.charAt(i) == '0' && temp.charAt(i + 1) == '0') {
                    temp.setCharAt(i, '1');
                    count++;
                }
            } else if(i > 0 && i < temp.length() - 1) {
                if(temp.charAt(i) == '0' && temp.charAt(i + 1) == '0' && temp.charAt(i - 1) == '0') {
                    temp.setCharAt(i, '1');
                    count++;
                }
            } else if(i == temp.length() - 1) {
                if(temp.charAt(i) == '0' && temp.charAt(i - 1) == '0') {
                    temp.setCharAt(i, '1');
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean checkStringLength(String str) {
        return str.length() < 20 && str.length() >= 1;
    }

    public static boolean checkStringType(String str) {
        return str.matches("^[01]+$");
    }

    public static String getInputString() {
        Scanner sc = new Scanner(System.in);
        String str;
        while(!(str = sc.nextLine()).equals("-1")) {
            return str;
        }
        return "";
    }
    public static void main(String[] args) {
        String str = getInputString();
        if(checkStringLength(str) && checkStringType(str))
            System.out.println(countUrinals(str));
        else {
            System.out.println("-1");
        }
    }
}
