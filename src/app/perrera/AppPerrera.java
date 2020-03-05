package app.perrera;

public class AppPerrera {

	static PerroDAO dao = new PerroDAOImpl();

	public static void main(String[] args) {

		System.out.println("Inetrefax gracica");
		pintarMenu();

		System.out.println(dao.getAll());

	}

	static void pintarMenu() {
		System.out.println("Sou un menu con opciones");
	}

}
