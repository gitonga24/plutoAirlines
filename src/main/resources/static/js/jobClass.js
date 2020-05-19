$('document').ready(function() {

	$('table #editButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(jobClass, status){
			$('#idEdit').val(jobClass.id);
			$('#JobClassDescriptionEdit').val(jobClass.JobClassDescription);

		});
		$('#editModal').modal();			
	});

	
	
	$('table #detailsButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(jobClass, status){
			$('#idDetails').val(jobClass.id);
			$('#JobClassDescriptionDetails').val(jobClass.JobClassDescription);

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
