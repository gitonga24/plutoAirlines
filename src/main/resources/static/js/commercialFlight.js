$('document').ready(function() {

	$('table #editButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(commercialFlight, status){
			$('#idEdit').val(commercialFlight.id);
			$('#departureCityEdit').val(commercialFlight.departureCity);
			$('#departureDateTimeEdit').val(commercialFlight.departureDateTime);
			$('#destinationCityEdit').val(commercialFlight.destinationCity);
			$('#arrivalDateTimeEdit').val(commercialFlight.arrivalDateTime);
			$('#passengersEdit').val(commercialFlight.passengers);
			$('#totalLuggagesEdit').val(commercialFlight.totalLuggages);
			$('#maxLuggagesEdit').val(commercialFlight.maxLuggages);
			$('#statusEdit').val(commercialFlight.status);
		});
		$('#editModal').modal();			
	});
		
	
	
	$('table #detailsButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(commercialFlight, status){
			$('#idDetails').val(commercialFlight.id);
			$('#departureCityDetails').val(commercialFlight.departureCity);
			$('#departureDateTimeDetails').val(commercialFlight.departureDateTime);
			$('#destinationCityDetails').val(commercialFlight.destinationCity);
			$('#arrivalDateTimeDetails').val(commercialFlight.arrivalDateTime);
			$('#passengersDetails').val(commercialFlight.passengers);
			$('#totalLuggagesDetails').val(commercialFlight.totalLuggages);
			$('#maxLuggagesDetails').val(commercialFlight.maxLuggages);
			$('#statusDetails').val(commercialFlight.status);
		});
		$('#detailsModal').modal();			
	});

	
	

		
	$('table #deleteButton').on('click', function(event){
		event.preventDefault();
		var href=$(this).attr('href');
		
		$('#confirmDeleteButton').attr('href', href);
		
		$('#deleteModal').modal();
	});
	

});
