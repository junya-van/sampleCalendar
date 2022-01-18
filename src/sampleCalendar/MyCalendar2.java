package sampleCalendar;

import java.util.Calendar;

/**
 * カレンダーを作成するクラス
 * 曜日見出し付き
 *
 */
public class MyCalendar2 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.DATE, 1);
		int beforeBlank = cal.get(Calendar.DAY_OF_WEEK) - 1;
		int daysCount = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		// 曜日見出しの作成
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
