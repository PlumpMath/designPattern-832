package com.setin.ch03;

import com.setin.ch01.domain.Course;

/**
 * Created by 두석 on 2016-06-07.
 */
public class Student {
    /**
     * 수강과목 조회
     */
    public void getCources() {
    }

    /**
     * 수강신청
     **/
    public void addCourse(Course course) {
    }

    /**
     * 데이터베이스에 학생 정보를 저장
     **/
    public void save() {
    }

    /**
     * 데이터베이스로 부터 학생 정보를 읽어오는 것
     **/
    public Student load() {
        return new Student();
    }

    /**
     * 성적표 출력
     **/
    public void printOnReportCard() {

    }

    /**
     * 출석부 출력
     **/
    public void printOnAttendanceBook() {

    }
}
