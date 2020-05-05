$('document').ready(function() {

	$('table #editButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(cargoCarrier, status){
			$('#idEdit').val(cargoCarrier.id);
			$('#nameEdit').val(cargoCarrier.name);
			$('#capitalEdit').val(cargoCarrier.capacity);
			$('#codeEdit').val(cargoCarrier.lastMaintenanceDate);
			$('#manufactureYearEdit').val(cargoCarrier.manufactureYear);
			
		});
		$('#editModal').modal();			
	});
		
	$('table #detailsButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(cargoCarrier, status){
			$('#idDetails').val(cargoCarrier.id);
			$('#nameDetails').val(cargoCarrier.name);
			$('#capitalDetails').val(cargoCarrier.capacity);
			$('#codeDetails').val(cargoCarrier.lastMaintenanceDate);
			$('#countryidDetails').val(cargoCarrier.manufactureYear);
			$('#detailsDetails').val(cargoCarrier.details);
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
