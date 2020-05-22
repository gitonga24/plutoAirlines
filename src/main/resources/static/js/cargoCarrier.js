$('document').ready(function() {

	$('table #editButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(cargoCarrier, status){
			$('#idEdit').val(cargoCarrier.id);
			$('#nameEdit').val(cargoCarrier.name);
			$('#maxWeightEdit').val(cargoCarrier.maxWeight);
			$('#lastMaintenanceDateEdit').val(cargoCarrier.lastMaintenanceDate);
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
			$('#maxWeightDetails').val(cargoCarrier.maxWeight);
			$('#lastMaintenanceDateDetails').val(cargoCarrier.lastMaintenanceDate);
			$('#manufactureYearDetails').val(cargoCarrier.manufactureYear);
		
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
