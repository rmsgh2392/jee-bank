package com.web.bank.constants;

import java.io.File;

public class Constant {
	public static final String FILE_PATH = String.format
			("C:%sUsers%suser%seclipes-jee%sjee-bank%sWebContent%sresources%stxt%s"
					,File.separator
					,File.separator
					,File.separator
					,File.separator
					,File.separator
					,File.separator
					,File.separator
					,File.separator
					                 );
	public static final String VIEW_PATH = "WEB-INF/views/%s/%s.jsp";
}
