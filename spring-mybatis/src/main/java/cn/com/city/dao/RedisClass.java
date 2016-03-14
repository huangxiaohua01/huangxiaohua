package cn.com.city.dao;

import redis.clients.jedis.Jedis;

public class RedisClass {
	
	private static Jedis jedis=new Jedis("localhost"); 
	
	/**
	 * 获取redis数据
	 * @param key
	 * @return
	 */
	public static String getRedis(String key){
		
		String str=jedis.get(key);
		System.out.println(str);
		return str;
	}
	
	/**
	 * 设置redis数据
	 * @param str
	 */
	public static void setRedis(String key,String value){
		
		jedis.set(key, value);
	}
	public static void main(String[] args) {
		setRedis("test", "11");
		getRedis("test");
	}
	
}
