package com.crio.learningnavigator.exchange.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The SubjectRequest class represents a request to create or update a subject.
 *
 * <p>This class is used to provide the necessary details for a subject, including its name.</p>
 *
 * <p><b>Fields:</b></p>
 * <ul>
 *   <li>{@code String name} - The name of the subject.
 *       <ul>
 *           <li>Constraints:</li>
 *           <ul>
 *               <li>{@code @NotNull} - The subject name must not be null.</li>
 *               <li>{@code @NotEmpty} - The subject name must not be empty.</li>
 *           </ul>
 *       </ul>
 *   </li>
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
 * <p>This class should be used to encapsulate data for creating or updating subjects, providing their name.</p>
 *
 * <pre>{@code
 * // Example usage:
 * SubjectRequest subjectRequest = new SubjectRequest();
 * subjectRequest.setName("Mathematics");
 * }</pre>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectRequest {
    /**
     * The name of the subject.
     * Constraints:
     * - The subject name must not be null.
     * - The subject name must not be empty.
     */
    @NotNull
    @NotEmpty
    private String name;
}
