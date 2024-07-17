package com.crio.learningnavigator.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * The Student entity represents a student enrolled in subjects and exams.
 *
 * <p>This class defines the structure of a student, including their unique identifier,
 * name, and sets of enrolled subjects and exams.</p>
 *
 * <p><b>Fields:</b></p>
 * <ul>
 *   <li>{@code Long id} - The unique identifier of the student.</li>
 *   <li>{@code String name} - The name of the student.</li>
 *   <li>{@code Set<Subject> enrolledSubjects} - The set of subjects in which the student is enrolled.
 *       <ul>
 *           <li>Relationship:</li>
 *           <ul>
 *               <li>{@code @ManyToMany(cascade = CascadeType.ALL)} - Many students can be enrolled in many subjects.</li>
 *               <li>{@code @JoinTable} - Defines the join table name and columns for the enrolled subjects.</li>
 *           </ul>
 *       </ul>
 *   </li>
 *   <li>{@code Set<Exam> enrolledExams} - The set of exams in which the student is enrolled.
 *       <ul>
 *           <li>Relationship:</li>
 *           <ul>
 *               <li>{@code @ManyToMany(cascade = CascadeType.ALL)} - Many students can be enrolled in many exams.</li>
 *               <li>{@code @JoinTable} - Defines the join table name and columns for the enrolled exams.</li>
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
 * <p>This class should be used to represent and manage students enrolled in subjects and exams within an educational system.</p>
 *
 * <pre>{@code
 * // Example usage:
 * Student student = new Student();
 * student.setName("Alice");
 * student.setEnrolledSubjects(subjects);
 * student.setEnrolledExams(exams);
 * }</pre>
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

    /**
     * The unique identifier of the student.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * The name of the student.
     */
    private String name;

    /**
     * The set of subjects in which the student is enrolled.
     * Relationship:
     * - Many students can be enrolled in many subjects.
     * - Defines the join table name and columns for the enrolled subjects.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Enrolled_Subjects",
            joinColumns = {
                    @JoinColumn(name = "student_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "subject_id", referencedColumnName = "id")
            })
    private Set<Subject> enrolledSubjects = new HashSet<>();

    /**
     * The set of exams in which the student is enrolled.
     * Relationship:
     * - Many students can be enrolled in many exams.
     * - Defines the join table name and columns for the enrolled exams.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Enrolled_Exams",
            joinColumns = {
                    @JoinColumn(name = "student_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "exam_id", referencedColumnName = "id")
            })
    private Set<Exam> enrolledExams = new HashSet<>();
}
