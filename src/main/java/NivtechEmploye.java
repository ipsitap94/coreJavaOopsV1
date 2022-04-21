
public class NivtechEmploye {
	public String Name;
	public long PhnNo;
	public String Code;
	public String Adress;
	
	

	public static void main(String[] args) {
		NivtechEmploye ipsita1 = new NivtechEmploye ("ipsita",9786546786l,"CDRESFHT","jagatpur");
		NivtechEmploye lipsita1 = new NivtechEmploye ("lpsita",9786546786l,"CDRESFJT","jagatpur");
		NivtechEmploye debasis1 = new NivtechEmploye ("debasis",9786546786l,"CDRESFVT","adaspur");
		
NivtechEmployeDetails(ipsita1);
NivtechEmployeDetails(lipsita1);
NivtechEmployeDetails(debasis1);

Getersetersampleone data=initializeEmployeobj("ipsita",9786546786l,"CDRESFHT","jagatpur");
		System.out.println(data.getName());
		System.out.println(data.getPhnNo());
		System.out.println(data.getCode());
		System.out.println(data.getAdress());
	}
		
	public static Getersetersampleone initializeEmployeobj(String Name,long PhnNo,String Code,String Adress) {
	Getersetersampleone obj1 = new Getersetersampleone()	;
	obj1.setName(Name);
	obj1.setPhnNo(PhnNo);
	obj1.setCode(Code);
	obj1.setAdress(Adress);
	return obj1;
	}
	
	
	public static void NivtechEmployeDetails(NivtechEmploye Employeobj) {
		System.out.println(Employeobj.toString());
	}
	
		
@Override
	public String toString() {
		return "NivtechEmploye [Name=" + Name + ", PhnNo=" + PhnNo + ", Code=" + Code + ", Adress=" + Adress + "]";
	}


public NivtechEmploye (String name,long phnno,String code,String adress){
	
	Name=name;
	PhnNo=phnno;
	Code=code;
	Adress=adress;
}
}




	


	
	
	
	

	



	

