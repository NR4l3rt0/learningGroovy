package exercism

import java.lang.StringBuilder

class SecretHandshake {

    static List<String> commands(int number) {
		
		def myList = []
        def binaryNum = String.format("%5s", Integer.toBinaryString(number)).replace(' ', '0')

        for(int i = binaryNum.length()-1; i >= 0 ; i--){

            if (binaryNum[i] == Integer.toString(1)) {
                switch (i) {
                    case "4":
                        myList << "wink"
                        break; 
                    case "3":
                        myList << "double blink"
                        break; 
                    case "2":
                        myList << "close your eyes"
                        break; 
                    case "1":
                        myList << "jump"
                        break; 
                    case "0":
                        myList = myList.reverse()
                        break; 
                }
            }
        }
    return myList
    }
	
	static void main(args) {
		println SecretHandshake.commands(19)
		println SecretHandshake.commands(3)
	}
}
