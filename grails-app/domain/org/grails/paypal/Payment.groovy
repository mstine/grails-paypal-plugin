package org.grails.paypal

class Payment {
	static final PENDING = 'PENDING'
	static final INVALID = 'INVALID'
	static final FAILED = 'FAILED'
	static final COMPLETE = 'COMPLETE'	
	static final CANCELLED = 'CANCELLED'	
	
	static hasMany = [paymentItems:PaymentItem]
	
	List paymentItems	
	String transactionId
	String paypalTransactionId
	String status = PENDING	
	Currency currency = Currency.getInstance("USD") // default to USD
	Long buyerId
	
	transient beforeInsert = {
		transactionId = "TRANS-$buyerId-${System.currentTimeMillis()}"
	}
	
	String toString() { "Payment: ${transactionId ?: 'not saved'}"}
	
	static constraints = {
		status inList:[PENDING, INVALID, FAILED,COMPLETE,CANCELLED]
		transactionId nullable:true
		paypalTransactionId nullable:true
	}
}