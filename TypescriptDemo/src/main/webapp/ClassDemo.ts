class Student{
	studRollNo:number;
	studName:string;
	
	constructor(enrollment:number, name:string){
		this.studRollNo=enrollment;
		this.studName=name;
	}
	
	getName():string{
		return this.studName;
	}
	
	getRollNo():number{
		return this.studRollNo;
	}
	
	}
	let std:Student =new Student(121,"amit");
	console.log(std.getName);
	console.log(std.getRollNo);
