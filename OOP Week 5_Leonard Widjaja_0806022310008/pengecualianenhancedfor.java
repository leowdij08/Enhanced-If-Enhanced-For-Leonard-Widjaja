public class pengecualianenhancedfor {
    public static void main(String[] args) {
        int[][] matrix = { {8, 5, 8},
                   {4, 3, 7},
                   {7, 2, 9} };

        
        for (int[] row : matrix) { 
            for (int num : row) {
                num += 2; // 2 akan ditambahkan pada setiap elemen matrix melalui variabel num, tidak langsung diubah pada elemen matrix
            }
        }
        
        for (int[] row : matrix) { 
            for (int num : row) {
                System.out.print(num + " "); // Memprint semua elemen dalam matrix, namun elemen yang diprint belum ditambah 2, perubahan yang dilakukan dalam for di atas hanya merubah nilai variabel num
            }
            System.out.println("");
        }

        System.out.println(); 

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] += 2; // Apabila menggunakan for pada umumnya, maka matrix dapat diakses berdasarkan indeksnya sehingga perubahan langsung terjadi tanpa adanya variabel perantara
            }     
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(""); // Hasil yang akan keluar adalah nilai dari matrix ditambahkan 2
        }
}
}
