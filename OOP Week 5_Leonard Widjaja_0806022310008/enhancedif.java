public class enhancedif {
    public static void main(String[] args) {
        int score = 45;

        // Enhanced if digunakan ketika kita perlu menetapkan nilai ke variabel berdasarkan suatu kondisi seperti berikut ini
        String grade = (score >= 90) ? "A" :      // Jika score >= 90, maka grade = A
               (score >= 80) ? "B" :      // Jika score >= 80, maka grade = B
               (score >= 70) ? "C" :      // Jika score >= 70, maka grade = C
               (score >= 60) ? "D" : "E"; // Jika score >= 60, maka grade = D, dan jika lebih rendah dari 60, maka grade = E
        System.out.println("Nilai Anda: " + score);
        System.out.println("Grade Anda: " + grade);

    }
}
