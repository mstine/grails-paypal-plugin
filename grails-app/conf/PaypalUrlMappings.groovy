import grails.util.*

class PaypalUrlMappings {
    static mappings = {
	  "/paypal/buy/$transactionId?"(controller:"paypal", action:"buy")	
	  "/paypal/notify/$buyerId/$transactionId"(controller:"paypal", action:"notify")
	  "/paypal/success/$buyerId/$transactionId"(controller:"paypal", action:"success")
	  "/paypal/cancel/$buyerId/$transactionId"(controller:"paypal", action:"cancel")		  
	
	   if(GrailsUtil.isDevelopmentEnv()) {
		 	"/paypal/test"(view:"/paypal/test")  
	   }
	}
}
