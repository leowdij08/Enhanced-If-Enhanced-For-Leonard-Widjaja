public class pengecualianenhancedif {
    public static void main(String[] args) {
        int score = 100;

        // Pada kondisi ini terlihat pengecualian penggunaan enhanced if
        String grade = (score >= 90 && score <= 99) ? "A" :      //Enhanced if tidak dapat digunakan secara langsung untuk mengecek lebih dari satu syarat dalam satu pengecekan if
               (score >= 80) ? "B" :      // Jika score >= 80, maka grade = B
               (score >= 70) ? "C" :      // Jika score >= 70, maka grade = C
               (score >= 60) ? "D" : "E"; // Jika score >= 60, maka grade = D, dan jika lebih rendah dari 60, maka grade = E
        System.out.println("Nilai Anda: " + score);
        System.out.println("Grade Anda: " + grade);
        // Maka outputnya akan tetap Grade "A" meskipun scorenya 100 dan melebihi 99
    }
}
// Solusi dari hal ini, yaitu menggunakan if yang umumnya digunakan