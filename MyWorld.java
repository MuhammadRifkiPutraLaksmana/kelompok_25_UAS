import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyWorld adalah kelas dunia tempat permainan berlangsung.
 */
public class MyWorld extends World
{
    /**
     * Konstruktor untuk objek dari kelas MyWorld.
     */
    public MyWorld()
    {    
          // Membuat dunia baru dengan sel berukuran 600x400 dan ukuran sel 1x1 piksel.
        super(600, 600, 1); 

        // Memanggil metode prepare untuk menyiapkan objek-objek dalam dunia.
        prepare();
    }
    /**
     * Metode untuk menyiapkan objek-objek dalam dunia.
     */
    private void prepare()
    {
        // Membuat objek Line dan menambahkannya ke dunia.
        Line line = new Line();
        addObject(line, 41, 530);

        // Mengatur posisi dan arah Line lainnya.
        Line line2 = new Line();
        addObject(line2, 543, 494);
        line2.turnLeft();
        
        Line line3 = new Line();
        addObject(line3, 423, 442);
        
        Line line4 = new Line();
        addObject(line4, 208, 371);

        Line line5 = new Line();
        addObject(line5, 558, 357);

        Line line6 = new Line();
        addObject(line6, 42, 297);

        Line line7 = new Line();
        addObject(line7, 442, 534);

        Line line8 = new Line();
        addObject(line8, 212, 530);

        Line line9 = new Line();
        addObject(line9, 128, 530);

        Line line10 = new Line();
        addObject(line10, 250, 497);
        line10.turnLeft();

        Line line11 = new Line();
        addObject(line11, 98, 414);
        line11.turnLeft();

        Line line12 = new Line();
        addObject(line12, 472, 357);

        Line line13 = new Line();
        addObject(line13, 418, 324);
        line13.turnLeft();

        Line line14 = new Line();
        addObject(line14, 43, 447);

        Line line15 = new Line();
        addObject(line15, 385, 276);

        Line line16 = new Line();
        addObject(line16, 176, 414);
        line16.turnLeft();

        Line line17 = new Line();
        addObject(line17, 355, 534);

        Line line18 = new Line();
        addObject(line18, 510, 442);

        Line line19 = new Line();
        addObject(line19, 504, 241);
        line19.turnLeft();

        Line line20 = new Line();
        addObject(line20, 557, 208);

        Line line21 = new Line();
        addObject(line21, 405, 57);

        Line line22 = new Line();
        addObject(line22, 292, 176);
        line22.turnLeft();

        Line line23 = new Line();
        addObject(line23, 402, 195);

        Line line24 = new Line();
        addObject(line24, 318, 370);
        line24.turnLeft();

        Line line25 = new Line();
        addObject(line25, 190, 297);

        Line line26 = new Line();
        addObject(line26, 40, 139);

        Line line27 = new Line();
        addObject(line27, 355, 162);
        line27.turnLeft();

        Line line29 = new Line();
        addObject(line29, 158, 250);
        line29.turnLeft();

        Line line30 = new Line();
        addObject(line30, 504, 182);
        line30.turnLeft();

        Line line31 = new Line();
        addObject(line31, 212, 102);
        line31.turnLeft();

        Line line32 = new Line();
        addObject(line32, 179, 139);

        Line line33 = new Line();
        addObject(line33, 108, 67);

        Line line34 = new Line();
        addObject(line34, 292, 94);
        line34.turnLeft();

        Line line35 = new Line();
        addObject(line35, 255, 209);

        Line line36 = new Line();
        addObject(line36, 324, 57);

        Line line37 = new Line();
        addObject(line37, 438, 90);
        line37.turnLeft();
        
        Line line38 = new Line();
        addObject(line38, 212, 31);
        line38.turnLeft();

        Line line39 = new Line();
        addObject(line39, 108, 34);
        line39.turnLeft();
        
        Line line40 = new Line();
        addObject(line40, 75, 250);
        line40.turnLeft();
        
        // Membuat objek Food dan menambahkannya ke dunia
        Food food = new Food();
        addObject(food, 499, 478);
        
        // Mengatur posisi dan objek Food lainnya.
        Food food2 = new Food();
        addObject(food2, 53, 411);
        
        Food food3 = new Food();
        addObject(food3, 480, 21);
        
        Food food4 = new Food();
        addObject(food4, 37, 253);
        
        Food food5 = new Food();
        addObject(food5, 169, 99);
        
        Food food6 = new Food();
        addObject(food6, 196, 261);
        
        Food food7 = new Food();
        addObject(food7, 396, 156);
        
        Food food8 = new Food();
        addObject(food8, 22, 94);
        
        Food food9 = new Food();
        addObject(food9, 206, 495);
        
        Food food10 = new Food();
        addObject(food10, 450, 320);  
         
        // Membuat objek Star (pemain) dan menambahkannya ke dunia.
        Star star = new Star();
        addObject(star, 28, 570);
        
        // Membuat objek Counter (penanda skor) dan menambahkannya ke dunia.
        Counter counter2 = new Counter();
        addObject(counter2, 530, 60);      
         
        // Membuat objek Panah dan menambahkannya ke dunia.
        Panah panah = new Panah();
        addObject(panah, 37, 498);
        
        // Mengatur posisi dan objek Panah lainnya.
        Panah panah2 = new Panah();
        addObject(panah2, 565, 323);

        Panah panah3 = new Panah();
        addObject(panah3, 237, 189);
        
        Panah panah4 = new Panah();
        addObject(panah4, 392, 20);
    }
}
