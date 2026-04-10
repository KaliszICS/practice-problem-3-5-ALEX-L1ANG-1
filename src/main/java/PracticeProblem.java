/*
File Name: Problem Solving and Good Programming Style
Author: Alex Liang
Date Created: April 10, 2026
Date Last Modified: April 10, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String getFirstName(String names) {
		names = names.trim();
		return names.substring(0, names.indexOf(" "));
	}

	public static String getLastName(String names) {
		names = names.trim();
		return names.substring(names.lastIndexOf(" ") + 1);
	}

	public static boolean isValidName(String name) {
		if (!name.contains(" ")) {
			return false;
		} else if (name.indexOf(" ") != name.lastIndexOf(" ")) {
			return false;
		}
		else {
			String firstName = name.substring(0, name.indexOf(" "));
			String lastName = name.substring(name.indexOf(" ") + 1);
			if (firstName.length() < 2 || lastName.length() < 2) {
				return false;
			}
			else {
				return true;
			}
		}
	}
}
