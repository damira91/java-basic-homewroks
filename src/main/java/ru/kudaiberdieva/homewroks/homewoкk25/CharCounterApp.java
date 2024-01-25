package ru.kudaiberdieva.homewroks.homewoкk25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CharCounterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String filename = scanner.nextLine();
        System.out.println("Enter the sequence of characters: ");
        String requiredStr = scanner.nextLine();

        int matches = countMatchesInText(filename, requiredStr);
        System.out.println(matches);
    }

    public static int countMatchesInText(String filename, String searchStr){
        int counter = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename, StandardCharsets.UTF_8))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                counter += countMatchesInLine(line, searchStr);
            }
        } catch (IOException e){
            e.getMessage();
        }
        return counter;
    }

    public static int countMatchesInLine(String line, String searchStr){
        int counter = 0;
        int lastIndex = 0;
        while ((lastIndex = line.indexOf(searchStr, lastIndex))  != -1) {
            counter++;
            lastIndex += searchStr.length();
        }
        return counter;
    }
}
