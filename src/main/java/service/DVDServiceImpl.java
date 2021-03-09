package service;

import model.DVD;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DVDServiceImpl implements DVDService{

    private List<DVD> DVDLibrary= new ArrayList<>();



    public DVD addDVD(DVD dvd) {
        if (!DVDLibrary.contains(dvd))
            DVDLibrary.add(dvd);
        return dvd;
    }

    public void deleteDVD(String title) {
        DVD toRemove=new DVD();
        for (DVD dvd:DVDLibrary) {
            if (dvd.getTitle().equals(title)) {
                 toRemove = dvd;
            }else
                System.out.println("No such entry");
        }
        DVDLibrary.remove(toRemove);
        System.out.println( "DVD Entry deleted successfully");
    }

    public void updateDVD(DVD updateDVD) {
        for (DVD dvd:DVDLibrary) {
            if (dvd.getTitle().equals(updateDVD.getTitle())) {
                dvd.setRating(updateDVD.getRating());
                dvd.setDirectorName(updateDVD.getDirectorName());
                dvd.setStudio(updateDVD.getStudio());
                dvd.setUserNote(updateDVD.getUserNote());
                System.out.println("Update successful");
            }
            else
                System.out.println("Update failed");
        }

    }

    public List<DVD> listDVDLibrary() {
        return DVDLibrary;
    }

    public void listDVD(String title) {
        for (DVD dvd:DVDLibrary) {
            if (dvd.getTitle().equals(title))
                System.out.println(dvd);
        }
    }

    public DVD findDVD(String title) {
        for (DVD dvd:DVDLibrary) {
            if (dvd.getTitle().equals(title))
                return dvd;
        }
        return null;
    }

    public List<DVD> loadDVDsFile(String fileName) throws FileNotFoundException {
        Scanner scanner= new Scanner(new File("C:\\Users\\admin\\Downloads\\TemplateProject\\DVDLibrary\\src\\main\\resources\\"+fileName));
        String[] dvdInfo=scanner.nextLine().split(",");
        List<DVD> fileDVDs=new ArrayList<>();
        DVD dvd=new DVD(dvdInfo[0],dvdInfo[1],dvdInfo[2],dvdInfo[3],dvdInfo[4]);
        fileDVDs.add(dvd);
        return fileDVDs;
    }

    public void saveDVDsFile(String fileName) throws IOException {
        PrintWriter writer=new PrintWriter(new FileWriter(fileName));
        if (!DVDLibrary.isEmpty()) {
            for (DVD dvd:DVDLibrary) {
                writer.print(dvd);
                writer.close();
            }
        }else
            System.out.println("No DVD entries");
    }
}
