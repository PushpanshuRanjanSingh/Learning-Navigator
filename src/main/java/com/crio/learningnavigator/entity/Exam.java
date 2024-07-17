package com.crio.learningnavigator.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * The Exam entity represents an exam associated with a specific subject.
 *
 * <p>This class defines the structure of an exam, including its unique identifier, name,
 * associated subject, and a set of students enrolled in the exam.</p>
 *
 * <p><b>Fields:</b></p>
 * <ul>
 *   <li>{@code Long id} - The unique identifier of the exam.</li>
 *   <li>{@code String name} - The name of the exam.
 *       <ul>
 *           <li>Constraints:</li>
 *           <ul>
 *               <li>{@code @NotEmpty} - The exam name must not be empty.</li>
 *           </ul>
 *       </ul>
 *   </li>
 *   <li>{@code Subject subject} - The subject associated with the exam.
 *       <ul>
 *           <li>Relationship:</li>
 *           <ul>
 *               <li>{@code @ManyToOne} - Many exams can belong to one subject.</li>
 *           </ul>
 *       </ul>
 *   </li>
 *   <li>{@code Set<Student> enrolledStudents} - The set of students enrolled in the exam.
 *       <ul>
 *           <li>Relationship:</li>
 *           <ul>
 *               <li>{@code @ManyToMany(mappedBy = "enrolledExams")} - Many exams can be enrolled by many students.</li>
 *               <li>{@code @JsonBackReference} - Prevents Jackson from infinitely serializing students.</li>
 *           </ul>
 *       </ul>
 *   </li>
 * </ul>
 *
 * <p><b>Annotations:</b></p>
 * <ul>
 *   <li>{@code @Entity} - Specifies that the class is an entity.</li>
 *   <li>{@code @Getter} - Generates getters for all fields.</li>
 *   <li>{@code @Setter} - Generates setters for all fields.</li>
 *   <li>{@code @AllArgsConstructor} - Generates a constructor with arguments for all fields.</li>
 *   <li>{@code @NoArgsConstructor} - Generates a no-argument constructor.</li>
 * </ul>
 *
 * <p><b>Usage:</b></p>
 * <p>This class should be used to represent and manage exams associated with subjects in a learning management system.</p>
 *
 * <pre>{@code
 * // Example usage:
 * Exam exam = new Exam();
 * exam.setName("Final Exam");
 * exam.setSubject(mathSubject);
 * }</pre>
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Exam {

    /**
     * The unique identifier of the exam.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * The name of the exam.
     * Constraints:
     * - Must not be empty
     */
    @NotEmpty
    private String name;

    /**
     * The subject associated with the exam.
     * Relationship:
     * - Many exams can belong to one subject.
     */
    @ManyToOne
    private Subject subject;

    /**
     * The set of students enrolled in the exam.
     * Relationship:
     * - Many exams can be enrolled by many students.
     * - Prevents Jackson from infinitely serializing students.
     */
    @ManyToMany(mappedBy = "enrolledExams")
    @JsonBackReference
    private Set<Student> enrolledStudents = new HashSet<>();

    /**
     * Returns a string representation of the Exam object.
     *
     * @return a string representation of the Exam object.
     */
    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
