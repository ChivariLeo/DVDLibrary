package view;

import model.DVD;

import java.util.List;
import java.util.Scanner;

public class DVDView {


        Scanner scanner=new Scanner(System.in);

        public DVD createDVDMenu(){
            System.out.println("======== DVD Entry Menu ========");
            System.out.println("Enter DVD Title");
            String title=scanner.nextLine();
            System.out.println("Enter DVD Rating");
            String rating=scanner.nextLine();
            System.out.println("Enter Movie Director Name");
            String directorName=scanner.nextLine();
            System.out.println("Enter Studio Name");
            String studio=scanner.nextLine();
            System.out.println("Enter Any  Movie Notes ");
            String userNote=scanner.nextLine();

            return new DVD(title,rating,directorName,studio,userNote);
        }

        public String deleteDVDEntry(){
            System.out.println("======== DVD Removal Menu ========");
            System.out.println("Please enter DVD Title you want to remove");
            String title = scanner.next();
             return title;
        }

        public void displayDVDList(List<DVD> dvdList){
            System.out.println("======== DVD Library List ========");
            for (DVD dvd:dvdList) {
                System.out.println(dvd);
            }
            if (dvdList.isEmpty())
                System.out.println("No current entries ");
        }

        public DVD updateDVDMenu(){
            System.out.println("======== DVD Update Menu ========");
            System.out.println("Please enter DVD Title you want to modify");
            String title=scanner.next();
            System.out.println("Enter new  DVD Rating");
            String rating=scanner.next();
            System.out.println("Enter new Movie Director Name");
            String directorName=scanner.next();
            System.out.println("Enter new Studio Name");
            String studio=scanner.next();
            System.out.println("Enter new Any  Movie Notes ");
            String userNote=scanner.next();

            return new DVD(title,rating,directorName,studio,userNote);
        }

        public String displayDVDInfo(){
            System.out.println("======== DVD Info ========");
            System.out.println("Please enter DVD Title");
            String title = scanner.next();
            return title;
        }

        public String findDVDMenu(){
            System.out.println("======== DVD Search ========");
            System.out.println("Please enter DVD Title");
            String title = scanner.next();
            return title;
        }

        public String displayDVDsFile(){
            System.out.println("======== DVD Library File Load ========");
            System.out.println("Please enter file name to load from");
            return scanner.next();
        }

        public String saveDVDsFile(){
            System.out.println("======== DVD Library File Save ========");
            System.out.println("Please enter file name to save DVD");
            return scanner.next();
        }

}
