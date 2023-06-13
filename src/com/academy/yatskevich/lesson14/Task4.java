package com.academy.yatskevich.lesson14;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String startPath = System.getProperty("user.dir");
        File currentFile = new File(startPath);
        System.out.print(currentFile.getAbsolutePath() + ">");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase("dir")) {
                dir(currentFile);
            } else if (s.contains("cd ")){
                String newPath = s.split(" ")[1];
                File newFile;
                if (newPath.equals("..")) {
                    newFile = new File(currentFile.getParentFile().getAbsolutePath());
                } else {
                    newFile = new File(currentFile + File.separator +  newPath);
                }
                currentFile = cd(currentFile, newFile);
            } else {
                System.out.println("\"" + s + "\" не является внутренней или внешней\n" +
                        "командой, исполняемой программой или пакетным файлом.");
                System.out.print("\n\n" + currentFile.getAbsolutePath() + ">");
            }
        }


    }

    public static void dir(File currentFile) {
        System.out.printf("\nСодержимое папки " + currentFile.getAbsolutePath() + "\n\n");
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy  HH:mm");
        int numberOfFolders = 0;
        int numberOfFiles = 0;
        long occupiedSpaceByFiles = 0;
        for (File file : currentFile.listFiles()) {
            System.out.printf("%-17s%9s%9s %-20s\n",
                    formatter.format(new Date(file.lastModified())),
                    (file.isDirectory() ? "<DIR>" : ""),
                    (file.isFile() ? String.valueOf(file.length()) : ""),
                    file.getName());
            if (file.isFile()) {
                numberOfFiles++;
                occupiedSpaceByFiles += file.length();
            } else {
                numberOfFolders++;
            }
        }
        System.out.printf("%16d файлов %,16d байт\n", numberOfFiles, occupiedSpaceByFiles);
        System.out.printf("%16d папок  %,16d байт свободно\n\n", numberOfFolders, currentFile.getFreeSpace());
        System.out.print(currentFile.getAbsolutePath() + ">");
    }

    public static File cd(File currentFile, File newFile) {
        if (newFile.getParentFile().getAbsolutePath().equals(currentFile.getAbsolutePath())) {
            System.out.print("\n\n" + newFile.getAbsolutePath() + ">");
            return newFile;
        } else if (newFile.getAbsolutePath().equals(currentFile.getParentFile().getAbsolutePath())) {
            System.out.print("\n\n" + newFile.getAbsolutePath() + ">");
            return newFile;
        } else {
            System.out.println("\"" + newFile.getName() + "\" не является внутренней или внешней\n" +
                    "командой, исполняемой программой или пакетным файлом.");
            System.out.print("\n\n" + currentFile.getAbsolutePath() + ">");
            return currentFile;
        }
    }
}
/*
C:\Users\valer\IdeaProjects\Homeworks\Yarskevich\JD_HW\src\com\academy\sd>cd asd


C:\Users\valer\IdeaProjects\Homeworks\Yarskevich\JD_HW\src\com\academy\sd\asd>cd ads


C:\Users\valer\IdeaProjects\Homeworks\Yarskevich\JD_HW\src\com\academy\sd\asd\ads>dir

Содержимое папки C:\Users\valer\IdeaProjects\Homeworks\Yarskevich\JD_HW\src\com\academy\sd\asd\ads

Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "<local6>" is null
	at com.academy.yatskevich.lesson14.Task4.dir(Task4.java:44)
	at com.academy.yatskevich.lesson14.Task4.main(Task4.java:18)


	когда ввожу не существующую папку - все равно в нее переходит
    и "end" не завершает работу
 */