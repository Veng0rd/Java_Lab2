import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RemovingWordsVowelEnd firstInst = RemovingWordsVowelEnd.getInstance();
        firstInst.setLength(2);
        RemovingWordsVowelEnd secondInst = RemovingWordsVowelEnd.getInstance();
        System.out.println(firstInst.toString());
        System.out.println(secondInst.toString());
        System.out.println(firstInst.getLength());
        System.out.println(secondInst.getLength());

    }
}