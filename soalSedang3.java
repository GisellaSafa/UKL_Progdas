import java.util.Random;
import java.util.Scanner;

public class soalSedang3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Kuis Matematika Sederhana!");
        System.out.println("Ketik 'exit' untuk berhenti.");

        while (true) {
            // Buat angka dan operator secara acak
            int num1 = random.nextInt(10) + 1; // 1-10
            int num2 = random.nextInt(10) + 1; // 1-10
            int operator = random.nextInt(3); // 0 = *, 1 = /, 2 = %
            int correctAnswer = 0;
            String opSymbol = "";

            if (operator == 0) { // Perkalian
                correctAnswer = num1 * num2;
                opSymbol = "*";
            } else if (operator == 1) { // Pembagian
                num1 = num1 * num2; // Pastikan pembagian bulat
                correctAnswer = num1 / num2;
                opSymbol = "/";
            } else { // Modulus
                correctAnswer = num1 % num2;
                opSymbol = "%"; // Menghitung sisa pembagian
            }

            // Tampilkan soal
            System.out.println("Berapa hasil dari: " + num1 + " " + opSymbol + " " + num2 + " ?");
            System.out.println("Jawaban Anda: ");
            String jawaban = input.nextLine();

            // cek apkah user ingin keluar dari kuis
            if (jawaban.equalsIgnoreCase("exit")) {
                System.out.println("Terima kasih telah bermain!");
                break;
            }
            try {
                int userAnswer = Integer.parseInt(jawaban); // Konversi ke angka
                if (userAnswer == correctAnswer) {
                    System.out.println("Benar!");
                } else {
                    System.out.println("Salah. Jawaban yang benar adalah " + correctAnswer);
                }
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka yang valid atau 'exit' untuk keluar.");
            }

            System.out.println();
        }  
    }
    }