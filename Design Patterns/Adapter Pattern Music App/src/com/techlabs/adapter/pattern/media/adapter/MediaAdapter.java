package com.techlabs.adapter.pattern.media.adapter;

import com.techlabs.adapter.pattern.advanced.music.player.AdvancedMusicPlayer;
import com.techlabs.adapter.pattern.media.player.MediaPlayer;
import com.techlabs.adapter.pattern.mp4.player.Mp4Player;
import com.techlabs.adapter.pattern.vlc.player.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

	AdvancedMusicPlayer advancedMusicPlayer;

	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer = new Mp4Player();
		}
		else if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VlcPlayer();
		}
	}
	
	@Override
	public void play(String audioType, String fileName) {

		if(audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMp4(fileName);
		}
		else if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVlc(fileName);
		}
	}
}
