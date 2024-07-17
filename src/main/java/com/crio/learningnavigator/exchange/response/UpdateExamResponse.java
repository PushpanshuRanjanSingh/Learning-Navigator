package com.crio.learningnavigator.exchange.response;

import com.crio.learningnavigator.entity.Exam;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * The UpdateExamResponse class represents a response for updating an exam.
 *
 * <p>This class encapsulates the updated exam object and a list of IDs for students not found during the update process.</p>
 *
 * <p><b>Fields:</b></p>
 * <ul>
 *   <li>{@code Exam exam} - The updated Exam object.</li>
 *   <li>{@code List<Long> notFoundStudentIds} - The list of IDs for students not found during the update process.</li>
 * </ul>
 *
 * <p><b>Annotations:</b></p>
 * <ul>
 *   <li>{@code @Data} - Generates getters, setters, toString, equals, and hashCode methods.</li>
 *   <li>{@code @AllArgsConstructor} - Generates a constructor with arguments for all fields.</li>
 * </ul>
 *
 * <p><b>Usage:</b></p>
 * <p>This class should be used to provide a detailed response after updating an exam, including the updated exam object and information about students not found.</p>
 *
 * <pre>{@code
 * // Example usage:
 * UpdateExamResponse response = new UpdateExamResponse(updatedExam, notFoundStudentIds);
 * }</pre>
 */
@Data
@AllArgsConstructor
public class UpdateExamResponse {
    /**
     * The updated Exam object.
     */
    private Exam exam;

    /**
     * The list of IDs for students not found during the update process.
     */
    private List<Long> notFoundStudentIds;
}
