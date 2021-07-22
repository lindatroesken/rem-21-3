package de.neuefische.rem_21_3.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

class StudentDBTest {

    @Test
    public void testSetupDBWithoutAnyStudents() {
        // GIVEN
        // init db with empty array
//        Student[] students = {  /* students .... */};
        Map<Integer, Student> students = new HashMap<>();
        StudentDB studentDB = new StudentDB(students);

        // WHEN
        int actualAmountOfStudents = studentDB.list().size();

        // THEN
        int expectedAMountOfStudentsInDB = 0;
        assertEquals(expectedAMountOfStudentsInDB, actualAmountOfStudents);
    }

    @Test
    public void testSetupDBWithStudentsLength() {
        // GIVEN
        // init db with non empty array
        Student studentKlaus = new Student(1, "Klaus");
        System.out.println(studentKlaus);
        Student studentMarie = new Student(2, "Marie");
        Map<Integer, Student> mapOfStudents = new HashMap<>();

        //diese beiden Zeilen machen das Selbe
        mapOfStudents.put(studentKlaus.getId(),studentKlaus);
        mapOfStudents.put(studentMarie.getId(),studentMarie);

        StudentDB studentDB = new StudentDB(mapOfStudents);


        // WHEN
        System.out.println(studentDB);
        int actualAmountOfStudents = studentDB.list().size();

        // THEN
        int expectedAMountOfStudentsInDB = 2;
        assertEquals(expectedAMountOfStudentsInDB, actualAmountOfStudents);
    }

    @Test
    public void testSetupDBWithStudentsEquals() {
        // GIVEN
        Student studentKlaus = new Student(1, "Klaus");
        Student studentMarie = new Student(2, "Marie");
       Map<Integer, Student> dbStudents = new HashMap<>();
       dbStudents.put(studentKlaus.getId(), studentKlaus);
       dbStudents.put(studentMarie.getId(), studentMarie);
        StudentDB studentDB = new StudentDB(dbStudents);

        // WHEN
        String actualStudents = studentDB.list().toString();

        // THEN
        String expectedStudents = "{1=[id=1, name=Klaus], 2=[id=2, name=Marie]}";
        assertEquals(expectedStudents, actualStudents);
    }
//
//    @Test
//    public void testStudentDBWithStudentsToString() {
//        // GIVEN
//        Student studentKlaus = new Student("Klaus");
//        Student studentMarie = new Student("Marie");
//        Student[] students = {studentKlaus, studentMarie};
//        StudentDB studentDB = new StudentDB(students);
//
//        // WHEN
//        String actualStudentDBString = studentDB.toString();
//
//        // THEN
//        String expectedStudentString = "[id=-1, name=Klaus],[id=-1, name=Marie]";
//        assertEquals(expectedStudentString, actualStudentDBString);
//    }
//
//    @Test
//    public void testRandomStudent() {
//        // GIVEN
//        Student studentKlaus = new Student("Klaus");
//        Student studentMarie = new Student("Marie");
//        Student studentJohn = new Student("John");
//        Student[] students = {studentKlaus, studentMarie, studentJohn};
//        StudentDB studentDB = new StudentDB(students);
//
//        boolean klausSelected = false;
//        boolean marieSelected = false;
//        boolean johnSelected = false;
//
//        // WHEN - repeated calls to random student to prove that any of the students will be selected at least once
//        int maxLoops = 100;
//
//        int i = maxLoops;
//        while (!klausSelected || !marieSelected || !johnSelected) {
//            Student actualRandomStudent = studentDB.getRandomStudent();
//
//            // THEN
//            assertNotNull(actualRandomStudent);
//            if (!klausSelected) {
//                klausSelected = studentKlaus.equals(actualRandomStudent);
//            }
//            if (!marieSelected) {
//                marieSelected = studentMarie.equals(actualRandomStudent);
//            }
//            if (!johnSelected) {
//                johnSelected = studentJohn.equals(actualRandomStudent);
//            }
//
//            --i;
//
//            if (i == 0) {
//                // if students where not randomly selected the "while" will loop infinitely, add additional break
//                fail("Some students not randomly selected within " + maxLoops + " invocations");
//            }
//        }
//
//        // THEN - At least any of the students should be randomly selected
//    }
//
//    @Test
//    public void testAddStudent() {
//        // GIVEN
//        Student studentKlaus = new Student("Klaus");
//        Student studentMarie = new Student("Marie");
//        Student studentJohn = new Student("John");
//        Student[] students = {studentKlaus, studentMarie, studentJohn};
//        StudentDB studentDB = new StudentDB(students);
//
//        // WHEN
//        Student studentKlara = new Student("Klara");
//        studentDB.add(studentKlara);
//        Student[] actual = studentDB.list();
//
//        // THEN
//        Student[] expected = {studentKlaus, studentMarie, studentJohn, studentKlara};
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testRemoveStudent() {
//        // GIVEN
//        Student studentKlaus = new Student("Klaus");
//        Student studentMarie = new Student("Marie");
//        Student studentJohn = new Student("John");
//        Student studentKlara = new Student("Klara");
//        Student[] students = {studentKlaus, studentMarie, studentJohn, studentKlara};
//        StudentDB studentDB = new StudentDB(students);
//
//        // WHEN
//        studentDB.remove(studentMarie);
//        Student[] actual = studentDB.list();
//
//        // THEN
//        Student[] expected = {studentKlaus, studentJohn, studentKlara};
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testRemoveUnknownStudent() {
//        // GIVEN
//        Student studentKlaus = new Student("Klaus");
//        Student studentMarie = new Student("Marie");
//        Student studentJohn = new Student("John");
//        Student studentKlara = new Student("Klara");
//        Student[] students = {studentKlaus, studentMarie, studentJohn, studentKlara};
//        StudentDB studentDB = new StudentDB(students);
//
//        // WHEN
//        Student studentUnknown = new Student("Unknown");
//        studentDB.remove(studentUnknown);
//        Student[] actual = studentDB.list();
//
//        // THEN
//        Student[] expected = {studentKlaus, studentMarie, studentJohn, studentKlara};
//        assertArrayEquals(expected, actual);
//    }
}
