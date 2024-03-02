package de180706_nguyenhuesuong_lab3_pro192_se18b01_ex2;

import java.util.Scanner;

public class DE180706_NguyenHueSuong_LAB3_PRO192_SE18B01_EX2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path: ");
        String filePath = InputUtils.inputPath();

        try {
            if (filePath.contains(":")) {
                String diskDriver = filePath.substring(0, filePath.indexOf(':') + 1);
                String fileNameT = filePath.substring(filePath.lastIndexOf('/') + 1);
                String fileName = fileNameT.substring(0, fileNameT.lastIndexOf('.'));
                String fileExtension = fileNameT.substring(fileNameT.lastIndexOf('.') + 1);
                String foldersPath = filePath.substring(0, filePath.lastIndexOf('/'));
                String[] folders = foldersPath.split("/");
                String lastFolderName = folders[folders.length - 1];

                System.out.println("Disk driver: " + diskDriver);
                System.out.println("File name: " + fileName);
                System.out.println("File extension: " + fileExtension);
                System.out.println("Folders name: " + lastFolderName);
                System.out.println("Path to file folder: " + foldersPath);
            } else {
                System.out.println("Invalid path format: Missing disk driver");
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid path format");
        }
    }
}
