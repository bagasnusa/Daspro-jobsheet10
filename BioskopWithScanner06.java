import java.util.Scanner;

public class BioskopWithScanner06 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu");
            System.out.println("1.Input data penonton");
            System.out.println("2.Tampilan daftar penonton");
            System.out.println("3.Exit");
            System.out.println("Pilih menu (1/2/3): ");
           
            int pilihan = scanner.nextInt();
            scanner.nextLine();
           
           
        switch (pilihan) {
            case 1:
            System.out.print("Masukkan nama: ");
            nama = scanner.nextLine();
            System.out.print("Masukkan baris: ");
            baris = scanner.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = scanner.nextInt();
            scanner.nextLine();

            if (isValidKursi(baris, kolom, penonton)) {
                // penonton[baris - 1][kolom - 1] = nama;
                if (penonton[baris - 1][kolom - 1] == null) {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil disimpan.");
                } else {
                    System.out.println("Maaf, kursi sudah terisi. Silakan pilih kursi lain.");
                }
                
            } else {
                System.out.println("Nomor baris/kolom kursi tidak valid. Silakan coba lagi.");
            }

            // penonton [baris-1][kolom-1] = nama;
             break;
             
             case 2:
             System.out.println("Daftar Penonton:");
             for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {
                    if (penonton[i][j] == null) {
                        System.out.print("***\t");
                    } else {
                        System.out.print(penonton[i][j] + "\t");
              }  
        }
            
         System.out.println();
     }
        break;
        case 3:
        System.out.println("Terima kasih! Keluar dari program.");
         System.exit(0);
        default:
         System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
     }
            System.out.print("Lanjut ke menu lain? (y/n): ");
            next = scanner.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
        }

        }

    }
    private static boolean isValidKursi(int baris, int kolom, String[][] penonton) {
        return baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length;
    }

 }

       