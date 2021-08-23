package adapterpattern;
/**
 *
 * @author Shavinu
 */
public class VLCPlayer implements Advanced_MediaPlayer{
   @Override
   public void playVLC(String fileName) {
      System.out.println("Playing vlc file. Name: "+ fileName);		
   }

   @Override
   public void playWindowsMediaPlayer(String fileName) {
      //do nothing
   }
}
