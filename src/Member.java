/**
 * Merepresentasikan data member gym FitTrack
 */
public class Member{
    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;
    
    /**
     * Membuat member dengan seluruh data yang diberikan.
     *
     * @param nama nama member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran member
     * @param jenisPaket jenis paket gym member
     */
    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    /**
     * Membuat member dengan paket Basic sebagai paket awal.
     *
     * @param nama nama member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran member
     */
    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, "Basic");
    }

    /**
     * Mengatur nama member.
     *
     * @param nama nama member
     */
    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()){
            this.nama = nama;
        } else {
            System.out.println("Nama tidak boleh kosong.");
        }
    }

    /**
     * Mengatur nomor telepon member.
     *
     * @param noTelepon nomor telepon member
     */
    public void setNoTelepon(String noTelepon) {
        if (noTelepon != null && noTelepon.matches("0[0-9]{9,}")){
            this.noTelepon = noTelepon;
        } else {
        System.out.println("Nomor telepon harus diawali 0 dan minimal 10 digit.");
        }
    }


    /**
     * Mengatur tanggal pendaftaran member.
     *
     * @param tanggalDaftar tanggal pendaftaran member
     */
    public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar != null && !tanggalDaftar.trim().isEmpty()) {
            this.tanggalDaftar = tanggalDaftar;
        } else {
            System.out.println("Tanggal pendaftaran tidak boleh kosong.");
        }
    }

    /**
     * Mengatur jenis paket member.
     *
     * @param jenisPaket jenis paket gym member
     */
    public void setJenisPaket(String jenisPaket) {
        if ("Basic".equals(jenisPaket)
                || "Premium".equals(jenisPaket)
                || "VIP".equals(jenisPaket)) {
            this.jenisPaket = jenisPaket;
        } else {
            System.out.println(
                "Paket harus Basic, Premium, atau VIP."
            );
        }
    }
}