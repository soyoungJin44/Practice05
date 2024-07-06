package com.javaex.ex999;

public class Song {
	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	//생성자
	public Song() {
		System.out.println("파라미터(0개)");
	}
	
	public Song(String title, String artist, String album, String composer, String year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("파라미터 (5개)");
	}
	
	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title,artist,album,composer,year);
		this.track = track;
		System.out.println("파라미터(6개)");
	}
	//메서드 gs
	
	//메서드 일반
	public void showInfo() {
		System.out.println(title +"\t"+ artist +"\t"+ album +"\t"+ composer +"\t"+ year +"\t"+ track);
	}
	public void showInfo1() {
		System.out.println("제목: " + title + "가수: " + artist + "앨범: " + album + "작곡가: " + composer + "년도: " + year + "트랙: " + track);
	}
}
