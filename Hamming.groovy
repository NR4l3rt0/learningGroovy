package exercism

class Hamming {

//	def distance(String strand1, String strand2) {
//
//		println "Length strand1 -> ${strand1.length()}"
//		println "Length strand2 -> ${strand2.length()}"
//
//		if(strand1.length() != strand2.length()) {
//
//			throw new RuntimeException('Sequences with different lenghts')
//			
//		} else {
//
//			int hammingDistance
//
//			for(int i = 0; i < strand1.length(); i++) {
//				if (strand1[i] != strand2[i])
//					hammingDistance++
//			}
//			
//			println "The hamming distance is ${hammingDistance}"
//		}
//
//
//	}
	
	def distance(strand1, strand2) {
		
				def str1 = strand1 as String
				def str2 = strand2 as String
				
				if(str1.length() != str2.length()) {
					throw new RuntimeException('Sequences with different lenghts')
					
				} else {
		
					int hammingDistance
					for(int i = 0; i < str1.length(); i++) {
						if ((String)strand1[i] != (String)strand2[i])
							hammingDistance++
					}
					
					return hammingDistance
				}
			
	}


	static void main(args) {
//	 new Hamming().distance('GAGCCTACTAACGGGAT','CATCGTAATGACGGCCT')
	 println new Hamming().distance('','')
	 }
	 
}
