package com.santidev;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	    VideoConversionFecade converter = new VideoConversionFecade();
        File mp4Video = converter.convertVideo("youtubevideio.ogg", "mp4");
    }
}
