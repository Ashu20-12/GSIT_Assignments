package dailyassignment15;

interface Camera
{
	abstract void takePhoto();
	
	abstract void recordVideo();
}

interface MusicPlayer
{
	abstract void playMusic();
	
	abstract void stopMusic();
}

class SmartPhone implements Camera , MusicPlayer
{
	@Override
	public void takePhoto() {
		System.out.println("Photo Captured Successfully");
		
	}

	@Override
	public void recordVideo() {
		System.out.println("Video recording started");
		
	}

	@Override
	public void playMusic() {
		System.out.println("Music is playing");
		
	}

	@Override
	public void stopMusic() {
		System.out.println("Music stopped");
		
	}
	
	public void makeCall()
	{
		System.out.println("Making a phone call");
	}

	
	
}

public class SmartDeviceManagementInterface {

	public static void main(String[] args) 
	{
		SmartPhone sp = new SmartPhone();
		sp.takePhoto();
		sp.recordVideo();
		sp.playMusic();
		sp.stopMusic();
		sp.makeCall();
		
	}

}
