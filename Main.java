public class Main {
    public static void main(String[] args) {
        
        Penulis writer1 = new Penulis("Chiko");
        
        Buku book1 = new Buku("Artificial Intelligence", "Buku ini membahas tentang AI", writer1);
        
        book1.simpanFile("book.txt");
        
        Buku book2 = new Buku("", "", new Penulis(""));
        book2.bacaFile("book.txt");
        
        System.out.println("royalti 10%: " + book1.hitungRoyalti(100000));
        System.out.println("royalti 5%: " + book1.hitungRoyalti(100000, 5));
    }
}
