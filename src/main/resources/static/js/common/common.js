$(function() {
	var dataTable2 = $("#dataTable2");
	if (dataTable2.length > 0) {
		createTable(dataTable2);
	}
})

//カラムの設定
function createTable(dataTable2) {
	var columns = dataTable2.data("columns"),
		url = dataTable2.data("url");
	var options = {
		autoFill: true,
		autowidth: true,
		scrollCollapse: true,
		striped: true,
		searchable: true,
		searching: true

	};
	options.columns = columns;
	options.columnDefs = _setColumnDefs(columns);
	if (url != undefined) {
		options.ajax = {
			url: url,
			type: 'get',
			contentType: 'application/json',
			dataSrc: 'data'
		};
	}
	options.dom = '<"row"<"col-3"l><"col-4"f><"col-5 text-right"B>>rtip';
	//options.dom='<lf<t>ip>';


	console.log(options.columns);
	return dataTable2.dataTable(options);

}
//カラムの詳細設定
function _setColumnDefs(columns) {
	for (let index = 0; index < columns.length; index++) {
		let column = columns[index];
		let htmlStr;
		//編集と削除の時だけ
		if (column.type == "edit") {
			//render要素にデータ以外の色とかそういうのをhtmlで記載
			$.extend(column, {
				render: function(data, type, row, meta) {
					htmlStr="<a href='#'>編集</a>"
					return htmlStr;
				}
			});
		}
		if (column.type == "delete") {
			//render要素にデータ以外の色とかそういうのをhtmlで記載
			$.extend(column, {
				render: function(data, type, row, meta) {
					htmlStr="<a href='#'>削除</a>"
					return htmlStr;
				}
			});
		}
	}
}