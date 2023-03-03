package bai4;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Demo {
     
    

    public static void main(String[] args) {
        
     ArrayList<nhanvien> listNhanVien =  new ArrayList<nhanvien>();

        nhanvien list[]  ; 
        
     nhanvien nv1 = new nhanvien();
     nv1.nhapDoiTuongNhanVien(); 
     nhanvien nv2 = new nhanvien("002", "Doan Minh Hieu", 3.2f , 6500000) ; 
     nhanvien nv3 = new nhanvien(nv2) ; 
     nv3.setHoTen("Phan Quang Minh");
     nv3.setMssv("003");

           
     listNhanVien.add(nv1); 
     listNhanVien.add(nv2); 
     listNhanVien.add(nv3);
     var heSoLuongCaoNhat = listNhanVien.get(0).getHeSoLuong() ;  
     var tmp  =  new  nhanvien();  
     for(int i=1 ; i < listNhanVien.size();i++)
     {
       if ( heSoLuongCaoNhat < listNhanVien.get(i).getHeSoLuong())
       {
            heSoLuongCaoNhat =  listNhanVien.get(i).getHeSoLuong() ; 
            tmp = listNhanVien.get(i) ;  
       } 
     }
     tmp.xuatDoiTUongNhanVien(); 
                Scanner sc = new Scanner(System.in) ; 
     /// function
            listNhanVien.clear(); 
            System.out.println("Nhap so luong nhan vien: ");
            int n = sc.nextInt()  ;  
            for(int i=0;i<n;i++)
            {
                nhanvien tmp1 = new nhanvien() ;  
                tmp1.nhapDoiTuongNhanVien(); 
                listNhanVien.add(i, tmp1);
            }

            
            for(int i=0; i< listNhanVien.size();i++)
            {
                listNhanVien.get(i).xuatDoiTUongNhanVien(); 
                System.out.println("Luong nhan vien : "+ listNhanVien.get(i).luongNhanVien());
            }

            System.out.println("so luong nhan vien trong danh sach: "+ listNhanVien.size());
    }

  
   





  
    
}
