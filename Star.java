import greenfoot.*;  

/**
 * Star adalah kelas yang merepresentasikan objek dalam permainan.
 * Objek ini dapat bergerak dan dapat berinteraksi dengan objek lain seperti makanan dan garis (Lines).
 * Jika bertabrakan dengan garis, posisi bintang akan dikembalikan ke posisi sebelumnya.
 * Jika bintang memakan makanan (Food), pemain akan mendapatkan poin.
 * Jika total poin mencapai 100, pemain menang dan permainan berakhir.
 * 
 */
public class Star extends Actor {
    private int points = 0;  // Variabel untuk menyimpan jumlah poin pemain.
    private Counter counter;  // Variabel untuk merujuk ke objek Counter.

    private int previousX;  // Variabel untuk menyimpan posisi X sebelumnya.
    private int previousY;  // Variabel untuk menyimpan posisi Y sebelumnya.

    /**
     * Konstruktor untuk membuat objek Star dengan merujuk ke objek Counter.
     * Digunakan saat inisialisasi objek Star.
     */
    public Star(Counter pointCounter) {
        counter = pointCounter;
    }

    /**
     * Konstruktor untuk membuat objek Star tanpa merujuk ke objek Counter.
     * Digunakan jika tidak ada objek Counter yang perlu diakses.
     */
    public Star() {
        setRotation(0);
    }

    /**
     * Metode act akan dipanggil secara otomatis ketika skenario permainan berjalan.
     * Metode ini berisi logika utama untuk pergerakan bintang, interaksi dengan makanan dan garis,
     * dan penanganan kondisi menang (win) dan kekalahan (lose).
     *  @Override
     */
    public void act() {
        // Implementasi ulang metode act()
        gerak();  // Memanggil metode untuk mengatur pergerakan bintang.
        makanFood();  // Memanggil metode untuk menangani interaksi dengan makanan.
        handleCollisionWithLines();  // Memanggil metode untuk menangani tabrakan dengan garis.
        habisFood();  // Memanggil metode untuk mengecek jika pemain sudah mencapai poin 100.
    }  

    /**
     * Metode untuk menangani tabrakan bintang dengan garis.
     * Jika bertabrakan, posisi bintang akan dikembalikan ke posisi sebelumnya.
     */
    public void handleCollisionWithLines() {
        Actor line = getOneObjectAtOffset(0, 0, Line.class);
        if (line != null) {
            setLocation(getPreviousX(), getPreviousY());
        }
    }

    /**
     * Metode untuk mengatur pergerakan bintang.
     * Posisi sebelumnya disimpan untuk penanganan tabrakan dengan garis.
     */
    public void gerak() {
        previousX = getX();
        previousY = getY();

        if (Greenfoot.isKeyDown("right")) {
            setRotation(0);
            move(4);
        }
        if (Greenfoot.isKeyDown("left")) {
            setRotation(180);
            move(4);
        }
        if (Greenfoot.isKeyDown("up")) {
            setRotation(270);
            move(4);
        }
        if (Greenfoot.isKeyDown("down")) {
            setRotation(90);
            move(4);
        }
    }

    /**
     * Metode untuk mendapatkan nilai X sebelumnya.
     */
    public int getPreviousX() {
        return previousX;
    }
    
    /**
     * Metode untuk mendapatkan nilai Y sebelumnya.
     */
    public int getPreviousY() {
        return previousY;
    }

    /**
     * Metode untuk menangani interaksi bintang dengan makanan.
     * Jika bertabrakan dengan makanan, pemain mendapatkan poin, dan makanan dihapus dari dunia permainan.
     */
    public void makanFood() {
        Actor food = getOneObjectAtOffset(0, 0, Food.class);

        if (food != null) {
            makan();  // Memanggil metode untuk menangani pemakanan makanan.
            points += 10;  // Menambah poin sebanyak 10.
            Counter counter = getCounter();  // Merujuk ke objek Counter.
            counter.addScore();  // Menambah skor pada objek Counter.
        }
    }
    // Metode kedua makanFood() dengan parameter tambahan
    public void makanFood(int additionalPoints) {
        Actor food = getOneObjectAtOffset(0, 0, Food.class);

        if(food != null) {
            makan(); // Memanggil metode makan() untuk menghapus objek makanan
            points += 10 + additionalPoints;  // Menambahkan nilai tambahan dari parameter
            Counter counter = getCounter(); // Mendapatkan objek Counter dari dunia
            counter.addScore(); // Menambahkan skor ke objek Counter
        }
    }
    
    /**
     * Metode untuk mendapatkan objek Counter dari dunia permainan.
     */
    public Counter getCounter() {
        return (Counter)getWorld().getObjects(Counter.class).iterator().next();
    }

    /**
     * Metode untuk menang dalam permainan.
     * Menambahkan objek Win ke dunia permainan dan menangani lebih lanjut tindakan yang diambil saat menang.
     */
    public void win() {
        getWorld().addObject(new Win(), 300, 300);
        winer();  // Memanggil metode untuk menangani tindakan lebih lanjut saat menang.
    }

    /**
     * Metode untuk menangani pemakanan makanan.
     * Menghapus makanan dari dunia permainan dan memainkan suara pemakanan.
     */
    public void makan() {
        Actor food = getOneObjectAtOffset(0, 0, Food.class);
        getWorld().removeObject(food);
        Greenfoot.playSound("slurp.wav");
    }

    /**
     * Metode untuk menangani lebih lanjut tindakan yang diambil saat menang.
     * Menghentikan permainan dan memainkan suara kemenangan.
     */
    public void winer() {
        Greenfoot.playSound("Win.wav");
        Greenfoot.stop();
    }

    /**
     * Metode untuk mengecek apakah pemain sudah mencapai poin 100.
     * Jika ya, memanggil metode untuk menang dalam permainan.
     */
    public void habisFood() {
        if (points == 100) {
            win();
        }
    }
}
