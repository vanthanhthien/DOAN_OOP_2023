package PHIEUNHAP;

import DANHSACH.DanhSachPhieuNhap;
import NHANVIEN_KHACHHANG.NhanVien;
import XULI.XuLi;
import thuoc

public class PhieuNhap extends XuLi {
    private int maPhieuNhap;
    private int soLuongThuoc;
    private int tongTien=0;
    //private NhanVien nhanVienNhapHang;
    //private NhanVien maNhanVien;
    //private NhanVien tenNhanVien;
    //private Thuoc[] dsThuoc;
    //private NhaCungCap[] maNhaCungCap;

    public PhieuNhap(){ }
    
    public PhieuNhap(int maPhieuNhap,int soLuongThuoc,int tongTien){//,NhanVien nhanVienNhapHang,NhanVien maNhanVien)
        this.maPhieuNhap=maPhieuNhap;
        this.soLuongThuoc=soLuongThuoc;
        this.tongTien=tongTien;
        //this.nhanVienNhapHang=nhanVienNhapHang;
        //this.maNhanVien=maNhanVien;
        //this.tenNhanVien=tenNhanVien;
    }
    
    public int getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap() {
        System.out.print("Nhap so hoa don: ");
        DanhSachPhieuNhap ttds = new DanhSachPhieuNhap();
        boolean check;
        do
        {
            check = true;
            try {
                maPhieuNhap = Integer.parseInt(sc.nextLine());
                check = ttds.layPhanTuVoi(maPhieuNhap+"") == null;
                if (!check) System.out.print("So hoa don da ton tai, moi nhap lai: ");
            } catch (Exception e) {
                check = false;
                System.out.print("Vui long nhap mot so: ");
            }
        } while (!check);
    }

    public void setMaPhieuNhap(int maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    
    public int getSoLuongThuoc() {
        return soLuongThuoc;
    }

    public void setSoLuongThuoc(int soLuongThuoc) {
        this.soLuongThuoc = soLuongThuoc;
    }

    public void setSoLuongThuoc() {
        boolean check;
        do
        {
            check = true;
            try {
                System.out.print("Nhap so luong san pham: ");
                soLuongThuoc = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                check = false;
                System.out.print("Vui long nhap mot so: ");
            }
        } while (!check);
    }
    
    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
}
