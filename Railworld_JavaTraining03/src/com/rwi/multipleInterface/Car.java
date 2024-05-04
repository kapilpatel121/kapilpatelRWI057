package com.rwi.multipleInterface;

public class Car implements Engine, MusicPlayer {

	@Override
	public void play() {
		System.out.println("play Music");
	}

	@Override
	public void pause() {
		System.out.println("pause Music");
	}

	@Override
	public void start() {
		System.out.println("Engine on");
	}

	@Override
	public void stop() {
		System.out.println("Engine stop");
	}
     public static void main(String[] args) {
		Car c =new Car();
		c.start();
		c.play();
		c.pause();
		c.stop(); 
	}
}
