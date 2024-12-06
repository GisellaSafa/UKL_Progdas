public class UKL3 {

    public static void main(String[]args) {
    for (int i = 1; i <= 100; i++) {     // Loop untuk mencetak 50 hingga 1

    // Array yang berisi kalimat yang akan dicetak
    // Ini akan memberi nilai 0, 1, atau 2 secara berurutan
    if (i % 5 == 0) {
        System.out.println(i + ". saya anak wikusama");
    } else if (i % 3 == 0) {
        System.out.println(i + ". saya angkatan 33");
    } else if (i % 2 == 0) {
        System.out.println(i + ". saya anak moklet");
    } else {
        System.out.println(i + ". saya senang");
    }
}
}
}
