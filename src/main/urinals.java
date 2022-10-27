// project: Count number of usable empty urinals
// author: Ish Takkar

package main;

import java.util.Scanner;

public class urinals {
    static String input;

    public static int countUrinals() {
        if(input.contains("11"))
            return -1;
        int count = 0;

        StringBuilder temp = new StringBuilder(input);

        if(temp.equals("0")) {
            return 1;
        }
        if(temp.equals("1")) {
            return 0;
        }
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

    public static void getInputString() {
        Scanner sc = new Scanner(System.in);
        String str;
        while(!(str = sc.nextLine()).equals("-1")) {
            input = str;
            System.out.println(countUrinals());
        }
    }
    public static void main(String[] args) {
        getInputString();
    }
}
