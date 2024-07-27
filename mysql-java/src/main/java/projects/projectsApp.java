package projects;

import projects.dao.DbConnection;
import projects.exception.DbException;

public class projectsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	DbConnection.getConnection();
} catch (DbException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
