package menghitungip;
import java.util.Scanner;
public class Menghitungip {
    public static void main(String[] args) {
      IPMahasiswa ipmhs=new IPMahasiswa();
      
      Scanner input=new Scanner(System.in);
      float ip;
      int jmlMhs = 0; jmlMhsList = 0;
      System.out.println("Masukan IP: ");
      ip = input.nextFloat();
      while(ip!=-999){
          if(ipmhs.isWithinRange(ip, 0, 4)==1){
              jmlMhs++;
          }
          if (ip >= 2.72){
              jmlMhsLis++;
          }
          System.out.println("Masukan IP: ");
          ip = input.nextFloat();
    }
      System.out.println("Jumlah Mahasiswa adalah : " + jmlMhs);
       System.out.println("Jumlah Mahasiswa Lulus adalah : " + jmlMhsList); 
    }
    int isWithinRange(Float X, int min, int max){
        if(X >= min && X <= max){
            return 1;
        }else{
            return 0;
        }
    }
}
