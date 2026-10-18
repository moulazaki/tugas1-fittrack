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
        this.nama = nama;
    }

    /**
     * Mengatur nomor telepon member.
     *
     * @param noTelepon nomor telepon member
     */
    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    /**
     * Mengatur tanggal pendaftaran member.
     *
     * @param tanggalDaftar tanggal pendaftaran member
     */
    public void setTanggalDaftar(String tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }

    /**
     * Mengatur jenis paket member.
     *
     * @param jenisPaket jenis paket gym member
     */
    public void setJenisPaket(String jenisPaket) {
        this.jenisPaket = jenisPaket;
    }
}