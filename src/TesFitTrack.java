/**
 * Menjalankan pengujian sistem keanggotaan gym FitTrack.
 */
public class TesFitTrack {

    /**
     * Titik awal program.
     *
     * @param args argumen command line
     */
    public static void main(String[] args) {
        Member[] daftarMember = {
            new Member(
                "Andi Saputra",
                "081234567890",
                "17-08-2026",
                "Basic"
            ),
            new Member(
                "Budi Santoso",
                "082345678901",
                "18-08-2026",
                "Premium"
            ),
            new Member(
                "Citra Amelia",
                "083456789012",
                "19-08-2026",
                "VIP"
            ),
            new Member(
                "Dina Putri",
                "084567890123",
                "20-08-2026"
            )
        };

        System.out.println("=== DATA MEMBER FITTRACK ===");

        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println(daftarMember[i].toString());
        }

        System.out.println("\n=== UJI CONSTRUCTOR TIDAK VALID ===");

        Member memberTidakValid = new Member(
            "   ",
            "812345",
            "   ",
            "Gold"
        );

        System.out.println(memberTidakValid);
        
    }
}