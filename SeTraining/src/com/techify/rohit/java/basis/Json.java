package com.techify.rohit.java.basis;

import com.google.gson.JsonArray;

public class Json {
public void makeJson(){
	Jsonobect obj = new Jsonobject();
	String name = "Ravi", age="25";//local variable
	String name2 = "Prakash", age2="26";
	obj.put("name", name);
	obj.put("name", age);
	{
obj =new Jsonobject();//It will store new values into the existing
obj.put("name",name2);
obj.put("age", age2);
objA.put(obj);
get.Json(objA);//Passing the Json array to another method
public void getJson(JsonArray objA){
	Jsonobject obj = new Jsonobject();
	for(int i=0; i< objA.length(); i++){
		obj = objA.getJsonobj();
		Sring name = obj.get("name");
		age = obj.get("age");
	}
}

