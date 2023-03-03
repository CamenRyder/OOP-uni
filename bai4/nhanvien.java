package bai4;

import java.util.Scanner;

public class nhanvien {
    private String mssv ;  
    private String hoTen ;  
    private float heSoLuong  ; 
    private long luongCoBan ;  
    private static int soLuongNV = 0 ;  



    public String getHoTen() {
        return hoTen;
    }
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getMssv() {
        return mssv;
    }
    public float getHeSoLuong() {
        return heSoLuong;
    }
    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public nhanvien() {
        soLuongNV++ ;
    }
    public nhanvien(String mssv, String hoTen, float heSoLuong, long luongCoBan) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
        soLuongNV++ ;  
    }
    public nhanvien(nhanvien a) {
            this.heSoLuong = a.heSoLuong ;
            this.hoTen = a.hoTen ; 
            this.luongCoBan = a.luongCoBan ;  
            this.mssv = a.mssv ; 
            soLuongNV++ ; 
    }
   static Scanner sc = new  Scanner(System.in) ; 
    public void nhapDoiTuongNhanVien()
    {
        System.out.println("Nhap ho ten Nhan Vien");
        this.hoTen = sc.nextLine() ;   
        System.out.printf("Nhap luong co ban cua nhan vien %s: ", this.hoTen);
        this.luongCoBan = sc.nextLong() ;  
        System.out.println("Nhap he so luong cua nhan vien: ");
        this.heSoLuong = sc.nextFloat() ;  
        System.out.println("Nhap ma nhan vien: ");
        this.mssv = sc.nextLine() ;  
    }
    
    public void xuatDoiTUongNhanVien()
    {
        System.out.println("Thong tin nhan vien: ");
        System.out.println("Ho ten: "+ this.hoTen);
        System.out.println("Mssv: "+ this.mssv);
        System.out.println("he so luong: "+ this.heSoLuong);
        System.out.println("Luong co ban: "+ this.luongCoBan);
    }

    public double luongNhanVien()
    {
        return this.luongCoBan*this.heSoLuong ;
    }

    public int soLuongNhanVien()
    {
        return soLuongNV ; 
    }
   
}
