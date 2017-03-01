package ch.heigvd.res.lab00;


public class Trumpet implements IInstrument {

    private String sound ;
    private String color ;
    private int volume ;

    public Trumpet () {
        this.sound = "pouet" ;
        this.color = "golden" ;
        this.volume = 50 ;
    }

    public String play () {return sound ;}
    public String getColor () {return color ;}
    public int getSoundVolume() {return volume ;}
}