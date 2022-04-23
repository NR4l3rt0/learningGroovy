package exercism

class ScrabbleScore {

	static scoreWord(String word) {

		def value1 = ['A', 'E','I','O','U','L','N','R','S','T']
		def value2 = ['D', 'G']
		def value3 = ['B', 'C', 'M', 'P']
		def value4 = ['F', 'H', 'V', 'W', 'Y']
		def value5 = ['K']
		def value8 = ['J', 'X']
		def value10 = ['Q', 'Z']
		int totalPoints

		println value1*.toLowerCase().contains('a')
		value1.addAll(value1*.toLowerCase())
		// Otra forma de expresarlo sería así, pero con + no altera value2
		println value2 + value2*.toLowerCase()
		
		for (letter in word){
			println letter
			switch(letter){
				case value1:
				case value1*.toLowerCase():
					totalPoints += 1
					break
				case value2*.toLowerCase():
					totalPoints += 2
					break
				case value3:
				case value3*.toLowerCase():
					totalPoints += 3
					break
				case value4:
				case value4*.toLowerCase():
					totalPoints += 4
					break
				case value5:
				case value5*.toLowerCase():
					totalPoints += 5
					break
				case value8:
				case value8*.toLowerCase():
					totalPoints += 8
					break
				case value10:
				case value10*.toLowerCase():
					totalPoints += 10
					break
			}
		}
		println totalPoints
	}



	static void main(args) {
		ScrabbleScore.scoreWord("a")
		ScrabbleScore.scoreWord("AA")
	}
}
