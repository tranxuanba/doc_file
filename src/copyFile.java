import java.io.*;

public class copyFile {
    public static void main(String[] args) {
        try {

        FileReader fileReader = new FileReader("src/file.txt");
        FileWriter fileWriter = new FileWriter("write1");
        BufferedReader br = new BufferedReader(new BufferedReader(fileReader));
        BufferedWriter str = new BufferedWriter(new BufferedWriter(fileWriter));
        String line = "";
        while ((line = br.readLine()) != null) {
            str.write(line);
        }
        br.close();
        str.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
