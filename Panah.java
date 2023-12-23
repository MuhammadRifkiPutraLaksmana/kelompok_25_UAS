import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

// Mendefinisikan sebuah Interface untuk menangani peristiwa "lose"
interface LoseHandler {
    void handleLose();
}
/**
 * Panah adalah kelas yang merepresentasikan objek panah yang bergerak di dunia.
 * Implementasi Interface LoseHandler untuk menangani peristiwa "lose".
 */
public class Panah extends Actor implements LoseHandler
{    
    /**
     * Metode act() akan dipanggil secara otomatis selama permainan berlangsung.
     */
    public void act() 
    {
        handleLose();  // Memanggil metode handleLose() untuk menangani kondisi kekalahan
        batas(); // Memanggil metode batas() untuk menangani pergerakan dan pembalikan panah saat mencapai batas layar
        if(line(Line.class)){ // Memanggil metode line() untuk mendeteksi tabrakan dengan objek Line
            turn(180); // Memutar panah 180 derajat jika terjadi tabrakan dengan objek Line
        }
    }

    /**
     * Metode handleLose() digunakan untuk menangani kondisi kekalahan pemain.
     * Jika panah bertabrakan dengan objek Star, maka permainan dihentikan dan suara kekalahan dimainkan.
     * @Interface
     */
    public void handleLose() {
                Actor star;
        star = getOneObjectAtOffset(0, 0, Star.class);

        if (star != null)
        {
            getWorld().addObject(new Lose(), 300, 300); // Menambahkan objek Lose ke dunia saat pemain kalah
            getWorld().removeObject(star); // Menghapus objek Star dari dunia
            loses(); // Memanggil metode loses() untuk menangani aksi tambahan saat kekalahan
        }
    }
    
    /**
     * Metode edge() digunakan untuk memeriksa apakah panah mencapai batas layar.
     * Jika iya, metode ini mengembalikan nilai true; jika tidak, mengembalikan nilai false.
     */
    public boolean edge()
    {
        if(getX() < 7 || getX() > getWorld().getWidth()-7)
            return true;
        if(getY() < 7 || getY() > getWorld().getHeight()-7)
            return true;
        else 
            return false;
    }

    /**
     * Metode batas() digunakan untuk menangani pergerakan panah dan pembalikan saat mencapai batas layar.
     */
    public void batas()
    {
        move(-3); // Menggerakkan panah ke belakang dengan kecepatan -3
        if(edge()) // Jika panah mencapai batas layar
        {
            turn(180); // Memutar panah 180 derajat
        }
    }

    /**
     * Metode line() digunakan untuk mendeteksi apakah panah bertabrakan dengan objek dari kelas tertentu (misalnya, Line).
     * Mengembalikan nilai true jika terdapat tabrakan; sebaliknya, mengembalikan nilai false.
     */
    public boolean line(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }

    /**
     * Metode loses() digunakan untuk menangani aksi tambahan saat pemain kalah.
     * Metode ini menghentikan permainan dan memainkan suara kekalahan.
     */
    public void loses()
    {
        Greenfoot.stop(); // Menghentikan permainan
        Greenfoot.playSound("sad-trombone.wav"); // Memainkan suara kekalahan
    }
}
