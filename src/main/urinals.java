// project: Count number of usable empty urinals
// author: Ish Takkar

package main;

import java.util.Scanner;

public class urinals {
    static String input = "100001";
    public static String checkString(String str) {
        return str;
    }
    public static void getInputString() {
        Scanner sc = new Scanner(System.in);
        String str;
        while(!(str = sc.nextLine()).equals("-1")) {
//            System.out.println(checkString(sc.nextLine()));
            input = checkString(sc.nextLine());
            System.out.println(input);
        }
    }
    public static void main(String[] args) {
        getInputString();
    }
}
