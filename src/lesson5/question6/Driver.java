package lesson5.question6;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Computer comp1 = new Computer("Asus","Intel",12,12,500);
		Computer comp2 = new Computer("Samsung","Intel",12,12,500);
		Computer comp3 = comp2;
		Notebook note1 =  new Notebook("Toshiba","Intel",12,12,500,16,20,120);
		Notebook note2 =  new Notebook("Acer","Intel",12,12,500,16,20,120);
		Notebook note3 =  (Notebook)note2.clone();
		Notebook note4 =  note2;
		

		System.out.println("comp1.equals(comp2) => " + comp1.equals(comp2));
		System.out.println("comp2.equals(comp3) => " + comp2.equals(comp3));
		System.out.println("comp2.equals(comp3) => " + comp2.equals(comp3));
		System.out.println("comp1.hashCode() => " + comp1.hashCode());
		System.out.println("comp2.hashCode() => " + comp2.hashCode());
		System.out.println("comp3.hashCode() => " + comp3.hashCode());
		
		System.out.println("note1.equals(note2) => " + note1.equals(note2));
		System.out.println("note2.equals(note3) => " + note2.equals(note3));
		System.out.println("note3.equals(note4) => " + note3.equals(note4));
		System.out.println("note1.hashCode() => " + note1.hashCode());
		System.out.println("note2.hashCode() => " + note2.hashCode());
		System.out.println("note3.hashCode() => " + note3.hashCode());
				

		
	}

}
