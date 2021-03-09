package service;

import model.DVD;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface DVDService {

    DVD addDVD(DVD dvd);
    void deleteDVD(String title);
    void updateDVD(DVD newDVD);
    List<DVD> listDVDLibrary();
    void listDVD(String title);
    DVD findDVD(String title);
    List<DVD> loadDVDsFile(String fileName) throws FileNotFoundException;
    void saveDVDsFile(String fileName) throws IOException;

}

