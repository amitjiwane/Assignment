class Person{
	name:string;
	constructor(name:string){
		this.name=name;
	}
}

class CompanyEmployee extends Person{
	empCode:number;
	constructor(empCode:number, empName:string){
		super(empName);
		this.empCode=empCode;
	}
	displayName():void{
		console.log(this.empCode+", "+this.name);
	}
}
let newObj:CompanyEmployee=new CompanyEmployee(1,"Amit");
newObj.displayName();