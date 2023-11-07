package FILE;

import XULI.XuLi;
import java.io.File;  
import java.io.IOException; 
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandler {
    private static Scanner fr;

    // reset file theo tên
    public static void resetFile(String tenFile) {
        try {
            FileWriter fw = new FileWriter(tenFile);
            fw.write("");
            fw.close();
        } catch (Exception e) {
            System.out.println("Khong the reset file!");
        }
    }
    
    // ghi nội dung vào file
    public static void ghiFile(String giaTri, String tenFile) {
        try {
            File fo = new File(tenFile);
            fr = new Scanner(fo, "utf-8");
            
            String data = "";
            
            while(fr.hasNextLine())
                data += fr.nextLine() + "\n";

            FileWriter fw = new FileWriter(tenFile);
            
            fw.write(data+giaTri);
            fw.close();
        } catch (Exception e) {
            System.out.println("Khong the ghi file!");
        }
    }
    
    public static String docFile(String tenFile) {
        try {
            File fo = new File(tenFile);
            fr = new Scanner(fo, "utf-8");
            
            String data = "";
            
            while(fr.hasNextLine())
                data += fr.nextLine() + "\n";
            
            return data;
        } catch (Exception e) {
            System.out.println("Khong the doc file!");
            return null;
        }
    }
        // thêm nhân viên vào file dsnv.txt
        public static void themNv(int manv, String hoten, String cmt, String diachi, String sdt,
        String ngayVaoLam, double heSoLuong, int soNgayNghiTrongThang) {
        String tmp = manv+"#"+hoten+"#"+cmt+"#"+diachi+"#"+sdt+"#"+ngayVaoLam+"#"+heSoLuong+"#"+soNgayNghiTrongThang;
        ghiFile(tmp, "dsnv.txt");
    }
    public static void themKh(int makh, String hoten, String cmt, String diachi, String sdt,int tongTienDaThanhToan) {
        String tmp = makh+"#"+hoten+"#"+cmt+"#"+diachi+"#"+sdt+"#"+"#"+tongTienDaThanhToan+"#";
        ghiFile(tmp, "dskh.txt");
    }

    public static void taoCacFile() {
        File[] f = new File[3];
        try {
            f[0] = new File("dsnv.txt");
            f[1] = new File("dskh.txt");
            String tenFile = "";
            for(int i=0;i<f.length;i++) {
                if (f[i].createNewFile()) { // nếu file chưa tồn tại
                    switch (i) { // khởi tạo giá trị mẫu
                        case 0:
                            tenFile = "dsnv.txt";
                            
                            break;
                        case 1:
                            tenFile = "dskh.txt";
                            
                            break;
                        default:
                            break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Khong the tao file!");
        }
    }
}
