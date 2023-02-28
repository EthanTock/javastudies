# Unit 6 Design Process

### Ex 1

Observed:
* Validity of a 4-digit code
	* Valid if d4 = sum(d1, d2, d3) / 7
		* Store individual digits in a FourDigitCode object?
		* check validity in this class too
* Person will be able to enter (GUI)

Algorithm:
o  Run main()
-> Take in code (GUI)
-> Turn code into a FourDigitCode object (Manager class)
-> Check FourDigitCode.isValid() (FourDigitCode)
-> Display success/failure (GUI)
-> Unlock photocopier? (Photocopier)

Stepwise Refinement:
1. Create main() as a _top-down_ approach
	* Write steps of the algorithm in
2. Create the GUI class
	* Make a pretty window
	* Make the text input field
	* Be able to output what's in the input field
3. Create the FourDigitCode class
	* Take in a String
	* Put an isFourDigitCode() method into the constructor to check validity
	* Convert the String into four _int_ s
	* Program an isValid() method
4. GUI can now call the FourDigitCode to check its validity
	* Display message if the code is not four digits
	* Call for validity
	* Display success/failure window
5. Put the algorithm into the main()
6. Run unit tests


### Ex 2

Observed:
* Create a grade book that teachers can interact with
* List of students in the class
	* For any class in the teacher's schedule
* Provide a GUI Menu
	* Create a new class of students
	* Enter a set of scores for any class
	* Correct wrong data (interact with singular scores)
	* Display the record of any student
	* Calculate the final grade for each student in each class
	* Print a class list, with or without grades
	* Add a student, delete a student, or move it to another class
	* Save all of the data to a file (.json)

Classes;
o  Run main() (Runner)
-> Read previous data from the .json file (FileHandler)
-> Create each Class's Student objects (Classroom & Student)
-> Create Gradebook class to hold all of the Classroom s and their times (Planner)
-> Create GradebookInterface class for interaction between the Menu and the Gradebook (GradebookInterface)
-> Create Menu GUI (Menu)
-> Menu interactions with GradebookInterface (Menu methods)
-> Menu can save to a file (FileHandler)

Stepwise Refinement:
1. Bottom-up approach.
2. Program the Grades class
	* This class will be able to hold a certain class' grades. It won't store which student owns it.
	* This will store the name, percent, and letter grade of indefinitely many assignments.
	* Have separate parts for homework, summative, and formative assessments. These may be the only specific grades saved for later.
	* Have some methods for retrieving and replacing information.
	* Have a method to add an assignment with a name and percent grade (letter grade is automatically figured out by a helper method)
	* Have a method that can add all of the percent grades, then, based on weighting, create a final average grade.
	* All grades will be stored in Grade objects... these are simple enough.
3. Program the Student class
	* Have their name, DoB, record, other information in the class.
	* They will have their current grade in the class as a Grades object in their currentClasses ArrayList<Grades>.
	* Past grades will be stored only as a letter grade and percentage. This is also a Grades object, but with all of the little assignments taken out.
	* Have a getGrades(className) method.
	* Getting all of their grades would use the Map<String, Grades> getRecord() method.
	* Be able to change the Student's name (this is important!!)
	* As for transferring classes, it can just keep all of its previous Grades.
4. Program the StudentGroup class
	* This can hold multiple students, just like a classroom.
	* This class will store all of the students in a Map, with their names as the keys.
	* The StudentGroup will be able to use the .getGrades(className) method on every student in its ArrayList.
	* Implement add(Student), remove(Student). Transferring a student will do both in separate StudentGroup s.
	* Have a meeting time/day of week/type of day piece. You can use a method to change this piece of information.
	* Have a formatStudentList(style) method which can return a String with all of the students and their grades, or without their grades.
5. Program the ClassPlanner class
	* This is a list of StudentGroup objects. 
	* Have a method that can add, delete, or transfer students from classes. 
	* Be able to call upon any StudentGroup, where you can call upon any Student, where you can call upon their Grades or record.
6. Have a FileHelper class
	* This class can write the ClassPlanner to a json file.
	* Really just takes a Map and turns it into json
	* Also can do the reverse on an existing json file; turns it into a ClassPlanner object.
7. Have a MenuGUI class
	* To be initialized it takes a .json filename, which it can then read to show information.
	* This class would be the GUI for interacting with the ClassPlanner.
	* It would have a layer-based system, where you'd have
		* ClassPlanner with all your classes
			* StudentGroup with all of the students in the class (with or without letter grades)
				* Student with all of the student's grades
	* It would have widgets to mutate all information in each tab.
	* It would have a button to Save and Quit, which would save all of the information to a .json file.

json:
GradeBook
{
	"AP COMP SCI A": StudentGroup
	{
		"name": AP Computer Science A 2022-2023",
		"datetimes":
		[
			"BLACK 3B"
		]
		"students":
		{
			"Quentin Januel": Student
			{
				"name": "Quentin Januel",
				"gradeWeights":
				{
					"homework": 20,
					"summative": 30,
					"formative": 30,
					"exam": 20
				},
				"grades": Grades
				{
					"homework":
					{
						"Unit 6 HW 1": Grade
						{
							"name": "Unit 6 HW 1",
							"percent": 85,
							"letter": B
						}
						...
					}
					...
				}
			}
			"Raetsel Kaetzchen": Student
			{
				...
			}
		}
	},
	"AP CALCULUS AB": StudentGroup
	{
		...
	}
}

so,
final Stepwise Refinement:
1. Program the Grade class
	* Contains an assignment name, percent grade, and letter grade.
	* Accessor and mutator methods.
2. Program the Grades class
	* Contains multiple _Grade_ s with assignment names in a HashMap.
	* Splits up the HashMap into homework, summative, and exam grades.
	* There is a section for weighting the grade sections.
	* Can find the average percent grade, then letter grade.
	* Contains a class name.
	* Mutator and accessor methods.
3. Program the Student class
	* Contains multiple _Grades_ s in a Map. Known as "record".
	* The _Grades_ s are split by year and semester in the Map.
	* The name, gender, age, etc. of the student are stored.
	* There are mutator and accessor methods.
4. Program the StudentGroup class
	* Contains multiple _Student_ s stored in a Map, sorted by name.
	* Stores its name, year, semester, and dates.
	* Contains mutator and accessor methods.
	* Can add a new Grade to every Student's Grades in this class.
5. Program the GroupPlanner class
	* Contains multiples _StudentGroup_ s stored in a Map, sorted by name.
	* Can access any piece of information in its tree of data.
	* Can return String representations of any of the objects.
	* Can move, delete, and add _Student_ s.
6. Program the FileHandler class
	* Can save the whole GroupPlanner info tree to a .json file.
	* Can read a .json file and return a GroupPlanner object.
7. Program the MenuGUI class
	* Displays the contents of the GroupPlanner on the homepage.
	* Can go to parts of the GroupPlanner to explore.
	* Be able to change, add, or delete information wherever.
	* Display the structures prettily; with or without grades.
	* Initialized with a FileHandler, Save and Quit returns one too.

### Ex 3

Battleships lmao
