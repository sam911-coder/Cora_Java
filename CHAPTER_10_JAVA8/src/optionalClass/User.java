package optionalClass;

import java.util.Optional;

public class User {

	// without optional object 
	public String getUserNameById(Integer id) {

		if (id == 100) {
			return "Raju";
		} else if (id == 101) {
			return "Rani";
		} else if (id == 102) {
			return "John";
		} else {
			return null;
		}
	}

	
	// with optional object 
	public Optional<String> getUserName(Integer id) {
		String name = null;

		if (id == 100) {
			name = "Raju";
		} else if (id == 101) {
			name = "Rani";
		} else if (id == 102) {
			name = "John";
		}
		return Optional.ofNullable(name);
	}
}
