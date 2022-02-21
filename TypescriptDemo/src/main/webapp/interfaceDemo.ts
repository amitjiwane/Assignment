interface IEmployee{
	empCode:number;
	empName:string;
	getEmployeeName(number):string;
	
}

let obj:IEmployee={
	empCode:121,
	empName:"amit",
	getEmployeeName(number):string{return "Amit";} //abstrat Methods
	};
console.log(obj.getEmployeeName(1));
console.log(obj);
console.log(obj.empCode);
console.log(obj.empName);

//===========================================================================
interface KeyValueProcessor{  //functional Interface
	(key:number, value:number):void;
}
function  addKeyValue(key:number, value:string):void{
    console.log(key+", "+value);
}
function  updateKeyValue(key:number, value:string):void{
    console.log(key+", "+value);
}
/*let myobj:KeyValueProcessor = addKeyValue;
myobj(1,"Amit");
let myobj1:KeyValueProcessor = updateKeyValue;
myobj(2,"Jiwane")*/;