public class Dosen extends Elemen {
    private int jumlahHariKerja;

    public void setJumlahHariKerja(int hari)
    {
        if (jumlahHariKerja > 0)
            this.jumlahHariKerja = hari;
    }

    public int getJumlahHariKerja()
    {
        return jumlahHariKerja;
    }

    public Dosen(String nama, int jumlahHariKerja)
    {
        super(nama);
        
        setJumlahHariKerja(jumlahHariKerja);
        setJamSibuk(jumlahHariKerja*8);
    }
}
