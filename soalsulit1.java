import java.util.Scanner;
public class soalsulit1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double[] nilaiSiswa = new double[jumlahSiswa];
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukan nilai ujian siswa ke-" + (i + 1) + ": ");
            nilaiSiswa[i]= input.nextDouble();
        }

        double totalNilai = 0;

        for (int i = 0; i < jumlahSiswa; i++) {
            totalNilai += nilaiSiswa[i];
        }

        double rataRata = totalNilai / jumlahSiswa;

        // Menampilkan hasil
        System.out.println("\nRata-rata nilai ujian seluruh siswa adalah: " + rataRata);
    }
}