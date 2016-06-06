package com.setin.ch01.연습문제;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by 두석 on 2016-06-06.
 */
public class Course {
    private String name;
    private List<Transcript> transcripts;

    public Course(String name) {
        this.name = name;
        transcripts = new ArrayList<>();
    }

    public void addTranscript(Transcript transcript) {
        transcripts.add(transcript);
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return transcripts.stream().map(Transcript::getStudent).collect(toList());
    }
}
