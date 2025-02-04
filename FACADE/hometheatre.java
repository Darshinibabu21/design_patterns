package FACADE;

public class hometheatre {
    private dvdplayer dvd;
    private projector proj;
    private soundsystem sound;
    public hometheatre(dvdplayer dvd, projector proj, soundsystem sound)
    {
        this.dvd=dvd;
        this.proj=proj;
        this.sound=sound;
    }
    public void setmovie(String movie)
    {
        System.out.println("setting up for movie..");
        proj.turnon();
        proj.setinput("dvd");
        sound.turnon();
        sound.setvolume(20);
        dvd.turnon();
        dvd.play(movie);

    }
    public void endmovie()
    {
        proj.turnoff();
        sound.turnoff();
        dvd.turnoff();
    }
}
