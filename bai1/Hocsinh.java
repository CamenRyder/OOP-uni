package bai1;

import java.util.Scanner;

class Hocsinh {
    private String hoTen, mssv;
    private float dtb;
    
    public String getHoten(){
        return this.hoTen;
    }
    public void setHoten(String ht){
        hoTen=ht;
    }
    public String getMssv(){
        return this.mssv;
    }
    public void setMssv(String ms){
        mssv=ms;
    }   
    public float getDiemTrungBinh(){
        return this.dtb;
    }
    public void setDiemTrungBinh(float dtb){
        this.dtb=dtb;
    }    
    public void nhap1HS(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap ten hoc sinh:");
        this.hoTen=sc.nextLine();
        System.out.print("Nhap MSSV:");
        this.mssv=sc.nextLine();
        System.out.print("Nhap diem trung binh:");
        this.dtb=sc.nextFloat();
    }
    public void xuat1HS(){
        System.out.println("Ten: "+this.hoTen);
        System.out.println("MSSV: "+this.mssv);
        System.out.println("Diem trung binh: "+this.dtb);
    }

    
}
