$('document').ready(function() {

	$('table #editButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(passengerCarrier, status){
			$('#idEdit').val(passengerCarrier.id);
			$('#nameEdit').val(passengerCarrier.name);
			$('#totalSeatsEdit').val(passengerCarrier.totalSeats);
			$('#lastMaintenanceDateEdit').val(passengerCarrier.lastMaintenanceDate);
			$('#manufactureYearEdit').val(passengerCarrier.manufactureYear);
			
		});
		$('#editModal').modal();			
	});
		
	$('table #detailsButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(passengerCarrier, status){
			$('#idDetails').val(passengerCarrier.id);
			$('#nameDetails').val(passengerCarrier.name);
			$('#totalSeatsDetails').val(passengerCarrier.totalSeats);
			$('#lastMaintenanceDateDetails').val(passengerCarrier.lastMaintenanceDate);
			$('#manufactureYearDetails').val(passengerCarrier.manufactureYear);
			
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
