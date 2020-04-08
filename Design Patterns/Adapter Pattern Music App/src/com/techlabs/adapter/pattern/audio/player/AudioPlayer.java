package com.techlabs.adapter.pattern.audio.player;

import com.techlabs.adapter.pattern.media.adapter.MediaAdapter;
import com.techlabs.adapter.pattern.media.player.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file:" + fileName);
		}

		else if (audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}

		else if (audioType.equalsIgnoreCase("vlc")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
	}
}
