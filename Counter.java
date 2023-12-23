import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Counter adalah kelas yang menangani skor pemain.
 */
public class Counter extends Actor
{
    private int score;// Variabel untuk menyimpan skor pemain.
     /**
     * Konstruktor untuk objek kelas Counter.
     * Inisialisasi skor awal dan menetapkan gambar dengan ukuran 100x30 piksel.
     */
    public Counter()
    {
        score = 0;
        setImage (new GreenfootImage(100,30));
        update();// Memanggil metode update untuk memperbarui tampilan skor awal.
    }
    
     /**
     * Metode untuk menambah skor pemain sebanyak 10 poin.
     */
    public void addScore()
    {
        score+=10;
        update();// Memanggil metode update setelah penambahan skor.
    }
    
     /**
     * Metode untuk memperbarui tampilan skor pada gambar.
     */
    public void update()
    {
        GreenfootImage img = getImage();
        img.clear(); // Membersihkan gambar sebelum menggambar skor yang baru.
        img.setColor(Color.RED);
        
        // Mengatur ukuran font menjadi 18.
        Font font = img.getFont();
        font = font.deriveFont(18.0f);
        img.setFont(font);
        
        // Menggambar teks skor pada gambar.
        img.drawString("Score : " + score,4, 20);
    }
}
