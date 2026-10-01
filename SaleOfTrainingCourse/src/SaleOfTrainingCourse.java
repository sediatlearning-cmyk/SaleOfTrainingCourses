import java.sql.SQLException;

import business.menu.IMenuSelection;
import business.menu.MenuSelectionImpl;

public class SaleOfTrainingCourse {
	
	
	public static void main(String[] args) throws SQLException {
		
		IMenuSelection menuSelectionImpl = new MenuSelectionImpl();
		
		menuSelectionImpl.menuSelection();
	}
}
