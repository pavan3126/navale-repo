package practice.interfaces.second;
class Phone{
	void call() {
		System.out.println("Phone class's method  call");	
	} 
	void sms() {
		System.out.println("Phone class's method sms");	
	}
}
interface Camera{
	void click();
	void record();
} 

interface MusicPlayer { 
	void play();
	void pause();
	void stop();
	
}

class SmartPhone extends Phone implements Camera,MusicPlayer{
	void videocall() {
		System.out.println("SmartPhone class's method video call");
	}

	@Override
	public void play() {
		System.out.println("play method of interface musicplayer");
		
	}

	@Override
	public void pause() {
		System.out.println("pause method of interface musicplayer");
		
	}

	@Override
	public void stop() {
		System.out.println("stop method of interface musicplayer");
		
	}

	@Override
	public void click() {
		System.out.println("click method of interface Camera");
		
	}

	@Override
	public void record() {
		System.out.println("record method of interface Camera");
		
	}
}
public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone s=new SmartPhone();
		s.videocall();
		Phone p=s;
		p.call();
		p.sms();
		Camera c=s;
		c.click();
		c.record();
		MusicPlayer m=s;
		m.play();
		m.pause();
		m.stop();

	}

}
