package com.core.practiceprogramme;

import java.util.HashMap;

public class HasKeyImpl<T> implements HasKey<T> {

	private static volatile HashMap<Object, Object> map;
	public long lastAccessed = System.currentTimeMillis();
	public String value;

	@Override
	public String key(T t) {
		String key;
		synchronized (HasKeyImpl.class) {
			key = (String) map.get(t);

			if (key == null)
				return null;
			else {
				lastAccessed = System.currentTimeMillis();
				return key;
			}
		}
	}

}
