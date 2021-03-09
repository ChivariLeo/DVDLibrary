import controller.DVDController;
import service.DVDServiceImpl;
import view.DVDView;

import java.io.IOException;
import java.util.InputMismatchException;

public class App {

    public static void main(String[] args) throws IOException {
        DVDController controller=new DVDController(new DVDView(),new DVDServiceImpl());
      try {
          controller.run();
      }catch (InputMismatchException e){
          System.out.println("Wrong input");
      }
    }
}


// documentation (readme github)