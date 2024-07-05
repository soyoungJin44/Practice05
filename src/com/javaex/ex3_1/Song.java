package com.javaex.ex3_1;

public class Song {
	//필드
	private String title;
	private String artist;
	private String album;
	private String computer;
	private String year;
	private int track;
	
	//생성자
	public Song() {
		System.out.println("Song(파라미터 0개)");
	}
	public Song (String title, String artist, String album, String computer, String year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.computer = computer;
		this.year = year;
		System.out.println("Song(파라미터 5개)");
	}
	public Song (String title, String artist, String album, String computer, String year,int track) {
		this(title,artist,album,computer,year);
		this.track = track;
		System.out.println("Song(파라미터 6개)");
	}
	//메서드 gs
	
	//메서드 일반
	
	
	
}
