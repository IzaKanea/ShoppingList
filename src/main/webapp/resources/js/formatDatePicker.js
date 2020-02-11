$(document).ready(function() {
	$('.specialDatepicker').each(function(){
	    $(this).datepicker({
	       	format:'dd/mm/yyyy',
	       	todayBtn: true,
	       	todayHighlight: true,
	       	autoclose: true,
	       	orientation: "top"
	      });
	});
});