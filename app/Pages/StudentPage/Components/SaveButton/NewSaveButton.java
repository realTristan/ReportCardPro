package Pages.StudentPage.Components.SaveButton;

import java.util.List;
import java.util.Map;

import Pages.Manager;
import Pages.StudentPage.Components.SubjectInput;
import Pages.StudentPage.Components.GradeInput;
import Pages.StudentPage.StudentPage.Panel;

/**
 * A class for the save button.
 */
public class NewSaveButton {
	/**
	 * Constructs a new SaveButtonList object.
	 *
	 * @param panel   the manager to use for adding the button to the canvas
	 * @param manager the manager to use for the student page
	 * @param id      the id of the student
	 */
	public NewSaveButton(Panel panel, Manager manager, String id) {
		// Inputs array
		SubjectInput[] subjectInputs = new SubjectInput[4];
		GradeInput[] gradeInputs = new GradeInput[4];

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

		// Make the add new subject button
		new SaveButton(manager, panel, id, subjectInputs, gradeInputs);
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
		// Get the double grade
		double grade = (double) courses.get(i).get("grade");

		// Convert the double grade to a string
		return Double.toString(grade);
	}
}
