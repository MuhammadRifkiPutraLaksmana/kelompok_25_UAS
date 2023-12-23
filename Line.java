import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Line adalah kelas yang merepresentasikan objek garis di permainan.
 * Garis ini memiliki arah dan rotasi yang dapat diubah.
 */
public class Line extends Actor
{
    // Konstanta yang merepresentasikan arah
    private static final int EAST = 0;
    private static final int WEST = 1;
    private static final int NORTH = 2;
    private static final int SOUTH = 3;

    private int direction;  // Variabel untuk menyimpan arah garis
    
    /**
     * Metode untuk mengubah arah garis menjadi kiri.
     */
    public void turnLeft()
    {
        switch(direction) {
            case SOUTH :
                setDirection(EAST);
                break;
            case EAST :
                setDirection(NORTH);
                break;
            case NORTH :
                setDirection(WEST);
                break;
            case WEST :
                setDirection(SOUTH);
                break;
        }
    }

    /**
     * Metode untuk mengatur arah dan rotasi garis.
     * 
     * @param direction Arah baru garis (SOUTH, EAST, NORTH, WEST).
     */
    public void setDirection(int direction)
    {
        // Memastikan nilai arah berada dalam rentang yang valid (0-3)
        if ((direction >= 0) && (direction <= 3)) {
            this.direction = direction;
        }
        
        // Mengatur rotasi berdasarkan arah yang baru diatur
        switch(direction) {
            case SOUTH :
                setRotation(90);
                break;
            case EAST :
                setRotation(0);
                break;
            case NORTH :
                setRotation(270);
                break;
            case WEST :
                setRotation(180);
                break;
            default :
                break;
        }
    }
}
