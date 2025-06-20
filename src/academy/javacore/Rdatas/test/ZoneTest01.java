package academy.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
	public static void main(String[] args) {
		Map<String, String> shortIds = ZoneId.SHORT_IDS;
		System.out.println(shortIds);
		System.out.println(ZoneId.systemDefault());
		
		ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
		System.out.println(tokyoZone);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		ZonedDateTime zonedDatTime = now.atZone(tokyoZone);
		System.out.println(zonedDatTime);
		
		Instant nowInstant = Instant.now();
		System.out.println(nowInstant);
		ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
		System.out.println(zonedDateTime2);
		
		System.out.println(ZoneOffset.MAX);
		System.out.println(ZoneOffset.MIN);
		
		ZoneOffset offsetManaus = ZoneOffset.of("4:00");
		OffsetDateTime offsetDateTime1 = now.atOffset(offsetManaus);
		System.out.println(offsetDateTime1);
		OffsetDateTime offsetDateTime2 =  OffsetDateTime.of(now, offsetManaus);
		System.out.println(offsetDateTime2);
		
		OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetManaus);
		System.out.println(offsetDateTime3);
		
		JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
		System.out.println(japaneseDate);
		LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
		JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
		System.out.println(meijiEra);

	}

}
