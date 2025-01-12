package academy.javacore.Csobrecargametodos.test;

import academy.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
	public static void main(String[] args) {
		Anime anime = new Anime();
		anime.init("Dragon Ball", "TV", 12, "Ação");
		anime.imprime();
	}

}
        