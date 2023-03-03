
package bai1;

import java.util.Scanner;

class ListHocSinh {
    private Hocsinh ds[];
    private int sl;            
    Scanner sc = new Scanner (System.in);
    public ListHocSinh(){
        this.sl=0;
    }

 
    
    ListHocSinh(int sl) {
        this.sl = sl;
    }
    
    public void nhapds(){
        System.out.print("Nhap so luong hoc sinh: ");
        sl = sc.nextInt();
        ds=new Hocsinh[sl];
        for(int i=0; i<sl; i++){
            ds[i]=new Hocsinh();
            System.out.println("Sinh vien "+(i+1)+":");
            ds[i].nhap1HS();
        }
    }
    public void xuatDS(){
        System.out.println("Danh sach hoc sinh: ");
        for(int i=0; i<sl; i++)
            ds[i].xuat1HS();
    }
    public void sapxep(){
        for(int i=0; i<sl-1;i++){
            for(int j=1; j<sl;j++){
                if(ds[i].getDiemTrungBinh() < ds[j].getDiemTrungBinh())
                {
                    Hocsinh t=ds[i];
                    ds[i]=ds[j];
                    ds[j]=t;
                }
            }
        }
    }
    
}
