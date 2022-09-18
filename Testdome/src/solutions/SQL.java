package solutions;

public class SQL {
	
	/*TASK 1
	 * A project management tool keeps data in the following two tables (check CREATE below) 
	 * 
	 * Write a query that selects task id, author name and asigsignee name for each task. 
	 * If there is no assignee for a task the query should return null instead of the assignee name.
	 * 
	-- Suggested testing environments 
	-- For MS SQL: 
	-- https://sqliteonline.com/ with language set as MS SQL 
	-- For MySQL: 
	-- https://www.db-fiddle.com/ with MySQL version set to 8 
	-- For SQLite: -- http://sqlite.online/ 
	-- Put the following without '--' at the top to enable foreign key support in SQLite. 
	-- PRAGMA foreign_keys = ON; 
	-- Example case create statement: 
		CREATE TABLE employees ( id INTEGER NOT NULL PRIMARY KEY, name VARCHAR(30) NOT NULL ); 
		CREATE TABLE tasks ( id INTEGER NOT NULL PRIMARY KEY, authorId INTEGER NOT NULL, assigneeId INTEGER, FOREIGN KEY (authorId) REFERENCES employees (id), FOREIGN KEY (assigneeId) REFERENCES employees (id) ) 
		INSERT INTO employees(id, name) VALUES(1, 'Richard'); 
		INSERT INTO employees(id, name) VALUES(2, 'Lily'); 
		INSERT INTO tasks(id, authorId, assigneeId) VALUES(1, 1, NULL); 
		INSERT INTO tasks(id, authorId, assigneeId) VALUES(2, 2, 1); 
	-- Expected output (in any order): 
	-- id author assignee 
	-- ---------------------- 
	-- 1 Richard 
	-- 2 Lily Richard
	*/
	
	/*SOLUTION
	 *  select t.id, e.name as author, em.name as assignee
		from tasks t left join
		employees e
		on e.id = t.authorid left join
		employees em
		on em.id = t.assigneeid;
	 */
	
}
