import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		
		return students;
	}

	@Override
	public void setStudents(Student[] students) throws IllegalArgumentException {
		if(students == null){
			throw IllegalArgumentException;
		}
		else{
			for(int i:students){
				this.students[i]=students[i];
			}
		}
	}

	@Override
	public Student getStudent(int index) throws IllegalArgumentException{
		if(student[index] < 0 || student[index] > student.length){
			throw IllegalArgumentException;
		}
		
	}

	@Override
	public void setStudent(Student student, int index) throws IllegalArgumentException, {
		if(student==null){
			throw IllegalArgumentException;
		}else if(student[index] < 0 || student[index] > student.length){
			throw IllegalArgumentException;
		}else{
			this.student[index]=student;
		}
	}

	@Override
	public void addFirst(Student student) {
		if(student==null){
			throw IllegalArgumentException;
		}else{
			this.student[0]=student;
		}
	}

	@Override
	public void addLast(Student student) {
		if(student==null){
			throw IllegalArgumentException;
		}else{
			this.student[student.length-1]=student;
		}
	}

	@Override
	public void add(Student student, int index) {
		if(student==null){
			throw IllegalArgumentException;
		}else{
			this.student[index]=student;
		}
	}

	@Override
	public void remove(int index) throws IllegalArgumentException {
		if(students[index] < 0 || student[index] > student.length){
			throw IllegalArgumentException;
		}else{
			this.students[index]=null;
		}
	}

	@Override
	public void remove(Student student) throws IllegalArgumentException {
		if(student==null){
			throw IllegalArgumentException;
		}else{
			students[student]=null;
		}
	}

	@Override
	public void removeFromIndex(int index) throws IllegalArgumentException {
		if(students[index] < 0 || student[index] > student.length){
			throw IllegalArgumentException;
		}else{
			for(int i=index;i<students.length;i++){
				students[i]=null;
			}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
