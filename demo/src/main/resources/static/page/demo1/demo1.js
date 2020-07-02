var hi = function(){};
$(function() {
	$.ajax({
		url : home_IP() + '/demo/getUsers',
		dataType : 'json',
		data : {
//			endYear : $('#endYear').val()
		},
		success : function(data, status) {
			var str = "";
			for(var i = 0;i < data.length;i++){
				str += data[i].id + " ==== " + data[i].name + "/r/n"
				
			}
			$("#div1").html(str)
		},
		error : function(err, status) {
		}
	});
});