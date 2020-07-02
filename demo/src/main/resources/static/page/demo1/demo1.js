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
	//mybatis_注解
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
	//mybatis_xml
	$.ajax({
		url : home_IP() + '/demo/getUsers_mybatis2',
		dataType : 'json',
		data : {
//			endYear : $('#endYear').val()
		},
		success : function(data, status) {
			var str = "";
			for(var i = 0;i < data.length;i++){
				str += data[i].id + " ==== " + data[i].name + "<br />"
				
			}
			$("#div3").html(str)
		},
		error : function(err, status) {
		}
	});
});