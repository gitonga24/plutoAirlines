$('document').ready(function() {

	$('table #editButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(operationsCity, status){
			$('#idEdit').val(operationsCity.id);
			$('#nameEdit').val(operationsCity.name);
			$('#cityCodeEdit').val(operationsCity.cityCode);
			$('#countryidEdit').val(operationsCity.countryid);
		});
		$('#editModal').modal();			
	});
		
	$('table #detailsButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(operationsCity, status){
			$('#idDetails').val(operationsCity.id);
			$('#nameDetails').val(operationsCity.name);
			$('#cityCodeDetails').val(operationsCity.cityCode);
			$('#countryidDetails').val(operationsCity.countryid);
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
