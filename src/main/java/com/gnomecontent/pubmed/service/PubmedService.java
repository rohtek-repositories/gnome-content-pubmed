package com.gnomecontent.pubmed.service;

import java.io.IOException;

public interface PubmedService {
	
	public String getXmlData();
	public String downloadAndExtractGzFiles();
	
	public String searchAndSaveArticlesInMongo();
	public String searchAndSaveUmlArticlesInMongo();
	
	public String searchUmlsKeywordsByPhraseQuery();
	public String searchExcelKeywordsByPhraseQuery();
	
	public String extractText() throws IOException;
	public String getXmlDataBySaxParser();
	
	

}
