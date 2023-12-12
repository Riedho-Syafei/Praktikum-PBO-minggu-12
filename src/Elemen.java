public class Elemen {
    private String nama;
    private int jamSibuk;

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getNama()
    {
        return this.nama;
    }

    public int getJamSibuk()
    {
        return this.jamSibuk;
    }

    public void setJamSibuk(int jam)
    {
        this.jamSibuk = jam;
    }

    public Elemen(String nama)
    {
        setNama(nama);
    }
}
