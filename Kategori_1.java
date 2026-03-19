class Kategori {
    String namaKategori;
    Buku[] daftarBuku;
    
    Kategori(String namaKategori, Buku[] daftarBuku) {
        this.namaKategori = namaKategori;
        this.daftarBuku = daftarBuku;
    }
    
    void tampilkanKategori() {
        System.out.println("kategori: " + namaKategori);
        
        for (int i = 0; i < daftarBuku.length; i++) {
            daftarBuku[i].tampilkanBuku();
        }
    }
}