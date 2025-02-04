package FACADE;



public class main {
    public static void main(String[] args) {
        dvdplayer dvd=new dvdplayer();
        soundsystem sound=new soundsystem();
        projector proj=new projector();
        hometheatre ht=new hometheatre(dvd, proj, sound);
        ht.setmovie("inception");
        ht.endmovie();
    }
    
}
