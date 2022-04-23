package exercism

class DifferenceOfSquares {
	
		def num;
		
		DifferenceOfSquares(num) {
			this.num = num;
		}
	
		def squareOfSum() {
			int squareOfSumNum;
			
			for (int i = this.num; i >= 1; i--) {
				squareOfSumNum += i
			}
	
			return squareOfSumNum * squareOfSumNum
		}
	
		def sumOfSquares() {
			
			int sumOfSquaresNum;
			
			for (int i = 1; i <= this.num; i++) {
				sumOfSquaresNum += i * i
			}
	
			return sumOfSquaresNum
			
		}
	
		def difference() {
	
			return this.squareOfSum() - this.sumOfSquares()
		}
	
	}
	