import java.util.Scanner;

public class StudiKasus202 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, jenis;
        int jumlahDokumen, peringkat, statusPKM, kurang;

        System.out.print("Nama mahasiswa  : ");
        nama = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenis = input.nextLine();

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("Mandiri")) {
            System.out.print("Jumlah dokumen  : ");
            jumlahDokumen = input.nextInt();
            System.out.print("Peringkat juara : ");
            peringkat = input.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan (Juara " + peringkat + ").");
                } else {
                    kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang
                            + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }
        }

        input.close();
    }
}