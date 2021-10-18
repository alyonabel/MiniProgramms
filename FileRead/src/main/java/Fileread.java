import java.util.logging.Logger;

public class Fileread {

    private static Logger logger = Logger.getLogger(Fileread.class.getName());

    public static void main(String[] args) {
        PrintFile okno = new PrintFile();
        okno.pack();
        okno.setLocationRelativeTo(null);
        okno.setVisible(true);
        okno.setSize(700, 800);
        okno.setTitle("Reader file");

        logger.info("Programm started");

    }

}
