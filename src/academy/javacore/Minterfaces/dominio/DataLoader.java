package academy.javacore.Minterfaces.dominio;

public interface DataLoader {
	public abstract void load();
	default void checkPermission() {
		System.out.println("Fazendo checagem de permissões");
	}
}
