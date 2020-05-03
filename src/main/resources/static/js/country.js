$('document').ready(function() {
	
	$('table #editButton').on('click', function(event){
		event.preventDefault();			
		var href = $(this).attr('href');	
		$.get(href, function(country, status){
			$('#idEdit').val(country.id);
			$('#countryNameEdit').val(country.countryName);
			$('#capitalEdit').val(country.capital);
			$('#codeEdit').val(country.code);

		});
		$('#editModal').modal();			
	});
		
	
	$('table #detailsButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(country, status){
			$('#idDetails').val(country.id);
			$('#nameDetails').val(country.countryName);
			$('#capitalDetails').val(country.capital);
			$('#codeDetails').val(country.code);

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