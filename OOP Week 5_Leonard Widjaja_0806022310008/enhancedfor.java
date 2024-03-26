public class enhancedfor {
    public static void main(String[] args) {
        int[][] matrix = { {8, 5, 8},
                   {4, 3, 7},
                   {7, 2, 9} };

        // Menggunakan enhanced for loop untuk mencetak setiap elemen dalam array matrix
        for (int[] row : matrix) { // Mengambil setiap array (baris) dalam matrix
        for (int num : row) {  // Mengambil setiap elemen dalam array (baris) tersebut
        System.out.print(num + " "); // Mencetak elemen
        }
        System.out.println(); // Pindah baris setelah satu baris selesai dicetak
        }       
    }
}
