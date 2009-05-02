package org.grails.paypal

class PaymentTests extends GroovyTestCase {
	void testValidatePayment() {
		def payment = new Payment()
		assert !payment.validate()
		
		PaymentItem paymentItem = new PaymentItem()
		
		paymentItem.amount = 10.00
		paymentItem.itemName = "iPod"
		paymentItem.itemNumber = "IP01901"
		
		payment.addToPaymentItems(paymentItem)
		
		payment.buyerId = 10
		
		assert payment.validate()
		
		assert payment.save(flush:true)
		
		assertTrue payment.transactionId.startsWith("TRANS-10-")
		
	}
}