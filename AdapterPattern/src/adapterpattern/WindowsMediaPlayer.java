package adapterpattern;
/**
 *
 * @author Shavinu
 */
public class WindowsMediaPlayer implements Advanced_MediaPlayer{
   @Override
   public void playVLC(String fileName) {
      //do nothing
   }

   @Override
   public void playWindowsMediaPlayer(String fileName) {
      System.out.println("Playing mp4 file. Name: "+ fileName);		
   }
}
