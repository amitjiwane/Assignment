interface IPerson{
	name:string;
	gender:string
}

interface IEmployee extends IPerson{
	empCode:number
}

let obj:IEmployee