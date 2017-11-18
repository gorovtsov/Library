package by.htp.library.bean.comparator;

import java.util.Comparator;

import by.htp.library.bean.User;

public class UserLoginComparator implements Comparator<User> {

	@Override
	public int compare(User u1, User u2) {
		if (u1.getId() < u2.getId()) {
			return -1;
		}
		if (u1.getId() > u2.getId()) {
			return 1;
		} else {
			return 0;
		}
	}

}
