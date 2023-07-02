package jp.macs.workweb.domain.entity;

@lombok.Data
public class DataTableColumn {

	private String data;
	private String title;
	private String value;
	private String type;
	private int width;
	private String action;
	private String actionData;
}
