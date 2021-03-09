package controller;


import model.DVD;
import service.DVDService;
import view.DVDView;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class DVDController {

    private DVDView view;
    private DVDService dvdService;

    public DVDController(DVDView view, DVDService dvdService) {
        this.view = view;
        this.dvdService = dvdService;
    }

    Scanner scanner=new Scanner(System.in);


    public void run() throws IOException {

        boolean keepGoing = true;
        int menuSelection ;
        while (keepGoing) {
            System.out.println("======== Main Menu ========");
            System.out.println();
            System.out.println("1. Add a DVD to the collection");
            System.out.println("2. Remove a DVD from the collection");
            System.out.println("3. Edit the information for an existing DVD");
            System.out.println("4. List the DVDs in the collection");
            System.out.println("5. Display the information for a  DVD");
            System.out.println("6. Search for a DVD ");
            System.out.println("7. Load the DVD library from a file");
            System.out.println("8. Save the DVD library back to the file");
            System.out.println("9. Exit");
            System.out.println();
            System.out.println("Please select from the above choices.");

            menuSelection = scanner.nextInt();
            System.out.println();
            switch (menuSelection) {
                case 1:
                    createDVD();
                    break;
                case 2:
                    deleteDVD();
                    break;
                case 3:
                    updateDVD();
                    break;
                case 4:
                    listDVDs();
                    break;
                case 5:
                    DVDInfo();
                    break;
                case 6:
                    findDVD();
                    break;
                case 7:
                    getDVDsFile();
                    break;
                case 8:
                    saveDVDsFile();
                    break;
                case 9:
                    keepGoing = false;
                    break;

                    default:
                    System.out.println("UNKNOWN COMMAND");
            }

        }
        System.out.println("GOOD BYE");
    }


    public void createDVD(){
        DVD newDVD=view.createDVDMenu();
        dvdService.addDVD(newDVD);
        System.out.println("DVD Entry Successful");
    }

    public void deleteDVD(){
        String DVDTitle=view.deleteDVDEntry();
        dvdService.deleteDVD(DVDTitle);

    }

    public void updateDVD(){
        DVD newDVD=view.updateDVDMenu();
        dvdService.updateDVD(newDVD);
    }

    public void listDVDs(){
        view.displayDVDList(dvdService.listDVDLibrary());
    }

    public void DVDInfo(){
        String dvdTitle=view.displayDVDInfo();
        dvdService.listDVD(dvdTitle);

    }

    public void findDVD(){
        String dvdTitle=view.findDVDMenu();
        DVD dvd = dvdService.findDVD(dvdTitle);
        System.out.println(dvd);
    }

    public List<DVD> getDVDsFile() throws FileNotFoundException {
        String fileName= view.displayDVDsFile();
        List<DVD> dvdList=dvdService.loadDVDsFile(fileName);
        System.out.println();
        for (DVD dvd: dvdList) {
            System.out.println(dvd); }
        System.out.println();
        return dvdList;
    }

    public void saveDVDsFile() throws IOException {
        String fileName=view.saveDVDsFile();
        dvdService.saveDVDsFile(fileName);
        System.out.println("File "+ fileName +" successfully saved");
    }

}
