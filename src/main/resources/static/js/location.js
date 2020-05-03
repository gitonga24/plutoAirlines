$('document').ready(function() {

	$('table #editButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(state, status){
			$('#idEdit').val(state.id);
			$('#nameCity').val(location.city);
			$('#addressEdit').val(location.address);
			$('#codeEdit').val(state.code);
			$('#countryidEdit').val(location.countryid);
			$('#detailsEdit').val(location.details);
		});
		$('#editModal').modal();			
	});
		
	$('table #detailsButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(state, status){
			$('#idDetails').val(state.id);
			$('#nameDetails').val(state.name);
			$('#capitalDetails').val(state.capital);
			$('#codeDetails').val(state.code);
			$('#countryidDetails').val(state.countryid);
			$('#detailsDetails').val(state.details);
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
