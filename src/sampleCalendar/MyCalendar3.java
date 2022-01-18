package sampleCalendar;

import java.util.Calendar;

/**
 * カレンダー作成クラス
 * 年/月を追加
 *
 */
public class MyCalendar3 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		// 年と月を取得
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;	// Calendarクラスでは0が1月、1が2月となるので取得する際は1足す

		cal.set(Calendar.DATE, 1);
		int beforeBlank = cal.get(Calendar.DAY_OF_WEEK) - 1;
		int daysCount = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		// 年と月を出力
		System.out.printf("%16d/%d%n", year, month);

		String[] weeks = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		for(String s : weeks) {

			System.out.printf("%4s", s);

		}
		System.out.println();

		for(int i = 0; i < beforeBlank + daysCount; i++) {

			String str = "";
			if(i >= beforeBlank) {

				int date = i + 1 - beforeBlank;
				str = String.valueOf(date);

			}

			System.out.printf("%4s", str);

			if((i + 1) % 7 == 0) {
				System.out.println();
			}

		}

		System.out.println();

	}

}
