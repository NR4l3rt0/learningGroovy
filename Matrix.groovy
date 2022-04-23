package exercism

class Matrix {

	def myList = []
	
    Matrix(String asString) {
		this.myList = asString.split("/n")	
	}

    int[] row(int rowNumber) {
		def row = []
		def rowAux = this.myList[rowNumber].split(" ")
		rowAux.each { row << Integer.parseInt(it) }
		return row
    }

    int[] column(int columnNumber) {
		
		def column = []
		for(row in myList) {
			def columnAux = row.split(" ")
			column << Integer.parseInt(columnAux[columnNumber])
		}

		return column
    }
	
	static void main(args) {
		println new Matrix('1').row(0)
		println new Matrix('11 32/n3 44').row(0)
		println new Matrix('11 32/n3 44').row(1)
		println new Matrix('11 32/n3 44').column(0)
		println new Matrix('11 32/n3 44').column(1)
	}
}