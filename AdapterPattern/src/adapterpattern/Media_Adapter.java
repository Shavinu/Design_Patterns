package adapterpattern;
/**
 *
 * @author Shavinu
 */
public class Media_Adapter implements Media_Player{
   Advanced_MediaPlayer advancedMusicPlayer;

   public Media_Adapter(String audioType){
   
      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VLCPlayer();			
         
      }else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new WindowsMediaPlayer();
      }	
   }

   @Override
   public void play(String audioType, String fileName) {
   
      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVLC(fileName);
      }
      else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playWindowsMediaPlayer(fileName);
      }
   }
}
