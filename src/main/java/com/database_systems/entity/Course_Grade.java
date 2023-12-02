package com.database_systems.entity;

public class Course_Grade {
    private Long studentNumber;
    private Long sectionNumber;
    private Long courseNumber;
    private Double midtermGrade;
    private Double Grade;
    private Double quizGrade;
    private Double cumulative_total_grade;

    public Course_Grade() {

    }

    public Course_Grade(Long studentNumber, Long sectionNumber, Long courseNumber, Double midtermGrade, Double grade, Double quizGrade, Double cumulative_total_grade) {
        this.studentNumber = studentNumber;
        this.sectionNumber = sectionNumber;
        this.courseNumber = courseNumber;
        this.midtermGrade = midtermGrade;
        Grade = grade;
        this.quizGrade = quizGrade;
        this.cumulative_total_grade = cumulative_total_grade;
    }

    public Long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Long getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(Long sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public Long getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(Long courseNumber) {
        this.courseNumber = courseNumber;
    }

    public Double getMidtermGrade() {
        return midtermGrade;
    }

    public void setMidtermGrade(Double midtermGrade) {
        this.midtermGrade = midtermGrade;
    }

    public Double getGrade() {
        return Grade;
    }

    public void setGrade(Double grade) {
        Grade = grade;
    }

    public Double getQuizGrade() {
        return quizGrade;
    }

    public void setQuizGrade(Double quizGrade) {
        this.quizGrade = quizGrade;
    }

    public Double getCumulative_total_grade() {
        return cumulative_total_grade;
    }

    public void setCumulative_total_grade(Double cumulative_total_grade) {
        this.cumulative_total_grade = cumulative_total_grade;
    }
}