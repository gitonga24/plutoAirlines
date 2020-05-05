$('document').ready(function() {

	$('table #editButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(passengerCarrier, status){
			$('#idEdit').val(passengerCarrier.id);
			$('#nameEdit').val(passengerCarrier.name);
			$('#capitalEdit').val(passengerCarrier.capacity);
			$('#codeEdit').val(passengerCarrier.lastMaintenanceDate);
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
			$('#capitalDetails').val(passengerCarrier.capacity);
			$('#codeDetails').val(passengerCarrier.lastMaintenanceDate);
			$('#countryidDetails').val(passengerCarrier.manufactureYear);
			$('#detailsDetails').val(passengerCarrier.details);
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
