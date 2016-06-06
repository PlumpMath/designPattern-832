package com.setin.ch01.연습문제;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 두석 on 2016-06-06.
 */
public class Student {
    private List<Transcript> transcripts;
    private String name;

    public Student(String name){
        this.name = name;
        this.transcripts = new ArrayList<>();
    }

    public void addTranscript(Transcript transcript){
        transcripts.add(transcript);
    }
}
