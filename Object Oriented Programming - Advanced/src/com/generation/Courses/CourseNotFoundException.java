package com.generation.Courses;

public class CourseNotFoundException extends Exception
{

    public CourseNotFoundException()
    {
        super("course not found!!");
    }
}