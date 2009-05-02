package org.grails.paypal

class PaymentItem {
	BigDecimal amount
	String itemName
	String itemNumber
	Integer quantity = 1
	
	static belongsTo = [payment:Payment]

    static constraints = {
		itemName blank:false
		itemNumber blank:false
    }
}
