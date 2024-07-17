package com.crio.learningnavigator.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * The Subject entity represents a subject that students can enroll in.
 *
 * <p>This class defines the structure of a subject, including its unique identifier,
 * name, and a set of students enrolled in the subject.</p>
 *
 * <p><b>Fields:</b></p>
 * <ul>
 *   <li>{@code Long id} - The unique identifier of the subject.</li>
 *   <li>{@code String name} - The name of the subject.</li>
 *   <li>{@code Set<Student> enrolledStudents} - The set of students enrolled in the subject.
 *       <ul>
 *           <li>Relationship:</li>
 *           <ul>
 *               <li>{@code @ManyToMany(mappedBy = "enrolledSubjects")} - Many subjects can be enrolled by many students.</li>
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
 * <p>This class should be used to represent and manage subjects that students can enroll in within an educational system.</p>
 *
 * <pre>{@code
 * // Example usage:
 * Subject subject = new Subject();
 * subject.setName("Mathematics");
 * subject.setEnrolledStudents(students);
 * }</pre>
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Subject {

    /**
     * The unique identifier of the subject.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * The name of the subject.
     */
    private String name;

    /**
     * The set of students enrolled in the subject.
     * Relationship:
     * - Many subjects can be enrolled by many students.
     * - Prevents Jackson from infinitely serializing students.
     */
    @ManyToMany(mappedBy = "enrolledSubjects")
    @JsonBackReference
    private Set<Student> enrolledStudents = new HashSet<>();

    /**
     * Constructs a Subject with the given name.
     *
     * @param name the name of the subject
     */
    public Subject(String name) {
        this.name = name;
    }

    /**
     * Constructs a Subject with the given identifier.
     *
     * @param id the unique identifier of the subject
     */
    public Subject(Long id) {
        this.id = id;
    }

    /**
     * Constructs a Subject with the given identifier and name.
     *
     * @param id   the unique identifier of the subject
     * @param name the name of the subject
     */
    public Subject(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Returns a string representation of the Subject object.
     *
     * @return a string representation of the Subject object
     */
    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
