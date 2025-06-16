package academy.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
		String s2 = date.format(DateTimeFormatter.ISO_DATE);
		String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		LocalDate parse1 = LocalDate.parse("20210219", DateTimeFormatter.BASIC_ISO_DATE);
		LocalDate parse2 = LocalDate.parse("2021-02-19", DateTimeFormatter.ISO_DATE);
		LocalDate parse3 = LocalDate.parse("2021-02-19", DateTimeFormatter.ISO_LOCAL_DATE);

		System.out.println(parse1);
		System.out.println(parse2);
		System.out.println(parse3);
		
		LocalDateTime now = LocalDateTime.now();
		String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(s4);
		
		LocalDateTime parse4 = LocalDateTime.parse("2025-06-16T20:45:34.5437846", DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(parse4);
		//dd//MM/yyyy
		//MM/dd//yyyy
		//yyyy/MM/dd
		
		DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatBR = LocalDate.now().format(formatterBr);
		System.out.println(formatBR);
		LocalDate parseBr = LocalDate.parse("19/02/2021", formatterBr);
		System.out.println(parseBr);

		DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
		String formatGR = LocalDate.now().format(formatterGR);
		System.out.println(formatGR);
		LocalDate parseGR = LocalDate.parse("19.Februar.2021", formatterBr);
		System.out.println(parseGR);


	}

}
