package com.santidev;

public class VideoFile {

    private String name;
    private String codecType;

    public VideoFile(String name){
        this.name = name;
        this.codecType = name.substring(name.indexOf(".")+1);
    }

    public String getCodecType(){
        return this.codecType;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
