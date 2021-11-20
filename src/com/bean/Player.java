package com.bean;

public class Player {
	
		private int jno;
		private String pname;
		public int getJno() {
			return jno;
		}
		public void setJno(int jno) {
			this.jno = jno;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		@Override
		public String toString() {
			return  jno + "\t" + pname ;
		}
		
}
