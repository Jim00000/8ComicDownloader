package com.comicdl;

import java.io.IOException;

import com.comicdl.parser.ComicParser;

public abstract class ComicDownloader implements Downloadable {

	private String comicId;
	private String episodeRange;
	private ComicParser parser;
	
	protected synchronized final String getComicId() {
		return comicId;
	}

	protected synchronized final String getEpisodeRange() {
		return episodeRange;
	}

	public ComicDownloader(String urlString) throws IOException {
		this.parser = new ComicParser(urlString);
		this.comicId = parser.getComicId();
		this.episodeRange = parser.getEpisode();
	}

}