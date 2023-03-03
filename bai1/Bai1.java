
package bai1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        ListHocSinh ds=new ListHocSinh();
        ds.nhapds();
        ds.xuatDS();
        ds.sapxep();
        System.out.println("\nDanh sach khi sap xep: ");
        ds.xuatDS();
    }
    
}
