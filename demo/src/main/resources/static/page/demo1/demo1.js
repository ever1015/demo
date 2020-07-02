var hi = function(){};
$(function() {
	//jdbc
	$.ajax({
		url : home_IP() + '/demo/getUsers',
		dataType : 'json',
		data : {
//			endYear : $('#endYear').val()
		},
		success : function(data, status) {
			var str = "";
			for(var i = 0;i < data.length;i++){
				str += data[i].id + " ==== " + data[i].name + "<br />"
				
			}
			$("#div1").html(str)
		},
		error : function(err, status) {
		}
	});
	//mybatis
	$.ajax({
		url : home_IP() + '/demo/getUsers_mybatis',
		dataType : 'json',
		data : {
//			endYear : $('#endYear').val()
		},
		success : function(data, status) {
			var str = "";
			for(var i = 0;i < data.length;i++){
				str += data[i].id + " ==== " + data[i].name + "<br />"
				
			}
			$("#div2").html(str)
		},
		error : function(err, status) {
		}
	});
});