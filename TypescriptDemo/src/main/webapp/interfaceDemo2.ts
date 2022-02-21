interface IPerson{
	name:string;
	display():void;
}

interface IEmployee{
	empCode:number;
}

class Employee implements IEmployee,IPerson{
	name:string;
	empCode:number;
	
	constructor(empcode:number, empname:string){
		this.name=empname;
		this.empCode=empcode;
			}
    display(): void {
        console.log(this.name+" "+this.empCode);
    }
    
}
let obj1:IPerson=new Employee(121,"amit");
let obj2:IEmployee=new Employee(125,"Jiwane");
obj1.display;
console.log(obj2.empCode);