package surprise;

import java.util.ArrayList;
import java.util.Random;

public class FortuneCookie implements ISurprise {
	private String message;
	private static Random randomNumber = new Random();
	
	
	private FortuneCookie(String message) {
		this.message = message;
	}
	
	@Override
	public void enjoy() {
		System.out.println("Ai primit o prajitura cu mesajul: \"" + this.message + "\"");
		}
	
	@Override
	public String toString() {
		return "Prajitura are mesajul: " + this.message + "";
	}
	
	public static FortuneCookie generate() {
		ArrayList<String> zicale = new ArrayList<>();
		zicale.add("Răspândeşte lumina, iar întunericul se va risipi de la sine");
		zicale.add("Adevărul nu este proprietatea unei singure persoane, ci comoara întregii omeniri.");
		zicale.add("Cuvintele sunt precum frunzele. Acolo unde ele abundă, arareori mai găseşti şi roade împrejur.");
		zicale.add("Dragostea înseamnă să iubeşte ce este greu de iubit. Altfe, nu poate fi numită o virtute.");
		zicale.add("O faptă bună este precum un clopot care cheamă oamenii la închinare.");
		zicale.add("A fura idei de la cineva, este plagiat. A le fura de la mai mulţi, este cercetare.");
		zicale.add("Nu poți trăi o zi perfectă fără să faci ceva pentru cineva care nu te va putea răsplăti niciodată");
		zicale.add("Fă trei preziceri corecte, consecutiv şi vei fi considerat un expert.");
		zicale.add("Viitorul. Perioada aceea în care afacerile noastre prosperă, prietenii ne sunt prieteni adevărați și fericirea ne este asigurată.");
		zicale.add("Întoarce-ți fața către soare și umbrele vor rămâne în urma ta.");
		zicale.add("Pot rezuma în două cuvinte tot ce am învățat despre viață: merge înainte.");
		zicale.add("Viața este ceva ce faci când nu te poți duce la culcare.");
		zicale.add("Dacă fericirea ta depinde de ceva ce face altcineva, atunci chiar ai o problemă.");
		zicale.add("Imposibilul poate fi împărțit oricând în posibilități.");
		zicale.add("Cei doi mari inamici ai fericirii sunt durerea și plictiseala.");
		zicale.add("Nu-mi place de acel om. Trebuie să-l cunosc mai bine.");
		zicale.add("Continuă să-ți spui că lucrurile vor merge rău și ai șanse mari să devii un profet.");
		zicale.add("Nu putem direcționa vântul, dar putem ajusta pânzele.");
		zicale.add("A avea un prieten este mai vital decât a avea un înger.");
		zicale.add("Cu şchiopii în loc de şezi, te înveţi să şchiopătezi.");
		zicale.add("Învăţătura e lumină ce-ţi face viaţa mai senină.");
		
		return new FortuneCookie(zicale.get(FortuneCookie.randomNumber.nextInt(20)));
		
	}

}
