package com.example.json.test;

import com.example.json.JSONParserUtils2;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 * @author Kwok
 */
public class JSONParserUtils2Test {

	
	@Test
	public void jsonToMapTest() throws IOException{
		
		Map<String,Object> map = JSONParserUtils2.jsonToMap(IOUtils.resourceToString("/test2.json",Charset.defaultCharset()), null);
		
		Set<Entry<String, Object>> mapSet =  map.entrySet();
		for (Entry<String, Object> entry : mapSet) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
		
//		System.out.println(JSONParserUtils2.mapToJson(map));
		
	}
	
	
	@Test
	public void jsonToPropertiesTest() throws IOException{
		
		Properties props = JSONParserUtils2.jsonToProperties(IOUtils.resourceToString("/test1.json",Charset.defaultCharset()));
		
		Set<Entry<Object, Object>> propSet =  props.entrySet();
		for (Entry<Object, Object> entry : propSet) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
		
		System.out.println(JSONParserUtils2.propertiesToJson(props));
		
	}
	
}
