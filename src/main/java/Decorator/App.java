package Decorator;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        File outputFile = new File("output.txt");
        outputFile.createNewFile();
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("output.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("output.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
