package com.t.notekeeper_kt

import kotlin.collections.HashMap

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initialiseCourses()
    }

    private fun initialiseCourses() {
        var course = CourseInfo("android intents", "Android " +
                "programming with intents")
        courses[course.courseId] = course

        course = CourseInfo("android async", "Android Async " +
                "Programming and Service")
        courses[course.courseId] = course

        course = CourseInfo("Java Fundamentals: The Java Language", "java_lang")
        courses[course.courseId] = course

        course = CourseInfo("Java Core", "Java fundamentals: The Core Platform")
        courses[course.courseId] = course
    }
}