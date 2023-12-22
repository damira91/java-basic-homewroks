package ru.kudauberdieva.homeworks.homework18;

import java.io.*;

public class JavaIOApplication {

    public static void main(String[] args) throws FileNotFoundException {

        String currentDirectory = System.getProperty("user.dir");
        String filePath = currentDirectory + File.separator+ "src" + File.separator + "files" + File.separator;
        File directory = new File(filePath);

        loadAllFiles(directory);
        String fileName=getUserInput();
        String content = readFileContent( filePath + fileName);
        System.out.println(content);
        writeToFile(filePath + fileName, "\n" + "Hello java writer.");



    }

    private static void loadAllFiles(File directory) {
        File[] files = directory.listFiles();

        if (files != null) {
            System.out.println("List of files in current directory: ");
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else System.out.println("There is no file in current directory ");
    }

   private static String getUserInput() {
       System.out.println("Enter the file name: ");
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       try {
           return reader.readLine();

       } catch (
               IOException e) {
         return   e.getMessage();
       }
   }

  private static String readFileContent(String filePath) throws FileNotFoundException {
        BufferedReader  fileReader = new BufferedReader(new FileReader(filePath));
       try {

            StringBuilder content = new StringBuilder();
            String line;

            while ((line = fileReader.readLine()) != null) {
                content.append(line).append("\n");
            }

            return content.toString();
        } catch (IOException e) {
            return  e.getMessage();
        } finally {
            try {
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content);
            writer.newLine();
            System.out.println("String successfully written to the file.");
        } catch (IOException e) {

            e.printStackTrace();
            System.out.println("Failed to write to the file.");
        }


    }
    }
