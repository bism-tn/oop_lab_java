import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class oddevn {
    static String data = "";
    static File dataFile = new File("DATA.txt");

    public static void main(String[] arg) {
        try {
            FileWriter oddFile = new FileWriter("odd.txt", true);
            FileWriter evenFile = new FileWriter("even.txt", true);

            Scanner dataRead = new Scanner(dataFile);
            while (dataRead.hasNextLine()) {
                data += dataRead.nextLine();
            }
            dataRead.close();
            String values[] = data.split(" ");
          
            for (String i : values) {
               
                if (Integer.parseInt(i) % 2 == 0) {
                    evenFile.write(i+" ");

                } else {
                    oddFile.write(i+" ");
                }
            }
            oddFile.close();
            evenFile.close();
        } catch (IOException ex) {
            System.out.println("An error occured !");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.print("An error occured : ");
            System.out.println(ex.getMessage());
        }

    }
}