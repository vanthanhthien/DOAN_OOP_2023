package THUOC;

import XULI.XuLi;

public abstract class Thuoc extends XuLi {
    private String MaThuoc;
    private String TenThuoc;
    private String NSX;
    private String HSD;
    private String Soluong;
    private String DoTuoiDung;
    private String CongDung;
    private String TacDungPhu;
    private String Cachsudung;

    public Thuoc(){
        
    }

    public Thuoc (String MaThuoc, String TenThuoc, String NSX, String HSD, String Soluong, String DoTuoiDung, String CongDung, String TacDungPhu, String Cachsudung) 
    {
            this.MaThuoc = MaThuoc;
            this.TenThuoc= TenThuoc;
            this.NSX = NSX;
            this.HSD = HSD;
            this.Soluong = Soluong;
            this.DoTuoiDung = DoTuoiDung;
            this.CongDung = CongDung;
            this.TacDungPhu = TacDungPhu;
            this.Cachsudung = Cachsudung;

    }

    public Thuoc (Thuoc t)
    {
            this.MaThuoc = t.MaThuoc;
            this.TenThuoc= t.TenThuoc;
            this.NSX = t.NSX;
            this.HSD = t.HSD;
            this.Soluong = t.Soluong;
            this.DoTuoiDung = t.DoTuoiDung;
            this.CongDung = t.CongDung;
            this.TacDungPhu = t.TacDungPhu;
            this.Cachsudung = t.Cachsudung;
   
    }

    public String GetMaThuoc()
    {
        return MaThuoc;
    }
    public void SetMaThuoc(String MaThuoc)
    {
        this.MaThuoc = MaThuoc;
    }

    public String GetTenThuoc()
    {
        return TenThuoc;
    }
    public void SetTenThuoc(String TenThuoc)
    {
        this.TenThuoc = TenThuoc;
    }

    public String GetNSX()
    {
        return NSX;
    }
    public void SetNSX(String NSX)
    {
        this.NSX = NSX;
    }

    public String GetHSD()
    {
        return HSD;
    }
    public void SetHSD(String HSD)
    {
        this.HSD = HSD;
    }

    public String GetSoLuong()
    {
        return Soluong;
    }
    public void SetSoluong(String Soluong)
    {
        this.Soluong = Soluong;
    }

    public String GetDotuoidung()
    {
        return DoTuoiDung;
    }
    public void SetDotuoidung(String DoTuoiDung)
    {
        this.DoTuoiDung = DoTuoiDung;
    }

    public String GetCongdung()
    {
        return CongDung;
    }
    public void SetCongdung(String CongDung)
    {
        this.CongDung = CongDung;
    }

    public String GetTacdungphu()
    {
        return TacDungPhu;
    }
    public void SetTacdungphu(String TacDungPhu)
    {
        this.TacDungPhu = TacDungPhu;
    }

    public String GetCachsudung()
    {
        return Cachsudung;
    }
    public void SetCachsudung(String Cachsudung)
    {
        this.Cachsudung = Cachsudung;
    }

    public void nhap(){
        System.out.print("Nhap ma thuoc: ");
        MaThuoc = sc.nextLine();
        System.out.print("Nhap ten thuoc: ");
        TenThuoc = sc.nextLine();
        System.out.print("Ngay san xuat: ");
        NSX = sc.nextLine();
        System.out.print("Han su dung: ");
        HSD = sc.nextLine();
        System.out.print("So luong: ");
        Soluong= sc.nextLine();
        System.out.print("Do tuoi dung: ");
        DoTuoiDung = sc.nextLine();
        System.out.print("Cong dung: ");
        CongDung = sc.nextLine();
        System.out.print("Cach su dung: ");
        Cachsudung = sc.nextLine();
        System.out.print("Tac dung phu: ");
        TacDungPhu = sc.nextLine();
    }

    public void xuat(){
        System.out.println("\n\t---THONG TIN THUOC---");
        System.out.println("\tMa thuoc: " + MaThuoc);
        System.out.println("\tTen thuoc: " + TenThuoc);
        System.out.println("\tNgay san xuat: " + NSX);
        System.out.println("\tHan su dung: " + HSD);
        System.out.println("\tSo luong: " + Soluong);
        System.out.println("\tDo tuoi su dung: " + DoTuoiDung);
        System.out.println("\tCong dung: " + CongDung);
        System.out.println("\tCach su dung: " + Cachsudung);
        System.out.println("\tTac dung phu: " + TacDungPhu);
    }

    public void sua(){
        System.out.print("---THAY DOI THONG TIN THUOC---");
        System.out.print("\tThay doi ten thuoc: ");
        System.out.print("\tThay doi ngay san xuat: ");
        System.out.print("\tThay doi han su dung: ");
        System.out.print("\tThay doi so luong: ");
        System.out.print("\tThay doi do tuoi su dung: ");
        System.out.print("\tThay doi cong dung: ");
        System.out.print("\tThay doi cach su dung: ");
        System.out.print("\tThay doi tac dung phu: ");
    }
}

