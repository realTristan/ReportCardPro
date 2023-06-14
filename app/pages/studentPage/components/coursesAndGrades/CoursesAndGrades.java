package pages.studentPage.components.coursesAndGrades;

import java.util.List;
import java.util.Map;

import pages.Manager;
import pages.studentPage.StudentPage.Panel;
import pages.studentPage.components.GradeInput;
import pages.studentPage.components.SubjectInput;

/**
 * A class for the save button.
 */
public class CoursesAndGrades {
	/**
	 * Constructs a new SaveButtonList object.
	 *
	 * @param manager        the page manager
	 * @param panel          the panel to use for adding the button to the canvas
	 * @param id             the id of the student
	 * @param subjectInputs  the subject inputs
	 * @param gradeInputs    the grade inputs
	 */
	public CoursesAndGrades(Manager manager, Panel panel, String id, SubjectInput[] subjectInputs, GradeInput[] gradeInputs) {
		// Get the student courses
		List<Map<String, Object>> courses = manager.cache.getStudentCourses(id);

		// Add the inputs to the canvas
		for (int i = 0; i < courses.size(); i++) {
			// Create the course input
			String subject = this.getCourseSubject(courses, i);
			subjectInputs[i] = new SubjectInput(panel, subject);

			// Create the grade input
			String grade = this.getCourseGrade(courses, i);
			gradeInputs[i] = new GradeInput(panel, grade);
		}
	}

	/**
	 * Gets the course subject.
	 *
	 * @param courses the courses
	 * @param i       the index
	 * @return the course subject
	 */
	private String getCourseSubject(List<Map<String, Object>> courses, int i) {
		return (String) courses.get(i).get("subject");
	}

	/**
	 * Gets the course grade.
	 *
	 * @param courses the courses
	 * @param i       the index
	 * @return the course grade
	 */
	private String getCourseGrade(List<Map<String, Object>> courses, int i) {
		return Double.toString((double) courses.get(i).get("grade"));
	}
}