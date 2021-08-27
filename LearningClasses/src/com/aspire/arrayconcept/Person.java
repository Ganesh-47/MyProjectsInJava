package com.aspire.arrayconcept;


public class Person {
	    private String name="";
	    private long aadar=0;
	    private int age=0;
	    
		public String getName() {
			return name;
		}
		public void setName(String name) throws Exception {
			int nameLength=name.length();
			String lowercaseName=name.toLowerCase();
			char[] chars = lowercaseName.toCharArray();
			if(nameLength<2&&nameLength>15) {
				throw new Exception("Name Shouldn't be have minimum 2 character and not more than 15");
			}
		      for(char c : chars){
		    	  int ascii=c;
		         if(ascii<97 || ascii>122){
		            throw new Exception("Name Shouldn't contains Numbers");
		         }
		      }
			this.name = name;
		}
		public long getAadar() {
			return aadar;
		}
		public void setAadar(long aadar) throws Exception {
			String test=String.valueOf(aadar);
			if(test.length()==12){
			this.aadar = aadar;
			}
			else{
				throw new Exception("Entered Aadar number is not valid");
			}
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) throws Exception {
			if(age < 18) {
				throw new Exception("Age shouldn't be less than 18 ");
			}
			else {
				this.age = age;
			}
		}
		
		
}
