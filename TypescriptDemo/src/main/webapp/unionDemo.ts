let code:(string | number | boolean);
code=123;
code="name";
code=true;

function displayType(code:string | number |boolean){
	if(typeof(code)==="number"){
		console.log("it is number");
	}
	else if(typeof(code)==="string"){
		console.log("it is string");
	}
	
	else if(typeof(code)==="boolean"){
		console.log("it is boolean");
	}
	else{
		console.log("something else");
	}
}

displayType(123);  //it show number
displayType("hello"); //it shows string
displayType(true); //it show boolean

//Any DataType

let anyDataType:any;
anyDataType = 12;
anyDataType = "john";
anyDataType = false;
anyDataType = [1,2,3,4,5]; //
anyDataType = {"name":"amit","surname":"Jiwane"}; //JSON
anyDataType = [[1,2,3],[4,5,6],[6,7,8]];
