package exercism

class TwoFer {

	static String twoFer(String name= 'you') {

		"One for ${name}, one for me."
	}


	static void main(args) {
		println TwoFer.twoFer('Alice')
		println TwoFer.twoFer('')
		println TwoFer.twoFer()
	}

}