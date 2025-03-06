/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptuan7;
import java.util.Scanner;
public class hinhchunhat extends hinhhoc {
    public float dai;
    public float rong;
    
   public hinhchunhat(){
       ten = "hinh chu nhat";
   }
   public void nhapdai(){
       System.out.println("chieu dai= ");
       Scanner scanner =new Scanner(System.in);
       dai=scanner.nextFloat();
}
    public void nhaprong(){
   System.out.println("chieu rong= ");
       Scanner scanner =new Scanner(System.in);
       rong=scanner.nextFloat();
}
 public void nhapchuvi(){
     chuvi = 2*(dai+rong);
 }
  public void nhapdientich(){
      dientich = dai*rong;
  }
}