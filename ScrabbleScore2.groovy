package exercism

class ScrabbleScore2 {      

    static private letters = [

        "A": 1, "E": 1, "I": 1, "O": 1, "U": 1, "L": 1, "N": 1, "R": 1, "S": 1, "T": 1,
        "D": 2, "G": 2,
        "B": 3, "C": 3, "M": 3, "P": 3,
        "F": 4, "H": 4, "V": 4, "W": 4, "Y": 4,
        "K": 5,
        "J": 8, "X": 8,
        "Q": 10, "Z": 10
    ]

        
    static scoreWord(String word) {

        word.trim().toUpperCase().collect([0]) { letters.get(it) }.sum() // it could also be .collect() 
		
    }


	static void main(args) {
		println ScrabbleScore2.scoreWord("a")
		println ScrabbleScore2.scoreWord("AA")
		println ScrabbleScore2.scoreWord("superword")
		println ScrabbleScore2.scoreWord("SUPERWORD")
	}
	
}
