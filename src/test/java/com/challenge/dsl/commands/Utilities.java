package com.challenge.dsl.commands;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.challenge.dsl.BasePage;

public class Utilities extends BasePage {

	List<String> lines;
	String line;

	public void navigateTo(String url) {
		getDriver().get(url);
	}

	public void limparNotepad() throws IOException {
		FileOutputStream writer = new FileOutputStream(System.getProperty("user.dir") + "/dados/email.txt");
		writer.write(("").getBytes());
		writer.close();

	}

	public void escreverNotepad(String texto) {
		try {

			FileOutputStream writer = new FileOutputStream(System.getProperty("user.dir") + "/dados/email.txt");
			writer.write(("").getBytes());
			writer.write((texto).getBytes());
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String lerNotepad() {
		try {

			// lines = FileUtils.readLines(new File(System.getProperty("user.dir") +
			// "/dados/email.txt"));

			BufferedReader reader = new BufferedReader(
					new FileReader(System.getProperty("user.dir") + "/dados/email.txt"));

			line = reader.readLine();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return line;
	}
	
	
}