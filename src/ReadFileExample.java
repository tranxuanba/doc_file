import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        try {
            //doc file theo duong dan
            File file = new File(filePath);
            // kiem tra neu file ko ton tai thi in ra ngoai le
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            //doc tung dong cua file va tien hanh cong tong lai
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            // hien thi ra man hinh tong cac so nguyen trong file
            System.out.println("tong = " + sum);
        }catch (Exception e) {
            // truong hop file khong ton tai hoac noi dung file co loi thi hien thi :
            System.out.println("file khong ton tai hoac noi dung file co loi");

        }


    }

    public static void main(String[] args) throws IOException {
        System.out.println("nhap vao duong dan file:");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
