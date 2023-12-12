public class App {
    public static void main(String[] args) throws Exception {
        Asdos Fairuzikun = new Asdos("Fairuzikun", 20, 13);
        Dosen Damanik = new Dosen("Raja OP Damanik", 5);
        Asdos Angel = new Asdos("Angel-chan", 20, 4);
        Mahasiswa Firman = new Mahasiswa("Firman", 20);
        Mahasiswa Zulham = new Mahasiswa("Nid to pass this sem", 23);
        Dosen Nivotko = new Dosen("Nivotko", 3);
        //Elemen Fasilkom = new Elemen("Fasilkom");

        System.out.printf("%s adalah seorang %s dengan jam sibuk %d\n", Fairuzikun.getNama(), "asdos", Fairuzikun.getJamSibuk());
        System.out.printf("%s adalah seorang %s dengan jam sibuk %d\n", Damanik.getNama(), "dosen", Damanik.getJamSibuk());
        System.out.printf("%s adalah seorang %s dengan jam sibuk %d\n", Angel.getNama(), "asdos", Angel.getJamSibuk());
        System.out.printf("%s adalah seorang %s dengan jam sibuk %d\n", Firman.getNama(), "mahasiswa", Firman.getJamSibuk());
        System.out.printf("%s adalah seorang %s dengan jam sibuk %d\n", Zulham.getNama(), "mahasiswa", Zulham.getJamSibuk());
        System.out.printf("%s adalah seorang %s dengan jam sibuk %d\n", Nivotko.getNama(), "dosen", Nivotko.getJamSibuk());
        
        System.out.println("Total jam sibuk elemen Fasilkom adalah " + (Fairuzikun.getJamSibuk()+
        Damanik.getJamSibuk()+
        Angel.getJamSibuk()+
        Firman.getJamSibuk()+
        Zulham.getJamSibuk()+
        Nivotko.getJamSibuk()));
    }

    
}
