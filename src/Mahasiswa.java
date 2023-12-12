public class Mahasiswa extends Elemen {
    private int SKS;

    public void setSKS(int SKS)
    {
        if(SKS > 0)
            this.SKS = SKS;
    }

    public int getSKS()
    {
        return this.SKS;
    }

    public Mahasiswa(String nama, int SKS)
    {
        super(nama);

        setSKS(SKS);
        setJamSibuk(SKS*3);
    }
}
