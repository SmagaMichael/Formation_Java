package learning_io;

public class TechniqueString {

	public static void main(String[] args) {

		String line = "samuel;michaux;40;06.42.95.88.53;samuel.michaux@gmail.com";
		
		String[] tab = line.split(";");
		
		class User{
			
			String prenom;
			String nom;
			int age;
			String numTel;
			String email;
			
			@Override
			public String toString() {
				return "User [prenom=" + prenom + ", nom=" + nom + ", age=" + age + ", numTel=" + numTel + ", email="
						+ email + "]";
			}
			
			
		}
		
		User sam = new User();
		
		sam.prenom = tab[0];
		sam.nom = tab[1];
		sam.age = Integer.parseInt(tab[2]);
		sam.numTel = tab[3];
		sam.email = tab[4];
		
		System.out.println(sam);
		
		
	}

}
