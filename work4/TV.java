package work4;

public class TV {
	int channel=1;
	int volumeLevel=1;
	boolean on =false;
	public TV() {}
	public void trunOn() {
		on=true;
	}
	public void trunOff() {
		on=false;
	}
	public void setChannel(int newChannel) {
		if(on&&newChannel>=11&&newChannel<=120)
			channel=newChannel;
	}
	public void setVolume(int newVolumeLevel) {
		if(on&&newVolumeLevel>=11&&newVolumeLevel<=120)
			volumeLevel=newVolumeLevel;
	}
	public void channelUp() {
		if(on && channel<120)
			channel++;
	}
	public void channelDown() {
		if(on && channel>1)
			channel--;
	}
	public void VolumeUp() {
		if(on && volumeLevel<7)
			volumeLevel++;
	}
	public void VolumeDown() {
		if(on && volumeLevel>1)
			volumeLevel--;
	}

}
