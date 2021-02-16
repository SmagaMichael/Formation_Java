package Exo_Gestion_De_Stock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program {

	 private static ArrayList<Article> stockArticle = new ArrayList<>(Arrays.asList(
				new Article(21, "ordi", 16f, 2),
				new Article(22, "clavier", 16f, 1),
				new Article(23, "souris", 16f, 2),
				new Article(24, "tapis de souris", 16f, 3),
				new Article(25, "ecran", (float) 16, 1)			 
			 )) ;

	
	private static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {

		int reponse = menu();
		switch (reponse) {
			case 1:
				rechercheArticleParReference();
				break;
			case 2:
				ajouterArticle();
				break;
			case 3:
				supprimerArticle();
				break;
			case 4:
				modifierArticle();
				break;
			case 8:
//				System.exit(0);
				break;
			default:
				System.out.println("Le choix ne correspond à aucune action!! Essaye de nouveau");
				main(args);
		}
		System.out.println("bye bye");
	}

	

	





	//MENU
	public static int menu() {
		System.out.println("----------------- MENU -----------------");
		System.out.println("1. Rechercher un article par référence.");
		System.out.println("2. Ajouter un article au stock en vérifiant l’unicité de la référence.");
		System.out.println("3. Supprimer un article par référence.");
		System.out.println("4. Modifier un article par référence.");
		System.out.println("5. Rechercher un article par nom.");
		System.out.println("6. Rechercher un article par intervalle de prix de vente.");
		System.out.println("7. Afficher tous les articles.");
		System.out.println("8. Quitter");
		return sc.nextInt();
	}
	
	public static void rechercheArticleParReference(){
		System.out.println("Quelle référence souhaites-tu trouver ?");
		int ref = sc.nextInt();
		for (Article article:stockArticle) {
			if(article.getRef() == ref) {
				System.out.println(article);
				break;
	}}}
	
	private static void ajouterArticle() {
		System.out.println("Quelle est sa référence ?");
		int ref = sc.nextInt();
		for (Article article : stockArticle) {
			if (article.getRef() == ref) {
				System.out.println("Désolé mais cet article existe déjà. Essaye de le modifier");
				return;
			}
		}
		Article article = new Article();
		article.setRef(ref);
		System.out.println("Quel est le nom de l'article ?");
		article.setName(sc.nextLine());
		System.out.println("Quel est le prix de l'article ?");
		article.setPrice(sc.nextFloat());
		System.out.println("Quelle est la quantité en stock de l'article ?");
		article.setQuantity(sc.nextInt());

		stockArticle.add(article);
		System.out.println("L'article a bien été rajouté dans le stock");
	}
	
	private static void supprimerArticle() {
		System.out.println("Quelle référence souhaites-tu supprimer ?");
		int ref = sc.nextInt();
		for (Article article : stockArticle) {
			if (article.getRef() == ref) {
				stockArticle.remove(article);
				System.out.println("L'article a bien été supprimé.");
				break;
			}
		}
	}
	
	private static void modifierArticle() {
		System.out.println("Quelle est sa référence ?");
		int ref = sc.nextInt();
		for (Article article : stockArticle) {
			if (article.getRef() == ref) {

				System.out.println("Quel est le nom de l'article ?");
				sc.nextLine();
				article.setName(sc.nextLine());

				System.out.println("Quel est le prix de l'article ?");
				article.setPrice(sc.nextFloat());

				System.out.println("Quelle est la quantité en stock de l'article ?");
				article.setQuantity(sc.nextInt());

				System.out.println("L'article a bien été modifié dans le stock");
				break;
			}
		}
		System.out.println(stockArticle);
	}
	
	
	
	
	
}
	

	
	
	
	
	
	
	
		

