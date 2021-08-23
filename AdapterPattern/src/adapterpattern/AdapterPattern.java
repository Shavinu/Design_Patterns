package adapterpattern;
/**
 *
 * @author Shavinu
 */
public class AdapterPattern {
      public static void main(String[] args) {
      Audio_Player shavinuAudio = new Audio_Player();
      shavinuAudio.play("mp3", "Palu mawathe- Miltion.mp3");
      shavinuAudio.play("mp4", "Ahasai nuba mata.mp4");
      shavinuAudio.play("vlc", "Sugar-Maroons.vlc");
      shavinuAudio.play("avi", "avengers.avi");
   }
}
