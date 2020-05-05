$('document').ready(function() {

	$('table #editButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(destinationCity, status){
			$('#idEdit').val(destinationCity.id);
			$('#nameEdit').val(destinationCity.name);
			$('#capitalEdit').val(destinationCity.cityCode);
		});
		$('#editModal').modal();			
	});
		
	$('table #detailsButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(destinationCity, status){
			$('#idDetails').val(destinationCity.id);
			$('#nameDetails').val(destinationCity.name);
			$('#capitalDetails').val(destinationCity.cityCode);
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
