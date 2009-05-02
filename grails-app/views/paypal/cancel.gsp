<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<title>Transaction Cancelled</title>		
	</head>
	<body id="body">
		Your purchase transaction has been cancelled. Information about the items you planned to purchase can be seen below:
		<div id="transactionSummary" class="transactionSummary">
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