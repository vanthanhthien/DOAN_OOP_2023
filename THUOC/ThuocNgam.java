package THUOC;
import DANHSACH.DanhSachThuoc;

public class ThuocNgam extends Thuoc {

    private String Huongvi;
    private String ThoiGiangNgam;

    public ThuocNgam(String MaThuoc, String TenThuoc, String NSX, String HSD, String Soluong, String DoTuoiDung, String CongDung, String TacDungPhu, String Cachsudung)
    {
        super(MaThuoc, TenThuoc, NSX, HSD, Soluong, DoTuoiDung, CongDung, TacDungPhu, Cachsudung);
        this.Huongvi = Huongvi;
        this.ThoiGiangNgam = ThoiGiangNgam;
    }
    public ThuocNgam (ThuocNgam tn)
    {
        super((ThuocNgam)tn);
        this.Huongvi = tn.Huongvi;
        this.ThoiGiangNgam = tn.ThoiGiangNgam;   
    }

    public String GetHuongvi()
    {
        return Huongvi;
    }
    public void SetHuongvi(String Huongvi)
    {
        this.Huongvi = Huongvi;
    }

    public String GetThoigianngam()
    {
        return ThoiGiangNgam;
    }
    public void SetThoigiangngam(String ThoiGiangNgam)
    {
        this.ThoiGiangNgam = ThoiGiangNgam;
    }

    public void nhap(){
        super.nhap();
        System.out.print("\tHuong vi: ");
        Huongvi = sc.nextLine();
        System.out.print("\tThoi gian ngam: ");
        ThoiGiangNgam = sc.nextLine();
    }

    public void xuat(){
        super.xuat();
        System.out.println("\tHuong vi: " + Huongvi);
        System.out.println("\tThoi gian ngam: " + ThoiGiangNgam);
    }

    public void suaThongTin(){
        super.sua();
        System.out.println("\tThay doi huong vi: ");
        System.out.println("\tThay doi thoi gian ngam: ");
    }
}
