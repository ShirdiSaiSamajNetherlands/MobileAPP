package nl.shirdisaisamaj.mobile.helper;

import java.util.Calendar;
import java.util.Date;

import nl.shirdisaisamaj.mobile.model.Member;

public final class Helper {

	public static Member processMember(Member member) {
		if (member.getDateOfBirth() != null) {
			member.setAge(calculateAge(member.getDateOfBirth()));
		}
		return member;
	}

	private static int calculateAge(Date birthDate) {
		int years = 0;
		int months = 0;
		//create calendar object for birth day
		Calendar birthDay = Calendar.getInstance();
		birthDay.setTimeInMillis(birthDate.getTime());
		//create calendar object for current day
		long currentTime = System.currentTimeMillis();
		Calendar now = Calendar.getInstance();
		now.setTimeInMillis(currentTime);
		//Get difference between years
		years = now.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
		int currMonth = now.get(Calendar.MONTH) + 1;
		int birthMonth = birthDay.get(Calendar.MONTH) + 1;
		//Get difference between months
		months = currMonth - birthMonth;
		//if month difference is in negative then reduce years by one and calculate the number of months.
		if (months < 0 || (months == 0 && now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))) {
			years--;
		}
		return years;
	}
}