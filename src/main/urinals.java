// project: Count number of usable empty urinals
// author: Ish Takkar

package main;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class urinals {

    static BufferedReader in;
    static ArrayList<Integer> list;
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
            if(checkStringLength(str) && checkStringType(str))
                System.out.println(countUrinals(str));
        }
        return str;
    }

    public static int openFile() {
        try {
//            System.out.println("open file");
            in = new BufferedReader(new FileReader("urinals.dat"));
        } catch (FileNotFoundException e) {
            return -1;
        }
        return 0;
    }

    public static int readFromFile() {
        String line;
        list = new ArrayList<>();
        try {
//            System.out.println("reading");

            if((line = in.readLine()) == null)
                return -1;
            while((line) != null) {
                if(checkStringLength(line) && checkStringType(line)) {
                    //System.out.println(countUrinals(line));
                    list.add(countUrinals(line));
                }
                line = in.readLine();
            }
        } catch (IOException e) {
            return -2;
        }
        return 0;
    }

    public static int writeToFile() {
        int counter = 1;
        File f = new File("rule.txt");
        while(f.exists()) {
            f = new File("rule" + counter + ".txt");
            counter++;
        }
        FileWriter out;
        try {
            out = new FileWriter(f);
        } catch (IOException e) {
            return -1;
        }
        for(int i = 0; i < list.size(); i++) {
            try {
                out.write(list.get(i) + "\n");
            } catch (IOException e) {
                return -1;
            }
        }
        try {
            out.close();
        } catch (IOException e) {
            return -1;
        }
        return 0;
    }


    public static void main(String[] args) {
//      String str = getInputString();
        openFile();
        readFromFile();
        writeToFile();
    }
}
