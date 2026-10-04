import java.util.Scanner;

public class TigaLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Batas deret (n) : ");
        int n = input.nextInt();

        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");

        System.out.print("for      : ");
        for (int a = 1; a <= n; a++) {
            System.out.print(a + " ");
        }
        System.out.println();

        // while (pencacah sendiri: b)
        System.out.print("while    : ");
        int b = 1;
        while (b <= n) {
            System.out.print(b + " ");
            b++;
        }
        System.out.println();


        System.out.print("do-while : ");
        int c = 1;
        do {
            System.out.print(c + " ");
            c++;
        } while (c <= n);
        System.out.println();

        System.out.println();

        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }

        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }

        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        // ---------- 4. Saring deret 1-10 dengan continue dan break ----------
        System.out.print("Disaring : ");
        int hitungPrintln = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;   // lewati angka genap
            }
            if (i > 7) {
                break;      // berhenti kalau i > 7
            }
            System.out.print(i + " ");
            hitungPrintln++;
        }
        System.out.println();
        System.out.println("Sampai println  : " + hitungPrintln + " kali");

        input.close();

        /*

         *  KESIMPULAN:
         *  do-while mengecek kondisinya SESUDAH badan loop dijalankan,
         *  jadi badannya pasti jalan minimal sekali.
         *
         * ============================================================
         *  PENJELASAN: kenapa loop tidak berhenti di i = 8?
         * ============================================================
         *  Karena di dalam badan loop, 'continue' ditulis SEBELUM 'break'.
         *  Saat i = 8 (genap), 'continue' langsung dieksekusi dan loncat ke
         *  iterasi berikutnya, sehingga baris 'if (i > 7) break;' tidak
         *  pernah sempat dicapai. Pengecekan break baru terjadi pada
         *  i = 9 (ganjil, lolos dari continue), dan di sanalah loop berhenti.
         *  Jadi loop sebenarnya berhenti di i = 9, bukan i = 8.
         */

    }
}