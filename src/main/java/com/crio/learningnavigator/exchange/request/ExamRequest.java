package com.crio.learningnavigator.exchange.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The ExamRequest class represents a request to create or update an exam.
 *
 * <p>This class is used to provide the necessary details for an exam, including its associated
 * subject identifier and the name of the exam.</p>
 *
 * <p><b>Fields:</b></p>
 * <ul>
 *   <li>{@code Long subjectId} - The identifier of the subject associated with the exam.</li>
 *   <li>{@code String name} - The name of the exam.</li>
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
 * <p>This class should be used to encapsulate data for creating or updating exams, providing the subject identifier and exam name.</p>
 *
 * <pre>{@code
 * // Example usage:
 * ExamRequest examRequest = new ExamRequest();
 * examRequest.setSubjectId(subjectId);
 * examRequest.setName("Final Exam");
 * }</pre>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamRequest {
    /**
     * The identifier of the subject associated with the exam.
     */
    private Long subjectId;

    /**
     * The name of the exam.
     */
    private String name;
}
