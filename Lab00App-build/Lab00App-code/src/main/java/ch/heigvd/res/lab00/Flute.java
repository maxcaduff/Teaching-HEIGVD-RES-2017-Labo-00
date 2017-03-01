package ch.heigvd.res.lab00;

public class Flute implements IInstrument {

    private String sound ;
    private String color ;
    private int volume ;

    public Flute () {
        this.sound = "fffuuuuuu" ;
        this.color = "wooden" ;
        this.volume = 20 ;
    }

    public String play () {return sound ;}
    public String getColor () {return color ;}
    public int getSoundVolume() {return volume ;}
}