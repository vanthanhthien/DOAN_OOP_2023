package THUOC;
import DANHSACH.DanhSachThuoc;

public class ThuocVien extends Thuoc {
    private String Dang;

    public ThuocVien(String MaThuoc, String TenThuoc, String NSX, String HSD, String Soluong, String DoTuoiDung, String CongDung, String TacDungPhu, String Cachsudung)
    {
        super(MaThuoc, TenThuoc, NSX, HSD, Soluong, DoTuoiDung, CongDung, TacDungPhu, Cachsudung);
        this.Dang = Dang;
    }

    public ThuocVien (ThuocVien tv)
    {
        super((ThuocVien)tv);
        this.Dang = tv.Dang;
    }

    public String GetDang()
    {
        return Dang;
    }
    public void SetDang(String Dang)
    {
        this.Dang = Dang;
    }

    public void nhap(){
        super.nhap();
        System.out.print("Dang: ");
        Dang = sc.nextLine();
    }

    public void xuat(){
        super.xuat();
        System.out.println("Dang: " + Dang);
    }

    public void suaThongTin(){
        super.sua();
        System.out.println("\tThay doi dang thuoc: ");
    }

}
