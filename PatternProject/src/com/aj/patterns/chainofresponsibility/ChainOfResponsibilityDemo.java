package com.aj.patterns.chainofresponsibility;

public class ChainOfResponsibilityDemo {
	public static void main(String[] args) {
		Handler textHandler = new TextFileHandler("Text Handler");
		Handler imageHandler = new ImageFileHandler("Image Handler");
		Handler audioHandler = new AudioFileHandler("Audio Handler");
		Handler videoHandler = new VideoFileHandler("Video Handler");
		
		File file = new File("Abc.mp3", "text", "C:");
		imageHandler.setHandler(textHandler);
		textHandler.setHandler(audioHandler);
		audioHandler.setHandler(videoHandler);

		imageHandler.process(file);
	}
}
