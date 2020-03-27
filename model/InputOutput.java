import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner scanner = new Scanner(System.in);
  String nama;
  int jumlalhSks;
  double IPK;
  
  System.out.print("Masukan nama anda:  ");
  nama  = scanner.nextLine();
  System.out.println("Hai,  "+nama);

  System.out.print("Masukan jumlah SKS yang sudah ditempuh: ");
  jumlahSks = scanner.nextInt();
  System.out.println("Masukan jumlah SKS yang sudah ditempuh: "+jumlahSks);

  System.out.print("Masukan IPK Sementara :");
  IPK = scanner.nextDouble();
  System.out.println("Masukan IPK Sementara : "+IPK);

  doublejumlah = IPK * jumlahSks;
  System.out.print("Total Nilai = "+jumlah);
  System.out.println("Total Nilai = "+doublejumlah);
 }
}