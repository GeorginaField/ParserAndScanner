package uebungsprojekt.exercises;

public class RecursionExercise {

	public int fibonacci (int n) {
		if(n != 0 && n != 1){
			return fibonacci( n - 1) + fibonacci( n - 2);
		}else{
			return  1;
		}
		// TODO: implementiere die Fibonacci sequenz.
		//  Die n. fibonacci zahl ist die summe der zwei vorherigen, und f_0 = 1 und f_1 = 1
	}

	public int sumBetween (int a, int b) {
		if( a < b){
			return  sumBetween(a + a + 1,b);
		}
		// TODO gib die summe aller zahlen zwischen a und b zurück
		return -1;
	}
	public void printRec (int[] arr, int n) {
		// TODO gib alle zahlen des arrays in der richtigen reihenfolge ohne newlines aus
	}

	public void printBackwardsRec (int[] arr, int n) {
		// TODO wie printRec aber mit dem letzten element zuerst
	}

	public void quicksort (int[] arr) {
		// TODO implementiere quicksort in-place
	}
}
