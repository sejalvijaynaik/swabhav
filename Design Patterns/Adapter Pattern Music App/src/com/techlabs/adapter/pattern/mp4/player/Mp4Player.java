package com.techlabs.adapter.pattern.mp4.player;

import com.techlabs.adapter.pattern.advanced.music.player.AdvancedMusicPlayer;

public class Mp4Player implements AdvancedMusicPlayer {

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 : " + fileName);
	}

	@Override
	public void playVlc(String fileName) {
	}
}
