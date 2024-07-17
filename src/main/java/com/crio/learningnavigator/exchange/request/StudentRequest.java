package com.crio.learningnavigator.exchange.request;

import com.crio.learningnavigator.entity.Exam;
import com.crio.learningnavigator.entity.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * The StudentRequest class represents a request to create or update a student.
 *
 * <p>This class is used to provide the necessary details for a student, including their name,
 * enrolled subjects, and enrolled exams.</p>
 *
 * <p><b>Fields:</b></p>
 * <ul>
 *   <li>{@code String name} - The name of the student.</li>
 *   <li>{@code Set<Subject> enrolledSubjects} - The set of subjects in which the student is enrolled.</li>
 *   <li>{@code Set<Exam> enrolledExams} - The set of exams in which the student is enrolled.</li>
 * </ul>
 *
 * <p><b>Annotations:</b></p>
 * <ul>
 *   <li>{@code @Data} - Generates getters, setters, toString, equals, and hashCode methods.</li>
 *   <li>{@code @AllArgsConstructor} - Generates a constructor with arguments for all fields.</li>
 *   <li>{@code @NoArgsConstructor} - Generates a no-argument constructor.</li>
 * </ul>
 *
 * <p><b>Usage:</b></p>
 * <p>This class should be used to encapsulate data for creating or updating students, providing their name, enrolled subjects, and enrolled exams.</p>
 *
 * <pre>{@code
 * // Example usage:
 * StudentRequest studentRequest = new StudentRequest();
 * studentRequest.setName("Alice");
 * studentRequest.setEnrolledSubjects(enrolledSubjects);
 * studentRequest.setEnrolledExams(enrolledExams);
 * }</pre>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {
    /**
     * The name of the student.
     */
    private String name;

    /**
     * The set of subjects in which the student is enrolled.
     */
    private Set<Subject> enrolledSubjects;

    /**
     * The set of exams in which the student is enrolled.
     */
    private Set<Exam> enrolledExams;
}
