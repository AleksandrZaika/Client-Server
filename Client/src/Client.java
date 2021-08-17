import Pack.Assembly;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        try (Assembly assembly = new Assembly("127.0.0.1", 8000)) {
            System.out.println("Connected to server");

            String request = "Visaginas";
            System.out.println("Response: " + request);
            assembly.writeLine(request);

            String response = assembly.readLine();
            System.out.println("Response: " + response);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
