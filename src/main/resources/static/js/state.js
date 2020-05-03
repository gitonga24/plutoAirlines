$('document').ready(function() {

	$('table #editButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(state, status){
			$('#idEdit').val(state.id);
			$('#nameEdit').val(state.name);
			$('#capitalEdit').val(state.capital);
			$('#codeEdit').val(state.stateCode);
			$('#countryidEdit').val(state.countryid);
			$('#detailsEdit').val(state.details);
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
			$('#codeDetails').val(state.stateCode);
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
