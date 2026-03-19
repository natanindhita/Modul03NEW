class Buku {
    String judul;
    String sinopsis;
    Penulis penulis;
    
    Buku(String judul, String sinopsis, Penulis penulis) {
        this.judul = judul;
        this.sinopsis = sinopsis;
        this.penulis = penulis;
    }
    
    void bacaFile(String pathFile) {
    try {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(pathFile));
        String data = br.readLine();
        String[] hasil = data.split(";");

        this.judul = hasil[0];
        this.penulis = new Penulis(hasil[1]);
        this.sinopsis = hasil[2];

        br.close();
        
        } catch (Exception e) {
        System.out.println("error saat membaca file");
        }
    }
    
    void simpanFile(String namaFile) {
    try {
        java.io.FileWriter fw = new java.io.FileWriter(namaFile);
        fw.write(judul + ";" + penulis.nama + ";" + sinopsis);
        fw.close();
        
        } catch (Exception e) {
        System.out.println("error saat menyimpan file");
        }
    }
    
    double hitungRoyalti(double hargaBuku) {
        return hargaBuku * 0.10;
    }
    
    double hitungRoyalti(double hargaBuku, double persen) {
        return hargaBuku * (persen / 100);
    }
}
