package com.pavanks.pavanks;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // entity will create the table
public class teacher {
@Id // creates primary key
	
		
		int t_id;
		String name;
		String subject;
		public teacher(int t_id, String name, String subject) {
			super();
			this.t_id = t_id;
			this.name = name;
			this.subject = subject;
		}
	}


