package exercism

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.Month
import java.util.concurrent.TimeUnit
import groovy.time.*

class Gigasecond {
	
	static add() {}


	
	static main(args) {
		
		LocalDate myDate = LocalDate.of(2000,12, 01)
		
		println LocalDate.now()
		println TimeUnit.MILLISECONDS.toDays(1_000_000_000)
		println LocalDate.now().plusDays(TimeUnit.MILLISECONDS.toDays(1_000_000_000))
		println myDate.plusDays(TimeUnit.SECONDS.toDays(1_000_000_000)).atStartOfDay(ZoneId.systemDefault()).toInstant()
		println myDate.plusDays(TimeUnit.SECONDS.toDays(1_000_000_000)).class
		
		println Month.APRIL
		use (groovy.time.TimeCategory){
			println 1000000000.seconds.from.now
			Date aaa = Date.from(myDate.atStartOfDay(ZoneId.systemDefault()).toInstant())
			println aaa
		}
		
		println new Date()

	}	
}

/*

import java.time.LocalDate
import java.time.ZoneId
import java.time.Month
import java.util.concurrent.TimeUnit

class Gigasecond {

	// YOUR CODE HERE
	// HINT: methods that don't change the state of an object can be 'static'
	
	 def add(int year, Month month, int day){
		 
	LocalDate moment = LocalDate.of(year, month, day)
	LocalDate momentAdded = moment.plusDays(TimeUnit.SECONDS.toDays(1_000_000_000))
		 LocalDateTime.of(momentAdded.getDayOfMonth(), momentAdded.getMonth(), momentAdded.getYear(), 1, 46, 40)
		/*use (groovy.time.TimeCategory) {
			1_000_000_000.seconds.from.now
		}*/
	}

		 def add(LocalDate moment){
			   LocalDate momentAdded = moment.plusDays(TimeUnit.SECONDS.toDays(1_000_000_000))
			   LocalDateTime.of(momentAdded.getDayOfMonth(), momentAdded.getMonth(), momentAdded.getYear(), 1, 46, 40)
	}
}
*/
