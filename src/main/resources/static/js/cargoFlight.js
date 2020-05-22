$('document').ready(function() {

	$('table #editButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(cargoFlight, status){
			$('#idEdit').val(cargoFlight.id);
			$('#departureCityEdit').val(cargoFlight.departureCity);
			$('#departureDateTimeEdit').val(cargoFlight.departureDateTime);
			$('#destinationCityEdit').val(cargoFlight.destinationCity);
			$('#arrivalDateTimeEdit').val(cargoFlight.arrivalDateTime);
			$('#passengersEdit').val(cargoFlight.passengers);
			$('#totalWeightEdit').val(cargoFlight.totalWeight);
			$('#maxWeightEdit').val(cargoFlight.maxWeight);
			$('#statusEdit').val(cargoFlight.status);
		});
		$('#editModal').modal();			
	});
		
	
	
	$('table #detailsButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(cargoFlight, status){
			$('#idDetails').val(cargoFlight.id);
			$('#departureCityDetails').val(cargoFlight.departureCity);
			$('#departureDateTimeDetails').val(cargoFlight.departureDateTime);
			$('#destinationCityDetails').val(cargoFlight.destinationCity);
			$('#arrivalDateTimeDetails').val(cargoFlight.arrivalDateTime);
			$('#passengersDetails').val(cargoFlight.passengers);
			$('#totalWeightDetails').val(cargoFlight.totalWeight);
			$('#maxWeightDetails').val(cargoFlight.maxWeight);
			$('#statusDetails').val(cargoFlight.status);
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
