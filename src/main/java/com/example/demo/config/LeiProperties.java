package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LeiProperties {
	@Value("${com.lei.title}")
	private String title;
	
	@Value("${com.lei.des}")
	private String des;

	public String getTitle() {
		return title;
	}

	public String getDes() {
		return des;
	}
}
