package sampleCalendar;

import java.util.Calendar;

/*
 * カレンダーを作成
 * 日付部分の作成クラス
 */
public class MyCalendar1 {

	public static void main(String[] args) {

		// 実行時の日付/時刻情報を持つカレンダーインスタンスを作成(例 2021/01/08 22:00:00)
		Calendar cal = Calendar.getInstance();

		// インスタンスの持つ日付情報を1日に変更(例 2021/01/01 22:00:00)
		cal.set(Calendar.DATE, 1);

		// DAY_OF_WEEKでその日の曜日を返す(日曜:1, 月:2, 火:3,,,,土:7より、2021/01/01は金曜なので6が返される)
		// つまりカレンダーの1番上の行のブランク(空白部分)の個数を求める
		int beforeBlank = cal.get(Calendar.DAY_OF_WEEK) - 1;

		// その月が何日まであるかを求める(1月は31日)
		int daysCount = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		// カレンダーの作成
		// ブランクと日数分ループを回す
		for(int i = 0; i < beforeBlank + daysCount; i++) {

			String str = "";	// ブランクは空文字

			// 最初のブランク分過ぎたら日付をString型変数strに足していく
			if(i >= beforeBlank) {

				// カウンター変数iから求める実際の日付
				int date = i + 1 - beforeBlank;		// ブランクが5とすると、5+1-5=1, 6+1-5=2, 7+1-5=3・・・35+1-5=31
				str = String.valueOf(date);

			}

			// 4文字分のスペースを使って描画
			System.out.printf("%4s", str);

			// 7個出力したら改行
			if((i + 1) % 7 == 0) {
				System.out.println();
			}

		}

		System.out.println();

	}

}
