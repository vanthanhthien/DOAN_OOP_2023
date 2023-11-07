package NHANVIEN_KHACHHANG;

import DANHSACH.DanhSachKhachHang;
import XULI.XuLi;

public class KhachHang extends XuLi {
    private String hoTen;
    private String cmt;
    private String diaChi;
    private String soDienThoai;
    private int tongTienDaThanhToan;
    private int maKhachHang;

    public KhachHang(){

    }

    public KhachHang(int maKhachHang,int tongTienDaThanhToan,String hoTen, String cmt, String diaChi, String soDienThoai){
        this.hoTen = hoTen;
        this.maKhachHang = maKhachHang;
        this.cmt = cmt;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.tongTienDaThanhToan=tongTienDaThanhToan;
    }
    
    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }
    
    public void setMaKhachHang() {
        System.out.print("Nhap ma khach hang: ");
        DanhSachKhachHang ttds = new DanhSachKhachHang();
        boolean check = false;
        do
        {
            maKhachHang = Integer.parseInt(sc.nextLine());
            check = ttds.layXuLiVoi(maKhachHang+"") == null;
            if (!check) System.out.print("Ma khach hang da ton tai, moi nhap lai: ");
        } while (!check);
    }
    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen() {
        boolean check = false;
        char ch;
        do {
            check = true;
            hoTen = sc.nextLine();
            for (int i = 0; i < hoTen.length(); i++) {
                ch = hoTen.charAt(i);
                if (Character.isDigit(ch)) {
                    check = false;
                    break;
                }
            }
            if (!check) System.out.println("Ho ten khong duoc phep chua ky tu so! Moi nhap lai:");
        } while (!check);
        
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt() {
        String cmt;
        boolean check = false;
        do {
            cmt = sc.nextLine();
            if (cmt.length() == 9) check = true;
            if (cmt.length() == 12) check = true;
            if (!check) System.out.print("Moi nhap lai: ");
        } while(!check);
        this.cmt = cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi() {
        this.diaChi = sc.nextLine();
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai() {
        boolean check = false;
        String soDienThoai;
        do {
            soDienThoai = sc.nextLine();
            if (soDienThoai.length() == 10) check = true;
            else check = false;
            
            if (soDienThoai.indexOf("0") == 0) check = true;
            else check = false;

            for (int i = 0; i < soDienThoai.length(); i++) {
                if (!Character.isDigit(soDienThoai.charAt(i)))
                {
                    check = false;
                    break;
                }
            }
            
            if (!check) System.out.print("Moi nhap lai: ");
        } while (!check);
        this.soDienThoai = soDienThoai;
    }


    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    
    public int getTongTienDaThanhToan() {
        return tongTienDaThanhToan;
    }

    public void setTongTienDaThanhToan(int tongTienDaThanhToan) {
        this.tongTienDaThanhToan = tongTienDaThanhToan;
    }

    public void nhap() {
        System.out.print("Nhap ho ten: ");
        setHoTen();
        System.out.print("Nhap chung minh thu: ");
        setCmt();
        System.out.print("Nhap dia chi: ");
        setDiaChi();
        System.out.print("Nhap so dien thoai: ");
        setSoDienThoai();
    }
    public void xuat() {
        System.out.printf("%-25s ", getMaKhachHang());
        System.out.printf("%-25s %-20s %-50s %-20s ", getHoTen(), getCmt(), getDiaChi(), getSoDienThoai());
    }
    
    public void suaThongTin() {
        System.out.println("=== Sua thong tin khach hang ===");
        System.out.println("1. Sua ho ten");
        System.out.println("2. Sua chung minh thu");
        System.out.println("3. Sua dia chi");
        System.out.println("4. Sua so dien thoai");
        System.out.println("===============================");
        int chon;
        do {
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Thong tin hien tai: "+getHoTen());
                    setHoTen();
                    break;
                case 2:
                    System.out.println("Thong tin hien tai: "+getCmt());
                    setCmt();
                    break;
                case 3:
                    System.out.println("Thong tin hien tai: "+getDiaChi());
                    setDiaChi();
                    break;
                case 4:
                    System.out.println("Thong tin hien tai: "+getSoDienThoai());
                    setSoDienThoai();
                    break;
                default:
                    chon = 0;
                    break;
            }
            if (chon==0) System.out.println("Hay chon lai!");
        } while(chon==0);
    }
}
