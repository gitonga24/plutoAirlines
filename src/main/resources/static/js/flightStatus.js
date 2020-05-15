$('document').ready(function() {

	$('table #editButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(flightStatus, status){
			$('#idEdit').val(flightStatus.id);
			$('#statusEdit').val(flightStatus.status);

		});
		$('#editModal').modal();			
	});

	
	
	$('table #detailsButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(flightStatus, status){
			$('#idDetails').val(flightStatus.id);
			$('#statusDetails').val(flightStatus.status);

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
