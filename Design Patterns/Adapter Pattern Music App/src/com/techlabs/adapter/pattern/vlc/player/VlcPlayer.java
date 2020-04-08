package com.techlabs.adapter.pattern.vlc.player;

import com.techlabs.adapter.pattern.advanced.music.player.AdvancedMusicPlayer;

public class VlcPlayer implements AdvancedMusicPlayer {

	@Override
	public void playMp4(String fileName) {
	}

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc : " + fileName);
	}
}
