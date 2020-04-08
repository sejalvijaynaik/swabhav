package com.techlabs.adapter.pattern.test;

import com.techlabs.adapter.pattern.audio.player.AudioPlayer;

public class MediaPlayerTest {
	
	public static void main(String[] args) {
		
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "song1");
		audioPlayer.play("mp4", "song2");
		audioPlayer.play("vlc", "song3");
	}
}
