( function(){
	
	JQuery.MacsGrid={
		
		create: function(tableObj){
			return _create(tableObj);
		},
		reload: function(tableID,callbackFun){
			this.table(tableID).ajax.reload(callbackFun,true);
		},
		draw:function(tableID){
			this.table(tableID).draw();
		},
		table:function(tableID){
			if(tableID){
				return $(".dataTable").DataTable().tables("#" + tableID);
			}else{
				return $(".dataTable").DataTable();
			}
		},
		getSelectData: function(tableID)
		{
			_getSelectData(tableID);
		}
	};//MacsGrid終了
	
	
	function _create(_obj){
	var columns=_obj.data("columns"),
		data=_obj.data("datasource"),
		url=_obj.data("url"),
		ajaxData=_obj.data("ajaxparam"),
		actions=_obj.data("actions"),
		searching=_obj.data("searching"),
		info=_obj.data("info"),
		paging=_obj.data("paging"),
		lengthChange=_obj.data("lengthchange"),
		pageLength=_obj.data("pagelength");
		var options={
			scrollY:300,
			scrollX:true,
			autoFill:true,
			autowidth: false,
			scrollCollapse:true,
			striped:true,
			searching:false,
			lengthChange:false
		};
		if(columns != undefined){
			options.columns=columns;
			options.columnDefs=_setColumnDefs(columns);
		}
		//ボタン設定
		if(actions!=undefined){
			options.dom= '<"<" col-3"l><"col-4"f><"col-5 col-align-right"B>>rtip'
			options.buttons=[{
				extend:'csv',
				text: 'CSV',
				charset:'utf-8',
				bom:true,
				extension:'.csv',
				fieldSeparator:',',
				className:'btn bn-primary btn-sm'
			}];
		}
		//データ源を設定
		if(url!=undefined){
			options.ajax={
				url:url,
				type:'get',
				contentType:'application/json',
				dataSrc:'data',
			};
			if(ajaxData!=undefined){
				if(typeOf(ajaxData.constructor)==='function'){
					options.ajax.data=eval(ajaxData);
				}else{
					options.ajax.data=ajaxData;
				}
			}
			options.processing=true;
			options.serverSide=true;
		}else if(data!=undefined){
			options.data=data;
		}
		if(searching!=undefined){
			options.searching=searching;
		}
		if(info!=undefined){
			options.info=info;
		}
		if(paging!=undefined){
			options.paging=paging;
		}
		if(lengthChange!=undefined){
			options.lengthChange=lengthChange;
		}
		if(pageLength!=undefined){
			options.pageLength=pageLength;
		}
		_removeAttr(_obj);
		return _obj.DataTable(options);
	}//_create終了
	
	const COLLUMN_TYPE_EDIT="edit";
	const COLLUMN_TYPE_DELEET="delete";
	const COLLUMN_TYPE_DETAIL="detail";
	const COLLUMN_TYPE_CHECK="check";
	const COLLUMN_TYPE_NUMBER="number";
	const COLLUMN_TYPE_CURRENCY="currency";
	
	function _setColumnDefs(columns){
		if(columns && columns.length>0){
			for(let index=0;index<columns.length; index++){
				let column=columns[index];
				let colData=column.data;
				let type=olumn.type;
				let action=column.action ? column.action.split(":"):null;
				let actionData=column.actionData? column.actionData.split(","):null;
				let className;
				let htmlStr;
				if(type){
					switch (type){
						case  COLLUMN_TYPE_EDIT:
						case  COLLUMN_TYPE_DELEET:
						case  COLLUMN_TYPE_DETAIL:
						case  COLLUMN_TYPE_EDIT:
							className="col-align-center";
							if (action){
								if(action[0] ==='url')
									htmlStr='<a href="' + action[1] + '{0}"><span class="img-' + type + '"></span></a>';
								else
									htmlStr='<a href="#" onclick=' + action[0] + '({0})><span class="img-' + type + '"></span></a>';
							}
							break;
							
							case COLLUMN_TYPE_NUMBER:
							case COLLUMN_TYPE_CURRENCY:
								className="col-align-right";
								break;
							case COLLUMN_TYPE_CHECK:
							htmlStr='<input type="checkbox" name="macsGridChk_{rowNum}" onclick=onMacsGridSelect(this) />'
							break;
							default:
							if(action)
								if(action[0]==='url')
									htmlStr= '<a href="'+action[1] +'{0}">' + colData + '</a>';
								else
									htmlStr= '<input type="checkbox" name="macsgridChk_{rowNum}" onclick=onMacsGridSelect(this)/>';
									
					}
					if(className) $.extend(column,{className:className});
				}
				if(htmlStr){
					$.extend(column,{
						render:function(data,type,row,meta){
							if(tyope==='display'){
								let param="";
								if(actionData){
									if(action[0]==='url'){
										param+="?";
										for(let index = 0;index<actionData.length; index++){
											param+=actionData[index] + "=" + data[actionData[index]];
											if(index!=actionData.length-1){
												param+="&";
											}
										}
									}else{
										for (let index=0;index < actionData.length; index++){
											param+="'" + data[actionData[index]]+ "'";
											if(index!=actionData.length-1){
												param+=",";
											}
										}
									}
								}
								data=htmlStr.replace('{0}',param).replace("{rowNum}",meta.row);
							}
							return data;
						}
					});
				}
			}
		}
	}//_setColumnDefs終了
	
}())