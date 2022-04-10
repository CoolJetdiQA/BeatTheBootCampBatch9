package utilities;

import pages.Ferrari_Kitchens_CommonPage;
import pages.Ferrari_Kitchens_HomePage;
import pages.Fitness_CommonPage;
import pages.Fitness_HomePage;
import pages.Fitness_Login_Page;
import pages.Fitness_ShoppingCart_Page;
import pages.Fitness_SignUp_Page;

public class PageInitializer extends BaseClass{
	private static Ferrari_Kitchens_CommonPage fkCommonPage;
	private static Ferrari_Kitchens_HomePage fkHomePage;
	private static Fitness_CommonPage ftCommonPage;
	private static Fitness_HomePage ftHomePage;
	private static Fitness_Login_Page ftLoginPage;
	private static Fitness_ShoppingCart_Page ftShoppingCartPage;
	private static Fitness_SignUp_Page ftSignUpPage;
	
	public static void initialize() {
		fkCommonPage = new Ferrari_Kitchens_CommonPage();
		fkHomePage = new Ferrari_Kitchens_HomePage();
		ftCommonPage = new Fitness_CommonPage();
		ftHomePage = new Fitness_HomePage();
		ftLoginPage = new Fitness_Login_Page();
		ftShoppingCartPage = new Fitness_ShoppingCart_Page();
		ftSignUpPage = new Fitness_SignUp_Page();	
	}

	public static Ferrari_Kitchens_CommonPage getFkCommonPage() {
		return fkCommonPage;
	}

	public static Ferrari_Kitchens_HomePage getFkHomePage() {
		return fkHomePage;
	}

	public static Fitness_CommonPage getFtCommonPage() {
		return ftCommonPage;
	}

	public static Fitness_HomePage getFtHomePage() {
		return ftHomePage;
	}

	public static Fitness_Login_Page getFtLoginPage() {
		return ftLoginPage;
	}

	public static Fitness_ShoppingCart_Page getFtShoppingCartPage() {
		return ftShoppingCartPage;
	}

	public static Fitness_SignUp_Page getFtSignUpPage() {
		return ftSignUpPage;
	}
}
