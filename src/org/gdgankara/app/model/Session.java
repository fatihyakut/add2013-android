package org.gdgankara.app.model;

import java.io.Serializable;

public class Session implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String LANG_TR = "tr";
	public static final String LANG_EN = "en";
	public static final int DAY_FRIDAY = 14;
	public static final int DAY_SATURDAY = 15;

	protected int day;
	protected String language;

	private int id; // eg : 3006
	private boolean isBreak;
	private String date; // eg : 15 Haziran 2013 Cuma
	private String description; // eg : Android geliştirme
								// ortamının..........anlatılacaktır.
	private String start_hour; // eg : 15:30
	private String end_hour; // eg : 16:45
	private String hall; // eg : A
	private String title; // eg : Android Uygulamaya Giriş Çalıştayı 4
	private Speaker speaker1;
	private Speaker speaker2;
	private Speaker speaker3;

	public Session() {
		super();
	}

	public Session(int day, String language, int id, boolean isBreak,
			String date, String description, String start_hour,
			String end_hour, String hall, String title, Speaker speaker1,
			Speaker speaker2, Speaker speaker3) {
		super();
		this.day = day;
		this.language = language;
		this.id = id;
		this.isBreak = isBreak;
		this.date = date;
		this.description = description;
		this.start_hour = start_hour;
		this.end_hour = end_hour;
		this.hall = hall;
		this.title = title;
		this.speaker1 = speaker1;
		this.speaker2 = speaker2;
		this.speaker3 = speaker3;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isBreak() {
		return isBreak;
	}

	public void setBreak(boolean isBreak) {
		this.isBreak = isBreak;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStart_hour() {
		return start_hour;
	}

	public void setStart_hour(String start_hour) {
		this.start_hour = start_hour;
	}

	public String getEnd_hour() {
		return end_hour;
	}

	public void setEnd_hour(String end_hour) {
		this.end_hour = end_hour;
	}

	public String getHall() {
		return hall;
	}

	public void setHall(String hall) {
		this.hall = hall;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Speaker getSpeaker1() {
		return speaker1;
	}

	public void setSpeaker1(Speaker speaker1) {
		this.speaker1 = speaker1;
	}

	public Speaker getSpeaker2() {
		return speaker2;
	}

	public void setSpeaker2(Speaker speaker2) {
		this.speaker2 = speaker2;
	}

	public Speaker getSpeaker3() {
		return speaker3;
	}

	public void setSpeaker3(Speaker speaker3) {
		this.speaker3 = speaker3;
	}

}
