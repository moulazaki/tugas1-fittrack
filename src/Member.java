/**
 * Merepresentasikan data member gym FitTrack
 */
public class Member{
    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

    private static final String DEFAULT_NAMA = "Belum diisi";
    private static final String DEFAULT_TELEPON = "0000000000";
    private static final String DEFAULT_TANGGAL = "Belum diisi";
    private static final String DEFAULT_PAKET = "Basic";

    private static final int MIN_PANJANG_TELEPON = 10;
    
    /**
 * Membuat member dengan nilai default yang aman.
 */
    public Member() {
        this.nama = DEFAULT_NAMA;
        this.noTelepon = DEFAULT_TELEPON;
        this.tanggalDaftar = DEFAULT_TANGGAL;
        this.jenisPaket = DEFAULT_PAKET;
    }

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
            this.nama = nama.trim();
        } else {
            System.out.println("Nama ditolak: nama tidak boleh kosong atau hanya berisi spasi.");
        }
    }

    /**
    * Mengambil nama member.
    *
    * @return nama member
    */
    public String getNama() {
        return nama;
    }

    /**
     * Mengatur nomor telepon member.
     *
     * @param noTelepon nomor telepon member
     */
    public void setNoTelepon(String noTelepon) {
        if (noTelepon != null && noTelepon.matches("[0-9]+") && noTelepon.startsWith("0")
                && noTelepon.length() >= MIN_PANJANG_TELEPON) {
            this.noTelepon = noTelepon;
        } else {
        System.out.println("Nomor telepon ditolak: nomor telepon harus diawali 0 dan minimal 10 digit.");
        }
    }

    /**
    * Mengambil nomor telepon member.
    *
    * @return nomor telepon member
    */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * Mengatur tanggal pendaftaran member.
     *
     * @param tanggalDaftar tanggal pendaftaran member
     */
    public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar != null && !tanggalDaftar.trim().isEmpty()) {
            this.tanggalDaftar = tanggalDaftar.trim();
        } else {
            System.out.println("Tanggal pendaftaran ditolak: Tanggal pendaftaran tidak boleh kosong.");
        }
    }

    /**
    * Mengambil tanggal pendaftaran member.
    *
    * @return tanggal pendaftaran member
    */
    public String getTanggalDaftar() {
        return tanggalDaftar;
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

    /**
    * Mengambil jenis paket member.
    *
     * @return jenis paket member
    */
    public String getJenisPaket() {
        return jenisPaket;
    }
}