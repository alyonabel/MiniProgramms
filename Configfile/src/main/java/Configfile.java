import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Configfile {

    FileInputStream examp;
    Properties property = new Properties();

    Configfile() {

        try {
            examp = new FileInputStream("C:\\Users\\Java.AVALON\\Downloads\\example.ini");
            property.load(examp);
            examp.close();

        } catch (IOException e) {
            System.out.println("Error: Property file missing");
        }

    }

    private void meth1() throws IOException {

        String host = property.getProperty("host");
        String port = property.getProperty("port");
        String version = property.getProperty("version");

        System.out.println("host=" + host + "\nport=" + port
                + "\nversion=" + version);

    }

    private String meth2(String key) throws IOException {
        String value;
        value = property.getProperty(key);
        System.out.println(value);
        return value;

    }

    private String meth3(String key, String nvalue) throws IOException {

        property.setProperty(key, nvalue);
        System.out.println(key + ":" + nvalue);
        return null;
    }

    private String meth4(String key, String nvalue) throws IOException {
        try (
                FileOutputStream fos = new FileOutputStream("C:\\Users\\Java.AVALON\\Downloads\\example.ini")) {
            
            property.setProperty(key, nvalue);
            property.put(key, nvalue);
            property.store(fos, "#Method replace");

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        Configfile cf = new Configfile();
        //cf.meth1();
        // cf.meth2("port");
        //cf.meth3("host", "172.1.0.0");
        cf.meth4("host","172.1.0.0");

    }

}
