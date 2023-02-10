import javax.sound.sampled.*;
import java.io.IOException;

public class Sound {
    private String soundFile;
    private Clip clip;
    public void playSound() {
        setSoundFile("Medieval_game.wav");
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(this.getClass().getResource(getSoundFile()));
            setClip(AudioSystem.getClip());
            getClip().open(ais);
            getClip().start();
            getClip().loop(Clip.LOOP_CONTINUOUSLY);
            final FloatControl volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            volumeControl.setValue(-15.0f);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e){
        }
    }
    public void setSoundFile(String soundFile) {
        this.soundFile = soundFile;
    }

    public String getSoundFile() {
        return this.soundFile;
    }

    public void setClip(Clip clip) {
        this.clip = clip;
    }

    public Clip getClip() {
        return this.clip;
    }
}
