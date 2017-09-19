$(function() {
	// Solving the active menu problem
	switch (menu) {
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
	default:
		if (menu == "Home")
			break;
		$('#listProducts').addClass('active');
		$('#a_' + menu).addClass("active");
		break;
	}

	// code for jQuery dataTable
	var $table = $("#productListTable");
	if ($table.length) {
		var jsonUrl = '';
		if (window.categoryId == '') {
			jsonUrl += window.contextRoot + "/json/data/all/products";
		} else {
			jsonUrl += window.contextRoot + "/json/data/category/" + window.categoryId + "/products";
		}
		var products = [ [ {
			data : ''
		} ] ];

		$table.DataTable({
			lengthMenu : [ [ 3, 5, 10, -1 ],
					[ '3 Records', '5 Records', '10 Records', 'ALL' ] ],
			pageLength : 5,
			ajax : {
				url : jsonUrl,
				dataSrc : ''
			},
			columns : [
				{
					data: 'code',
					bSortable: false,
					mRender: function(data, type, row){
						return '<img id="productList_Product_Image" src="' + window.contextRoot + '/resources/images/' + data + '.jpg" />';
					}
				},
				{
					data : 'name'
				}, 
				{
					data : 'brand'
				}, 
				{
					data : 'unitPrice',
					mRender: function(data, type, row){
						return "&#8360;. " + data;
					}
				}, 
				{
					data : 'quantity',
					mRender: function(data, type, row){
						if(data < 1) {
							return '<span style="color:red">Out Of Stock!</span>';
						}
						return data;
					}
				},
				{
					data: 'id',
					bSortable: false,
					mRender: function(data, type, row) {
						var links ='';
						links += '<a href="' + window.contextRoot + '/show/' + data + '/product" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a> ';
						links += '&#160;';
						if(row.quantity < 1) {
							links += '<a href="javascript:void(0)" class="btn btn-success disabled"><span class="glyphicon glyphicon-shopping-cart"></span></a>';
						}else {
							links += '<a href="' + window.contextRoot + '/cart/add/' + data + '/product" class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></span></a>';
						}
						
						return links;
					}
				}
			]
		});
	}
});