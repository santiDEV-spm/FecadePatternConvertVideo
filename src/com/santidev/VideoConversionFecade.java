package com.santidev;

import java.io.File;

public class VideoConversionFecade {

    public File convertVideo(String fileName, String format){
        System.out.println("VideoConversionFecade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodeFactory.extract(file);
        Codec destinationCodec;
        if(format.equals("mp4")){
            destinationCodec = new MPEG4CompressionCodec();
        }else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFecade: conversion completed.");
        return result;
    }
}
