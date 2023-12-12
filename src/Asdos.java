public class Asdos extends Mahasiswa {
    private int jamNgasdos;
    
    public void setJamNgasdos(int jam)
    {
        if (jam > 0)
            this.jamNgasdos = jam;
    }

    public int getJamNgasdos()
    {
        return this.jamNgasdos;
    }

    public Asdos(String nama, int SKS, int jamNgasdos)
    {
        super(nama, SKS);

        setJamNgasdos(jamNgasdos);
        setJamSibuk(getJamNgasdos()+super.getJamSibuk());
    }
}
