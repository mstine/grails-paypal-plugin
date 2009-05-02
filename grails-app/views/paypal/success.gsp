<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<title>Transaction Complete</title>		
	</head>
	<body id="body">
		Your purchase is complete. Information for your reference can be seen below:
		<div id="transactionSummary" class="transactionSummary">
			<div class="transSummaryItem">
				<span class="transSummaryItemName">Transaction ID:</span>
				<span class="transSummaryItemValue">${payment.transactionId}</span>				
			</div>
			<g:each in="${payment.paymentItems}" var="paymentItem">
				<div class="transSummaryItem">
					<span class="transSummaryItemName">Item Name:</span>
					<span class="transSummaryItemValue">${paymentItem.itemName}</span>				
				</div>			
				<div class="transSummaryItem">
					<span class="transSummaryItemName">Quantity:</span>
					<span class="transSummaryItemValue">${paymentItem.quantity}</span>				
				</div>			
				<div class="transSummaryItem">
					<span class="transSummaryItemName">Price:</span>
					<span class="transSummaryItemValue">${paymentItem.amount * paymentItem.quantity}</span>				
				</div>			
			</g:each>						
		</div>
	</body>
</html>