package academy.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
	public static void main(String[] args) {
		Locale localeDefault = Locale.getDefault();
		Locale localeBR = Locale.of("pt", "BR");
		Locale localeJP = Locale.JAPAN;
		Locale localeIT = Locale.ITALY;
		
		NumberFormat[] nfa = new NumberFormat[4];
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(localeJP);
		nfa[2] = NumberFormat.getInstance(localeBR);
		nfa[3] = NumberFormat.getInstance(localeIT);
		
		double valor = 1000_000_000.2130;
		
		for (NumberFormat numberFormat : nfa) {
			System.out.println(numberFormat.format(valor));
		}
	}
}

