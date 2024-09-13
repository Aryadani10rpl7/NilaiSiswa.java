import java.util.Scanner;

public class PerulanganNilaiSiswa {
    public static void main(String[] args) {
        int jumlahSiswa, nilai;
        double totalNilai =0, rataRata;

        Scanner n = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Siswa: ");
        jumlahSiswa = n.nextInt();

        for (int s = 1; s <=jumlahSiswa; s++) {
            System.out.println("Nilai Siswa "+s+":");
            nilai = n.nextInt();
            totalNilai += nilai;
        } 
        
        rataRata = totalNilai/jumlahSiswa;
        System.out.println("Total Nilai: "+totalNilai);
        System.out.println("Rata-Rata: "+rataRata);
    }
}