User Stories

TDD -> Define Tests then Implement Code.

Users

Example of User Stories/Engineering Stories.

Goals are small, well-defined, and focused.

can create a Task with 

1. Projects needs to do X
 a. I need to do Y to achieve X
 b. I need to do Z to achieve Y

User story: As a User, I want to call the current weather
1. Get Data from Weather API
 a. Call data using button
 b. Use Open Mateo as no API key required

Engineering Stories

Engineering Story: As an Engineer I want to see unit tests
1. Implement Unit Tests
 a. use Jest and start with script.js file


BackLog:
1. Create a timer so that when a task is chosen, the amount of time spent on that task is stored.
2. Hold a constant timed repletion system that reminds the user when a task has been accessed a day ago, a week ago, 2 weeks ago, and 4 weeks ago.
3. A way to view a day, month, and year by color coding indicating when work was done and when work was not done
4. An analytics place to view how and when you work.
5. 

BreakDown of Task manager

User Story: As a User, I want to create a task
 a. to create a task I need to input the data for that task
 c. Data Persists in Database
 f. Object needs to be turned into Database Entry 

 d. Requires sqlite DB to be create and connection made (PARTIAL)
 e. Object needs to be defined (DONE)
	 b. Data: Name of Task, Type of Task, Larger Project that Task is in, Subtasks, and What that Task is, and Status

Engineering STory: As an Engineer, I want to see tests for all main features that are implemented
 a. Creating a Task
 b. Editing a Task
 c. Deleting a Task
 d. Adding a Subtask to a Task
 e. Looking at all tasks


 

User Story: As a User I want to edit a task
 a. Find a task based on name, type, larger project, or details of its description
 b. Choose a piece of the task and edit it
 c. Data Persists in Database

User Story: As a User I want to delete a task
 a. Find a task based on name, type, larger project, or details of its description
 b. Delete that task and it's subtasks
 c. Data removed from database

User Story: As a User I want to view all projects, all tasks, and all subtasks
 a. View all projects with a Dropdown for Tasks and a Dropdown for Subtasks.
 b. Query all tasks in the database while accounting for subtasks
 c. 


Three Tier Layer Architecture


Presentation Tier
- JavaFX

Business Tier
- Implementations of data tier

- Task Object
- Project Object
- Lombok

Data Tier
-  JDBC


Technologies:
1. JavaFX
2. JDBC
3. SQLite
4. JUNit
5. Maven
6. Git


https://github.com/xerial/sqlite-jdbc
