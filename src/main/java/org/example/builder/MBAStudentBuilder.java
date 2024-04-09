package org.example.builder;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjectList = new ArrayList<>();
        subjectList.add("Economics");
        subjectList.add("Business");
        this.subjects = subjectList;
        return this;
    }
}
