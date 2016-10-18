package Person;
class PersonBulider{
		private Person person;
		
		public PersonBulider(){
		person=new Person();	
		}
		
		public Person bulid() throws Exception{
			if(person.getName()==null)
				throw new Exception("B�ad tworzenia obiektu: nie zdefinowano Imienia");
			if(person.getNr()==0)
				throw new Exception("B�ad tworzenia obiektu: nie zdefinowano Numeru");
			if(person.getSurname()==null)
				throw new Exception("B�ad tworzenia obiektu: nie zdefinowano Nazwiska");
			if(person.getPesel()==null)
				throw new Exception("B�ad tworzenia obiektu: nie zdefinowano Peselu");
			 return person;
			 
		}
	
		public PersonBulider withName(String Name){
			person.setName(Name);
			return this;
		}
		
		public PersonBulider withNr(int Nr){
			person.setNr(Nr);
			return this;
		}
		
		public PersonBulider withSurname(String Surname){
			person.setSurname(Surname);
			return this;
		}
		
		public PersonBulider withPesel(String Pesel){
			person.setPesel(Pesel);
			return this;
		}
}