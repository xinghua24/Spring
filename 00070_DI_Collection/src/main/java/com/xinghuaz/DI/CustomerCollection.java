package com.xinghuaz.DI;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CustomerCollection {
	private List<Object> list;
	private Set<Object> set;
	private Map<Object, Object> map;
	private Properties pro;

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public Set<Object> getSet() {
		return set;
	}

	public void setSet(Set<Object> set) {
		this.set = set;
	}

	public Map<Object, Object> getMap() {
		return map;
	}

	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}

	public Properties getPro() {
		return pro;
	}

	public void setPro(Properties pro) {
		this.pro = pro;
	}

	@Override
	public String toString() {
		return "CustomerCollection [\n"
				+ "list=" + list + ", \n"
				+ "set=" + set + ", \n"
				+ "map=" + map + ", \n"
				+ "pro=" + pro + "\n]";
	}

}
